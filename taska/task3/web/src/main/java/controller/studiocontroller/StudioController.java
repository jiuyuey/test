package controller.studiocontroller;

import com.github.pagehelper.PageHelper;
import controller.backgroundcontroller.LoginController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Studio;
import pojo.StudioExample;
import service.StudioService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping(value = "/s/studio")
public class StudioController extends Throwable{

    private static org.apache.log4j.Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private StudioService studioService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)//分页查询
    public ModelAndView check(Page page) {
        ModelAndView ou = new ModelAndView();
        StudioExample example = new StudioExample();
        long totat = studioService.countByExample(example);
        PageHelper.offsetPage(page.getStart(), page.getPageSize());
        List<Studio> list = studioService.selectByExample(example);
        page.callbang(totat);
        if (list != null && list.size() > 0) {
            ou.addObject("list", list);
            ou.addObject("code", 1058);
            ou.addObject("message", "查询成功");
            logger.info("查询成功");
        } else {
            ou.addObject("code", 1060);
            ou.addObject("message", "查询失败");
            logger.error("查询失败");
        }
        ou.setView(new MappingJackson2JsonView());
        return ou;
    }


    @RequestMapping(value = "/increase", method = RequestMethod.POST)//增加
    public ModelAndView increase(Studio studio) {
        ModelAndView mo = new ModelAndView();
        mo.setView(new MappingJackson2JsonView());
        if (studio.getName() != null && (!studio.getName().equals("")) && studio.getEdit() != null && (!studio.getEdit().equals(""))) {
            logger.info("判断工作室名字和创建人名字不为空");
            long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
            String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间
            studio.setCreateat(sd);
            int row = studioService.insert(studio);
            if (row == 1) {
                mo.addObject("code", 1062);
                mo.addObject("message", "增加成功");
                logger.info("增加成功");
            } else {
                mo.addObject("code", 1064);
                mo.addObject("message", "增加失败");
                logger.info("增加失败");
            }
        }else{
            mo.addObject("code", 1064);
            mo.addObject("message", "增加失败");
            logger.info("增加失败");
        }
        return mo;
    }


    @RequestMapping(value = "/change", method = RequestMethod.PUT)//修改
    public ModelAndView change(Studio studio,String edit) throws Exception {
        ModelAndView bili = new ModelAndView();

        if (studio.getName() != null && (!studio.getName().equals("")) && edit != null && (!edit.equals(""))) {
            logger.info("判断名字和编辑人不为空");
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotLike(studio.getName());
            long count = studioService.countByExample(example);
            if (count == 0) {
                studio.setName(studio.getName());
                logger.info("模块名不存在");
            } else {
                bili.addObject("code", 1066);
                bili.addObject("message", "模块名重复");
                logger.error("模块名重复");
            }
            if (studio.getName() != null && (!studio.getName().equals("")) && studio.getEdit() != null && (!studio.getEdit().equals(""))) {
                studio.setName(studio.getName());
                studio.setEdit(studio.getEdit());
                studio.setRichtext(studio.getRichtext());
            }
            if (studio.getId() != null) {
                studio.setId(studio.getId());
            }else{
                bili.addObject("code", 1066);
                bili.addObject("message", "id为空");
            }
            int row = studioService.updateByPrimaryKeySelective(studio);
            if (row == 1) {
                bili.addObject("code", 1068);
                bili.addObject("message", "更新成功");
                logger.info("更新成功");
            } else {
                bili.addObject("code", 1070);
                bili.addObject("message", "更新失败");
                logger.error("更新失败");
            }
        }else{
            bili.addObject("code", 1066);
            bili.addObject("message", "模块名为空");
            logger.error("模块名为空");
        }
        bili.setView(new MappingJackson2JsonView());
        return bili;
    }

    @RequestMapping(value = "/down",method = RequestMethod.PUT)//上架或下架
    public ModelAndView down(Studio studio,String according){
        ModelAndView li = new ModelAndView();

        if (according.equals("上架") && studio.getState().equals("下架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateLike(studio.getState());

            studio.setState(according);
            logger.info("判断上架是否对应");
            int row = studioService.updateByPrimaryKeySelective(studio);
            if (row == 1){
                logger.info("修改完成");
            }else{
                logger.error("修改失败");
            }
        }
        if (according.equals("下架") && studio.getState().equals("上架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotLike(studio.getState());

            studio.setState(according);
            logger.info("判断下架是否对应");
            int row = studioService.updateByPrimaryKeySelective(studio);
            if (row == 1){
                logger.info("修改完成");
            }else{
                logger.error("修改失败");
            }
        }
        li.setView(new MappingJackson2JsonView());
        return li;
    }
}
