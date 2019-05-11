package controller.backgroundcontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Administrator;
import pojo.AdministratorExample;
import service.AdministratorService;

import java.util.List;

@Controller
public class LoginController {

    private static org.apache.log4j.Logger logger= Logger.getLogger(LoginController.class);//新建logger日志记录器

    @RequestMapping(value = "/",method = RequestMethod.GET)//跳转首页
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
        return modelAndView;
    }

    @Autowired
    private AdministratorService administratorService;//自动装配，创建一个私有的服务层

    @RequestMapping(value = "/index", method = RequestMethod.POST)//登录界面判断
    public ModelAndView ind(String name, String password){//接登录界面的账户密码

        ModelAndView an = new ModelAndView();//新建一个视图对象
        an.setView(new MappingJackson2JsonView());
        if (name != null &&(! name.equals(""))){//判断名称的不为空，
            AdministratorExample example = new AdministratorExample();//创建Example对象
            AdministratorExample.Criteria criteria = example.createCriteria();//创建查询条件
            criteria.andNameEqualTo(name);//查询数据库中的用户名
            List<Administrator> adminis = administratorService.selectByExample(example);//查询数据库中的用户名，返回一个集合
            logger.info("判断查询结果");
            if (adminis != null){//判断返回的集合不是空的
                Administrator administrator = adminis.get(0);//用户名唯一，查询第一个用户名
                logger.info("判断密码");
                if ((administrator.getPassword()).equals(password)){//判断用户输入密码和数据库中这个用户名的密码一致
                    logger.info(adminis);//输出数据库中查询到的用户名密码
                    logger.info("向页面传值");
                    an.addObject("code",1000);
                    an.addObject("message","登录成功");
                    an.addObject("administrator",administrator);//向页面输出用户名密码
                    logger.info("登录成功");
                }else{
                    logger.error("密码错误");
                    throw new RuntimeException("密码错误");
                }
            }else{
                logger.error("用户名不存在");
                throw new RuntimeException("用户名不存在");
            }
        }else{
            logger.error("用户名为空");
            throw new RuntimeException("用户名为空");
        }
//        an.addObject("code",1000);
//        an.addObject("message","用户名为空或账密错误");
        return an;
    }
}