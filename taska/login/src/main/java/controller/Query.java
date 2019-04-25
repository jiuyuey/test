package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Page;
import pojo.User;
import service.UserService;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
@Controller
public class Query {

    @Autowired
    private UserService userService;

//页面跳转功能，同时可以刷新
    @RequestMapping(value = "/onpage", method = RequestMethod.GET)
    public ModelAndView onpage(Integer pageNo){
        ModelAndView one = new ModelAndView();
        if (pageNo != null && pageNo > 0){
            int pageSize = 20;//每页20行数据
            int Start = (pageNo - 1) * 20;
            List<User> dd = userService.selectAll(Start,pageSize);//返回数据库中的数据
            one.addObject("dd", dd);
            one.setViewName("second");
            return one;
        }
        return new ModelAndView("second");
    }


    @RequestMapping(value = "/increase", method = RequestMethod.GET)//用户增加界面
    public ModelAndView insert(User user) {
        long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
        String sd = sdf.format(new Date(timeStamp));   // 时间戳转换成时间
//        System.out.println(sd);//打印出你要的时间
        user.setCreateat(sd);
        user.setUpdateat(sd);
        ModelAndView anm = new ModelAndView();
        System.out.printf(String.valueOf(user));
        User ll = userService.insert(user);

        anm.setViewName("second");//返回操作界面
        return anm;
    }
}
