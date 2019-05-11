package controller.workscontroller;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.*;
import service.LevelService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/L/Level")
public class LevelController {

    private static org.apache.log4j.Logger logger = Logger.getLogger(LevelController.class);

    @Autowired
    private LevelService levelService;

    @RequestMapping(value = "/shelves",method = RequestMethod.PUT)//上下架接口
    public ModelAndView shelves(Level level, String according){
        ModelAndView li = new ModelAndView();

        if (according.equals("上架") && level.getState().equals("下架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateLike(level.getState());

            level.setState(according);
            logger.info("判断上架是否对应");
            int row = levelService.updateByPrimaryKeySelective(level);
            if (row == 1){
                logger.info("修改完成");
            }else{
                logger.error("修改失败");
            }
        }
        if (according.equals("下架") && level.getState().equals("上架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotLike(level.getState());

            level.setState(according);
            logger.info("判断下架是否对应");
            int row = levelService.updateByPrimaryKeySelective(level);
            if (row == 1){
                logger.info("修改完成");
            }else{
                logger.error("修改失败");
            }
        }
        li.setView(new MappingJackson2JsonView());
        return li;
    }

    @RequestMapping(value = "/change",method = RequestMethod.PUT)//修改接口
    public ModelAndView change(Level level, String edit){
        ModelAndView dd = new ModelAndView();
        if (level.getName()!=null&&(!level.getName().equals("")) &&level.getCollection()!=null&&(!level.getCollection().equals(""))){
            logger.info("判断名称和作品集不为空");
            if (edit!=null&&(!edit.equals(""))){
                logger.info("判断编辑人不为空");

                long tomeSiamp = System.currentTimeMillis();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");
                String sd = sdf.format(new Date(tomeSiamp));

                level.setUpdateat(sd);
                int row = levelService.updateByPrimaryKeySelective(level);
                if (row==1){
                    logger.info("修改成功");
                    dd.addObject("code",1102);
                    dd.addObject("message","修改成功");
                }else {
                    logger.info("修改失败");
                    dd.addObject("code",1102);
                    dd.addObject("message","修改失败");
                }
            }else{
                logger.info("编辑人为空");
                dd.addObject("code",1102);
                dd.addObject("message","编辑人为空");
            }
        }else{
            logger.info("编辑人为空");
            dd.addObject("code",1102);
            dd.addObject("message","编辑人为空");
        }
        dd.setView(new MappingJackson2JsonView());
        return dd;
    }


    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)//删除接口
    public ModelAndView delete(Integer id){
        ModelAndView ni = new ModelAndView();
        int row = levelService.deleteByPrimaryKey(id);
        if (row==1){
            logger.info("删除成功");
            ni.addObject("code",1092);
            ni.addObject("message","删除成功");
        }else{
            logger.info("删除失败");
            ni.addObject("code",1092);
            ni.addObject("message","删除失败");
        }
        ni.setView(new MappingJackson2JsonView());
        return ni;
    }


    @RequestMapping(value = "/increase",method = RequestMethod.POST)//增加接口
    public ModelAndView increase(Level level, String edit){
        ModelAndView in = new ModelAndView();

        if (level.getName()!=null&&(!level.getName().equals("")) && level.getCollection()!=null&&(!level.getCollection().equals(""))){
            logger.info("判断名称作品集不为空");

            long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
            String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间

            level.setState("上架");
            level.setCreateat(sd);
            level.setUpdateat(sd);
            level.setEdit(edit);
            int row = levelService.insert(level);
            if (row==1){
                logger.info("增加成功");
                in.addObject("code",1088);
                in.addObject("message","增加成功");
            }else{
                logger.info("增加失败");
                in.addObject("code",1090);
                in.addObject("message","增加失败");
            }
        }else{
            logger.info("名称或作品集为空");
            in.addObject("code",1090);
            in.addObject("message","名称或作品集为空");
        }
        in.setView(new MappingJackson2JsonView());
        return in;
    }


    @RequestMapping(value = "/check",method = RequestMethod.GET)//根据模块名模糊查询
    public ModelAndView check(String name,Page page){
        ModelAndView po = new ModelAndView();
        LevelExample example = new LevelExample();
        LevelExample.Criteria criteria = example.createCriteria();
        if ( name != null &&(!name.equals(""))){
            criteria.andNameLike("%"+name+"%");//模糊查询
            logger.info("模块名不为空");

            logger.info("分页显示");
            po.setView(new MappingJackson2JsonView());
            long totat = levelService.countByExample(example);
            PageHelper.offsetPage(page.getStart(), page.getPageSize());//分页语句
            List<Level> list = levelService.selectByExample(example);
            page.callbang(totat);
            logger.info("判断有无返回结果");
            if (list!=null&&list.size()>0){
                po.addObject("list",list);
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
        }
        po.setView(new MappingJackson2JsonView());
        return po;
    }


    @RequestMapping(value = "/flashback",method = RequestMethod.GET)//倒序分页
    public ModelAndView flashback(Page page){
        ModelAndView xx = new ModelAndView();

        LevelExample example = new LevelExample();
//        LevelExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("updateat DESC");

        long totat = levelService.countByExample(example);
        PageHelper.offsetPage(page.getStart(), page.getPageSize());
        List<Level> list = levelService.selectByExample(example);
        page.callbang(totat);

        if (list!=null&&list.size()>0){
            logger.info("查询成功");
            xx.addObject("list",list);
            xx.addObject("code",1208);
            xx.addObject("message","查询成功");
        }else{
            logger.info("查询失败");
            xx.addObject("code",1208);
            xx.addObject("message","查询失败");
        }
        xx.setView(new MappingJackson2JsonView());
        return xx;
    }
}
