package Intercept;

import controller.util.CookieController;
import controller.util.JJwtUtils;
import io.jsonwebtoken.Claims;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IntercepeController implements HandlerInterceptor {

    org.apache.log4j.Logger logger = Logger.getLogger(IntercepeController.class);

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("判断登录后加的cookie存不存在");
        // 获得请求路径的uri
        Cookie cookie = CookieController.getCookie("name", request);

        // 判断路径是登出还是登录验证，是这两者之一的话执行Controller中定义的方法
        logger.info("判断cookie是否为空");
        if (cookie == null){//判断没有这个cookie
            response.getWriter().write("请登录后操作");//给http返回文本信息
            response.sendRedirect("/u/log");//返回登陆界面
            return false;
        }
        logger.info("校验数据是否一致");
        String value = cookie.getValue();//获得cookie的值
        Claims claims = JJwtUtils.parseJWT(value);//获得解密后的jwt的值
        Integer id = claims.get("id", Integer.class);
        String time = claims.get("createat", String.class);
        logger.info("校验数据是否和数据库中一致");
        User user = userService.selectByPrimaryKey(id);//查询数据库中id的数据
        if (user.getCreateat().equals(time)){//对比数据库的时间和页面cookie的时间
            return true;
        } else {
            logger.info("校验数据不一致 返回登陆页");
            response.getWriter().write("请重新登录后操作");
            response.sendRedirect("/u/log");
            return false;
        }
    }

    //postHandle 后处理回调方法，实现处理器的后处理（但在渲染视图之前）
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }
    // afterCompletion  整个请求处理完毕回调方法，可以在此记录结束时间并输出消耗时间，
    // 还可以进行一些资源清理，类似于try-catch-finally中的finally，
    // 但仅调用处理器执行链中preHandle返回true的拦截器的afterCompletion。
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
