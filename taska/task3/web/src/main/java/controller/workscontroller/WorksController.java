package controller.workscontroller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.StudioExample;
import pojo.Works;
import pojo.WorksExample;
import service.WorksService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/w/works")
public class WorksController {

    private static org.apache.log4j.Logger logger = Logger.getLogger(WorksController.class);

    @Autowired
    private WorksService worksService;

    @RequestMapping(value = "/change", method = RequestMethod.PUT)//修改接口
    public ModelAndView change(Works works, String edit) {
        ModelAndView po = new ModelAndView();

        if (works.getName() != null && (!works.getName().equals("")) && edit != null && (!edit.equals(""))) {
            logger.info("判断作品集名和编辑人不为空");

//            WorksExample example = new WorksExample();
//            WorksExample.Criteria criteria = example.createCriteria();
//            criteria.andNameLike(works.getName());

            long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//这个是你要转成后的时间的格式
            String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间

            works.setUpdateat(sd);
            works.setName(works.getName());
            int row = worksService.updateByPrimaryKeySelective(works);
            if (row == 1) {
                logger.info("修改成功");
                po.addObject("code", 1072);
                po.addObject("message", "修改成功");
            } else {
                logger.error("修改失败");
                po.addObject("code", 1074);
                po.addObject("message", "修改失败");
            }
        } else {
            po.addObject("code", 1076);
            po.addObject("message", "作品集名或编辑人为空");
            logger.error("作品集名或编辑人为空");
        }
        po.setView(new MappingJackson2JsonView());
        return po;
    }


    @RequestMapping(value = "/increase", method = RequestMethod.POST)//增加接口，增加到7个作品集就停止增加
    public ModelAndView increase(Works works, String edit) {
        ModelAndView xia = new ModelAndView();
        if (works.getName() != null && (!works.getName().equals("")) && edit != null && (!edit.equals(""))) {
            logger.info("判断作品集名和编辑人名不为空");

            WorksExample example = new WorksExample();
//            WorksExample.Criteria criteria = example.createCriteria();
//            criteria.andNameLike(works.getName());
            long count = worksService.countByExample(example);//计算数据库中总数
            if (count < 7) {//小于7，总数就是为6，还可以增加一次
                long tomeStamp = System.currentTimeMillis();//获取当前时间戳，秒数
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");//需要转换的时间的格式
                String sd = sdf.format(new Date(tomeStamp));//将时间戳转换成时间输出字符串格式

                works.setId(works.getId());
                works.setState("上架");
                works.setCreateat(sd);
                works.setUpdateat(sd);
                int row = worksService.insertSelective(works);
                if (row == 1) {
                    logger.info("增加成功");
                    xia.addObject("code", 1080);
                    xia.addObject("message", "增加成功");
                } else {
                    logger.info("增加失败");
                    xia.addObject("code", 1080);
                    xia.addObject("message", "增加失败");
                }
            } else {
                logger.info("数量已达上限");
                xia.addObject("code", 1080);
                xia.addObject("message", "数量已达上限");
            }

        } else {
            logger.info("作品集名和编辑人名为空");
            xia.addObject("code", 1080);
            xia.addObject("message", "作品集名和编辑人名为空");
        }
        xia.setView(new MappingJackson2JsonView());
        return xia;
    }


    @RequestMapping(value = "/check", method = RequestMethod.GET)//模糊查询分页显示
    public ModelAndView check(String name, Page page) {
        ModelAndView fen = new ModelAndView();
        WorksExample example = new WorksExample();
        WorksExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("uid ASC");
        if (name != null && (!name.equals(""))) {
            criteria.andNameLike("%" + name + "%");
            logger.info("判断名字不为空");

            long totat = worksService.countByExample(example);
            PageHelper.offsetPage(page.getStart(), page.getPageSize());
            List<Works> list = worksService.selectByExample(example);
            page.callbang(totat);
            logger.info("判断有无返回结果");
            if (list != null && list.size() > 0) {
                logger.info("查询成功");
                fen.addObject("list", list);
                fen.addObject("code", 1082);
                fen.addObject("message", "查询成功");
            } else {
                logger.error("查询失败");
                fen.addObject("code", 1086);
                fen.addObject("message", "查询失败");
            }
        } else {
            logger.error("名字为空");
            fen.addObject("code", 1088);
            fen.addObject("message", "名字为空");
        }
        fen.setView(new MappingJackson2JsonView());
        return fen;
    }


    @RequestMapping(value = "/shelves", method = RequestMethod.PUT)//上架和下架接口
    public ModelAndView shelves(Works works, String according) {
        ModelAndView li = new ModelAndView();

        if (according.equals("上架") && works.getState().equals("下架")) {
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateLike(works.getState());

            works.setState(according);
            logger.info("判断上架是否对应");
            int row = worksService.updateByPrimaryKeySelective(works);
            if (row == 1) {
                logger.info("修改完成");
            } else {
                logger.error("修改失败");
            }
        }
        if (according.equals("下架") && works.getState().equals("上架")) {
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotLike(works.getState());

            works.setState(according);
            logger.info("判断下架是否对应");
            int row = worksService.updateByPrimaryKeySelective(works);
            if (row == 1) {
                logger.info("修改完成");
            } else {
                logger.error("修改失败");
            }
        }
        li.setView(new MappingJackson2JsonView());
        return li;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)//删除接口
    public ModelAndView delete(Integer id) {
        ModelAndView gg = new ModelAndView();
        int row = worksService.deleteByPrimaryKey(id);
        if (row != 0) {
            gg.addObject("code", 1050);
            gg.addObject("message", "删除成功");
            logger.info("删除成功");
        } else {
            gg.addObject("code", 1054);
            gg.addObject("message", "删除失败");
            logger.error("删除失败");
        }
        gg.setView(new MappingJackson2JsonView());
        return gg;
    }


    @RequestMapping(value = "/sorting",method = RequestMethod.POST)
    public ModelAndView sorting(@RequestBody JSONObject jsonObject){

        List<Works> list = jsonObject.getJSONArray("list").toJavaList(Works.class);
        String open = jsonObject.getString("open");
//        logger.info("11111111");
        ModelAndView mo = new ModelAndView();
        for (int i = 0;i<list.size();i++){
//            logger.info("222222222222");
            Works works = list.get(i);
//            logger.info("333333333333");
            String run = String.valueOf(System.currentTimeMillis());
            works.setUpdateat(run);
            works.setEdit(open);
        }
        logger.info(list);
        worksService.baUpdate(list);
        logger.info("更新完成");
        mo.addObject("code", 1054);
        mo.addObject("message", "更新完成");
        mo.setView(new MappingJackson2JsonView());
        return mo;
    }
}