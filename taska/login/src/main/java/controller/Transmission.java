package controller;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Admin;
import pojo.User;
import service.UserService;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class Transmission {

    @RequestMapping(value = "/", method = RequestMethod.GET)//打开首页
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)//登录界面判断
    public ModelAndView ind(Admin admin){//接登录界面的账户密码
        ModelAndView an = new ModelAndView();
        if(admin.getName()!=null&&!admin.getName().equals("")&&admin.getPass()!=null&&!admin.getPass().equals("")){//判断账户密码是否有问题
            List<Admin> m = userService.findThe(admin);
        if (m !=null&&m.size()==1) {//对在数据库查询后的m进行判断
            an.addObject("name",m);//可返回一个用户名
            an.addObject("pass",m);
//            List<User> dd = userService.selectAll(user);//可在登录后的界面打开的同时，接收所有数据表
//            an.addObject("dd", dd);
            an.setViewName("second");
            return an;
        }else{
            return new ModelAndView("userpage");//账号密码错误，跳转登录失败界面
        }}else {
            return new ModelAndView("userpage");//没有输入账号密码，跳转登录失败界面
        }
    }

    @RequestMapping(value = "/userpage", method = RequestMethod.GET)//登录失败界面，返回登录界面
    public String second(){
        return "index";
    }




    @RequestMapping(value = "/update", method = RequestMethod.GET)//用户修改页面
    public ModelAndView update(User user) {
        long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
        SimpleDateFormat scsadf=new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
        String sbvsdsd = scsadf.format(new Date(timeStamp));   // 时间戳转换成时间
//        System.out.println(sd);//打印出你要的时间
        user.setCreateat(sbvsdsd);
        user.setUpdateat(sbvsdsd);
        ModelAndView annnn = new ModelAndView();
        List<User> gg = userService.update(user);

        annnn.setViewName("second");//返回操作界面
        return annnn;
    }

    @RequestMapping(value = "/upd", method = RequestMethod.GET)//用户删除界面
    public ModelAndView delete(int id) {

        ModelAndView anm = new ModelAndView(); //注意要用id接删除的行的id，用user接可以用，但容易冲突
        User ee = userService.delete(id);

        anm.setViewName("second");//返回操作界面
        return anm;
    }
}
