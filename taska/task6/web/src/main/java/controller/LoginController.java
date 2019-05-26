package controller;

import controller.util.CookieController;
import controller.util.JJwtUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import pojo.UserExample;
import service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static controller.util.EncryptionMd5.getMD5;

@Controller
public class LoginController {

    org.apache.log4j.Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/u/login",method = RequestMethod.POST)//登录界面
    public ModelAndView login(String name,String password, HttpServletResponse response) throws Exception {
        ModelAndView lo = new ModelAndView();

        if (name != null && (!name.equals("")) && password != null && (!password.equals(""))){//判断登录用户名密码不为空
            String ssr = getMD5(password);//将密码加密

            UserExample example = new UserExample();//新建一个example对象
            UserExample.Criteria criteria = example.createCriteria();//新建条件
            criteria.andNameEqualTo(name);//获取姓名查询
           List<User> list = userService.selectByExample(example);//查询数据库中有这个姓名
            logger.info("查询数据库中有这个用户");
            if (list != null){//list不为空
                User user1 = list.get(0);//账号名字唯一
                logger.info("判断数据库中的密码与用户输入的密码一致");
                if ((user1.getPassword()).equals(ssr)){//数据库中加密的密码和登录加密的密码一致

                    String token= JJwtUtils.createToken(user1.getId(),user1.getCreateat(),360000);//
                    CookieController.createCookie("name",token,response);

                    long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//这个是你要转成后的时间的格式
                    String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间

                    user1.setUpdateat(sd);
                    userService.updateByPrimaryKeySelective(user1);

                    lo.addObject("message","登录成功");
                    lo.setViewName("index");
                }else{
                    lo.setViewName("login");
                }
            }else{
                lo.setViewName("login");
            }
        }else{
            lo.setViewName("login");
        }
        return lo;
    }




    @RequestMapping(value = "/u/registered",method = RequestMethod.POST)//注册界面
    public ModelAndView registered(String name, String password){
        ModelAndView mo = new ModelAndView();
        logger.info(name);
        logger.info(password);
        if (name != null && (!name.equals("")) && password != null && (!password.equals(""))){//判断用户名密码不为空
            logger.info("判断账号密码不为空");
            UserExample example = new UserExample();//新建一个example对象
            UserExample.Criteria criteria = example.createCriteria();//新建条件
            criteria.andNameLike(name);//获取姓名查询数据库中
            int ro = (int) userService.countByExample(example);//查询数据库中没有这个姓名
            logger.info("判断数据库中没有相同的用户名");
            if (ro == 0){//数据库中的用户名为空


                User user = new User();//新建个用户对象
                long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//这个是你要转成后的时间的格式
                String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间

                logger.info(sd);
                String ssr = getMD5(password);//将用户的密码加密
                user.setName(name);//获取当前用户名
                user.setPassword(ssr);//将加密后的密码替换
                user.setCreateat(sd);//获取创建时间
                user.setUpdateat(sd);//获取更新时间
                System.out.println(user);
                int row = userService.insertSelective(user);//更新到数据库中
                if (row == 1){
                    logger.info("新增成功");
                    mo.setViewName("login");
                }else{
                    logger.info("增加失败");
                    mo.setViewName("registered");
                }
            }else{
            logger.info("增加失败");
                mo.setViewName("registered");
            }
        }else{
            logger.info("判断失败");
            mo.setViewName("registered");
        }
        return mo;
    }


    @RequestMapping(value = "/u/exit",method = RequestMethod.GET)
    public ModelAndView exit(HttpServletRequest request, HttpServletResponse response){//接收页面的请求并返回响应
        ModelAndView exit = new ModelAndView();

        Cookie cookie = CookieController.getCookie("name",request);//遍历出叫name的cookie
        String token = cookie.getValue();//取出cookie中的值token

        CookieController.deletaCookie("name",token,response);//替换掉这个cookie

        exit.setViewName("index");
        return exit;

    }


    /**
     * 页面跳转
     * */

    @RequestMapping(value = "/u/log",method = RequestMethod.GET)//跳转到登录界面
    public ModelAndView log(){
        ModelAndView log = new ModelAndView("login");
        return log;
    }

    @RequestMapping(value = "/u/regis",method = RequestMethod.GET)//跳转到注册界面
    public ModelAndView regis(){
        ModelAndView regis = new ModelAndView("registered");
        return regis;
    }

    @RequestMapping(value = "/u/vip",method = RequestMethod.GET)
    public ModelAndView vip(){
        ModelAndView vip = new ModelAndView();
        vip.setViewName("vipvip");
        return vip;
    }
}
