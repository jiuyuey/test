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

@Controller
@RequestMapping(value = "/m/user")
public class UserController {

    private static org.apache.log4j.Logger logger = Logger.getLogger(UserController.class);//创建私有的logger记录器

    @Autowired
    private AdministratorService administratorService;

    @RequestMapping(value = "/increase", method = RequestMethod.GET)//新增账号，用get方法
    public ModelAndView increase(Administrator administrator) {//接页面传入的参数
        ModelAndView an = new ModelAndView();//新建一个视图对象
        if (administrator.getName() != null && (!administrator.getName().equals(""))) {//判断账号不空
            AdministratorExample administratorExample = new AdministratorExample();//新建一个example对象
            AdministratorExample.Criteria criteria = administratorExample.createCriteria();//新建一个条件
            criteria.andNameEqualTo(administrator.getName());//条件中接入页面传入的账号
            long count = administratorService.countByExample(administratorExample);//计数数据库中有没有重复的账号，并换回一个值
            logger.info("判断用户名不重复");
            if (count == 0) {//判断没有重复的
                int row = administratorService.insertSelective(administrator);//将页面传入的值新增进数据库
                logger.info("判断行数");
                if (row == 1) {//判断是否新增成功
                    logger.info("新增成功");
                    an.addObject("code", 1001);
                    an.addObject("message", "新增成功");
                } else {
                    logger.error("增加失败");
                    an.addObject("code", 1002);
                    an.addObject("message", "新增失败");
                }
            } else {
                logger.error("用户名重复");
                an.addObject("code", 1002);
                an.addObject("message", "用户名重复");
            }
        } else {
            logger.error("用户名为空");
            an.addObject("code", 1002);
            an.addObject("message", "用户名为空");
        }
        an.setView(new MappingJackson2JsonView());
        return an;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)//删除用户，用delete方法进行数据库操作
    public ModelAndView deleteuser(Integer id) {//接入页面的id
        ModelAndView mo = new ModelAndView();//新建一个视图对象
        logger.info("删除并记录");
        int row = administratorService.deleteByPrimaryKey(id);//根据id删除数据库中id所在行，并返回一个受到影响的行数
        logger.info("判断是否删除");
        if (row != 0) {//判断受影响行数不为0
            mo.addObject("code", 1003);
            mo.addObject("message", "删除成功");
            logger.info("删除成功");
        } else {
            logger.error("删除失败");
            mo.addObject("code", 1004);
            mo.addObject("message", "删除失败");
        }
        mo.setView(new MappingJackson2JsonView());
        return mo;
    }


    @RequestMapping(value = "/change", method = RequestMethod.PUT)//修改账号id，密码不能为空，用put方法进行数据库操作
    public ModelAndView change(Administrator administrator) {//接入页面传入的值
        ModelAndView no = new ModelAndView();//新建一个视图对象
        no.setView(new MappingJackson2JsonView());//格式化输入
        logger.info("判断值不为空");
        Administrator administrator1 = new Administrator();//新建一个对象，接值用
        if (administrator.getName() != null && (!administrator.getName().equals(""))) {//判断账户不为空
            AdministratorExample example = new AdministratorExample();//新建一个example对象
            AdministratorExample.Criteria criteria = example.createCriteria();//新建一个条件
            criteria.andNameEqualTo(administrator.getName());//条件中放入页面传入的账户名
            long count = administratorService.countByExample(example);//计数，数据库中有无页面传入的账户名，并返回一个计数
            logger.info("查看修改后的用户名是否有重复");
            if (count == 0){//返回的为0，数据库中没有这个账户
                administrator1.setName(administrator.getName());
                logger.info("用户名不存在");
            }else{
                no.addObject("code", 1005);
                no.addObject("message", "用户名重复");
                logger.error("用户名存在");
            }
        }
        if (administrator.getPassword()!=null&&(!administrator.getPassword().equals(""))){//判断密码不为空
            administrator1.setPassword(administrator.getPassword());//新建的对象接入页面传入的密码
        }
        if (administrator.getId()!=null){//判断id不为空
            administrator1.setId(administrator.getId());//新建的对象接入页面传入的id
        }
        int row = administratorService.updateByPrimaryKeySelective(administrator1);//将所有的值更新的数据库中，并返回一个受影响的行数
        if (row==1){//受影响行数为1为修改成功
            no.addObject("code",1007);
            no.addObject("message","更新成功");
            logger.info("更新成功");
        }else{
            no.addObject("code",1008);
            no.addObject("message","更新失败");
            logger.info("更新失败");
        }
        return no;
}





    @RequestMapping(value = "/update/password",method = RequestMethod.PUT)//更新密码
    public ModelAndView update(Administrator administrator,String newpassword){//接页面的用户的值和要修改的密码
        ModelAndView lo = new ModelAndView();//新建一个视图对象
        logger.info("通过id查原始数据");
        Administrator administrator1 = administratorService.selectByPrimaryKey(administrator.getId());//查询用户的id
        logger.info("核对密码");
        if (administrator1.getPassword().equals(administrator.getPassword())){//核对用户输入的密码与表中的密码是否一致
            logger.info("更新密码");
            Administrator administrator2 = new Administrator();//新建一个对象
            administrator2.setId(administrator.getId());//新建的对象接入页面的id
            administrator2.setPassword(newpassword);//新建的对象接入页面的要修改的密码
            administratorService.updateByPrimaryKeySelective(administrator2);//根据id修改表中的数据
            lo.addObject("code",1007);
            lo.addObject("message","更新成功");
        }else{
            lo.addObject("code",1008);
            lo.addObject("message","更新失败");
        }
        lo.setView(new MappingJackson2JsonView());
        return lo;
    }

    @RequestMapping(value = "/uid",method = RequestMethod.GET)//根据id查用户吗
    public ModelAndView check(Integer uid){//接入页面传入的id
        ModelAndView vr = new ModelAndView();//新建一个视图对象
        logger.info("编号，分页查询");
        vr.setView(new MappingJackson2JsonView());//有返回值就要有
        Administrator administrator = administratorService.selectByPrimaryKey(uid);//根据id查询数据库中的数据并返回
        if (administrator!=null){//返回的数据不为空
            vr.addObject("administrator",administrator);//查询到的数据返回到页面
            vr.addObject("code",1010);
            vr.addObject("message","查询成功");
            logger.info("查询成功");
        }else{
            vr.addObject("code",1011);
            vr.addObject("message","查询失败");
            logger.error("查询失败");
        }
        return vr;
    }
}
