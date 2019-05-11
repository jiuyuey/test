package controller.backgroundcontroller;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Module;
import pojo.ModuleExample;
import service.ModuleService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/m/module")
public class ModuleController {

    private org.apache.log4j.Logger logger=Logger.getLogger(ModuleController.class);//新建logger日志记录器

    @Autowired
    private ModuleService moduleService;//自动装配

    @RequestMapping(value = "/check", method = RequestMethod.GET)//用get方法进行修改业务对象资源
    public ModelAndView check(Page page) {
        ModelAndView mo = new ModelAndView();//新建一个视图对象
        ModuleExample example = new ModuleExample();//新建一个example对象
        example.setOrderByClause("creationtime DESC");//按时间排序，倒序
        logger.info("分页查询");
        long totat = moduleService.countByExample(example);//对数据库中的数据计数，返回一个长整型
        PageHelper.offsetPage(page.getStart(), page.getPageSize());//获取页面传入的页数
        List<Module> list = moduleService.selectByExample(example);//选择数据库中的数据
        page.callbang(totat);//将总数传入page中进行计算。
        logger.info("有无返回结果");
        if (list != null && list.size() > 0) {//判断查询数据库的数据不为空，且大于0
            mo.addObject("list", list);
            mo.addObject("code", 1013);
            mo.addObject("message", "查询成功");
            logger.info("查询成功");
        } else {
            mo.addObject("code", 1015);
            mo.addObject("message", "查询失败");
            logger.error("查询失败");
            throw new RuntimeException("没有");
        }
        mo.setView(new MappingJackson2JsonView());
        return mo;
    }


    @RequestMapping(value = "/increase",method = RequestMethod.POST)//用post方法进行资源修改
    public ModelAndView increase(Module module){//
        ModelAndView no = new ModelAndView();//新建一个视图对象
        if (module.getThemodule() != null&&(!module.getThemodule().equals(""))){//判断页面传的值不为空
            logger.info("判断模块名不为空");
            if (module.getParentnode() != null && (!module.getParentnode().equals(""))){//判断页面传的值不为空
                logger.info("判断父节点不为空");
                if (module.getUrl() != null && (!module.getUrl().equals(""))){//判断页面传的值不为空
                    logger.info("判断url不为空");
                    if (module.getFounder() != null && (!module.getFounder().equals(""))){//判断页面传的值不为空
                        logger.info("判断创建人不为空");
                        long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
                        String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间
                        module.setCreationtime(sd);//将转换好的时间放入module中
                        int row = moduleService.insert(module);//将module中的数据增加到数据库中，并返回一个受到影响的行数
                        if (row==1){//判断受影响行数为1，增加成功，否则失败
                            no.addObject("code",1018);
                            no.addObject("message","增加成功");
                            logger.info("增加成功");
                        }else{
                            no.addObject("code",1020);
                            no.addObject("message","增加失败");
                            logger.error("增加失败");
                        }
                    }else{
                        no.addObject("code",1020);
                        no.addObject("message","增加失败");
                        logger.error("增加失败");
                    }
                }
            }else{
                    no.addObject("code",1020);
                    no.addObject("message","增加失败");
                    logger.error("增加失败");
            }
        }else{
            no.addObject("code",1020);
            no.addObject("message","增加失败");
            logger.error("增加失败");
        }
        no.setView(new MappingJackson2JsonView());//格式化传输出去
        return no;
    }


    @RequestMapping(value = "/themodule",method = RequestMethod.GET)//用get方法进行查询
    public ModelAndView themodule(String themodule,Page page){//页面传入模块的名字和分页的参数
        ModelAndView po = new ModelAndView();//新建一个视图对象
        ModuleExample example = new ModuleExample();//新建一个example对象
        ModuleExample.Criteria criteria = example.createCriteria();
        if ( themodule != null &&(!themodule.equals(""))){//判断模块名不为空
            logger.info("模块名不为空");
            criteria.andThemoduleLike("%"+themodule+"%");//模糊查询
            logger.info("分页显示");
            long totat = moduleService.countByExample(example);//计数返回一个长整型
            PageHelper.offsetPage(page.getStart(), page.getPageSize());//页面传入page的参数
            List<Module> list = moduleService.selectByExample(example);//选择数据库中的数据
            page.callbang(totat);//将计数的结果传入page中的callbang运算
            logger.info("判断有无返回结果");
            if (list!=null&&list.size()>0){//判断选择的数据不为空
                po.addObject("list",list);//向页面传list集合的值
                po.addObject("code",1024);
                po.addObject("message","查询成功");
                logger.info("查询成功");
            }else{
                po.addObject("code",1026);
                po.addObject("message","查询失败");
                logger.info("查询失败");
            }
        }else{
            logger.info("模块名为空");
            po.addObject("code",1026);
            po.addObject("message","查询失败");
        }
        po.setView(new MappingJackson2JsonView());//向页面格式化输出
        return po;
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)//用post方法进行数据库操作
    public ModelAndView change(Module module){//获取页面的传值
        ModelAndView vv = new ModelAndView();//新建一个视图模块
        if (module.getThemodule()!=null && module.getParentnode()!=null && module.getUrl()!=null && module.getFounder()!=null){//判断接的值不为空
            logger.info("判断修改的不为空");
            ModuleExample example = new ModuleExample();//新建一个example对象
            ModuleExample.Criteria criteria = example.createCriteria();//新建一个条件
            criteria.andThemoduleLike(module.getThemodule());//根据条件查询
            long count = moduleService.countByExample(example);//计算数据库中变动数据
            if (count==0){
                logger.info("模块名不存在");
                module.setThemodule(module.getThemodule());//module接入页面传入的module值
            }else{
                logger.info("模块名重复");
                vv.addObject("code",1030);
                vv.addObject("message","模块名重复");
                return vv;
            }
        }if (module.getThemodule()!=null && module.getParentnode()!=null && module.getUrl()!=null && module.getFounder()!=null){//判断接到的值不为空
            module.setThemodule(module.getThemodule());//接入页面的模块名
            module.setParentnode(module.getParentnode());//接入页面的节点
            module.setFounder(module.getFounder());//接入页面的值
            module.setUrl(module.getUrl());//接入页面的url
        }
        if (module.getId()!=null){//判断id不为空
            module.setId(module.getId());//接入页面id
        }
        int row = moduleService.updateByPrimaryKeySelective(module);//更新数据库中的页面传入id的那一行的数据，并传出数据库改动行数
        if (row==1){//有一行变动，更新成功
            vv.addObject("code",1043);
            vv.addObject("message","更新成功");
            logger.info("更新成功");
        }else{
            vv.addObject("code",1046);
            vv.addObject("message","更新失败");
            logger.info("更新失败");
        }
        vv.setView(new MappingJackson2JsonView());//传输格式化数据
        return vv;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)//根据id删除
    public ModelAndView delete(Integer id){//接入页面传入的id
        ModelAndView gg = new ModelAndView();//新建一个视图对象
        gg.setView(new MappingJackson2JsonView());////格式化数据传输
        int row = moduleService.deleteByPrimaryKey(id);//删除表中id所在行数据
        if (row!=0){//变动数不为零删除成功
            gg.addObject("code",1050);
            gg.addObject("message","删除成功");
            logger.info("删除成功");
        }else{
            gg.addObject("code",1054);
            gg.addObject("message","删除失败");
            logger.error("删除失败");
        }
        return gg;
    }
}