package controller.workscontroller;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Collection;
import pojo.CollectionExample;
import pojo.StudioExample;
import service.CollectionService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/c/collection")
public class CollectionController {

    private static org.apache.log4j.Logger logger = Logger.getLogger(CollectionController.class);

    @Autowired
    private CollectionService collectionService;

    @RequestMapping(value = "/increase",method = RequestMethod.POST)//增加接口
    public ModelAndView increase(Collection collection,String edit){
        ModelAndView in = new ModelAndView();
//        CollectionExample example = new CollectionExample();
//        CollectionExample.Criteria criteria = example.createCriteria();
        if (collection.getName()!=null&&(!collection.getName().equals("")) && collection.getCollec()!=null&&(!collection.getCollec().equals(""))){
            logger.info("判断名称作品集不为空");

            long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");//这个是你要转成后的时间的格式
            String sd = sdf.format(new Date(timeStamp));// 时间戳转换成时间

            collection.setState("上架");
            collection.setCreateat(sd);
            collection.setUpdateat(sd);
            collection.setEdit(edit);
            int row = collectionService.insert(collection);
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

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)//删除接口
    public ModelAndView delete(Integer id){
        ModelAndView ni = new ModelAndView();
        int row = collectionService.deleteByPrimaryKey(id);
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



    @RequestMapping(value = "/check",method = RequestMethod.GET)//根据模块名模糊查询
    public ModelAndView check(String collec,Page page){
        ModelAndView po = new ModelAndView();
        CollectionExample example = new CollectionExample();
        CollectionExample.Criteria criteria = example.createCriteria();
        if ( collec != null &&(!collec.equals(""))){
            criteria.andCollecLike("%"+collec+"%");//模糊查询
            logger.info("模块名不为空");

            logger.info("分页显示");
            po.setView(new MappingJackson2JsonView());
            long totat = collectionService.countByExample(example);
            PageHelper.offsetPage(page.getStart(), page.getPageSize());//分页语句
            List<Collection> list = collectionService.selectByExample(example);
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
            po.addObject("code",1026);
            po.addObject("message","模块名为空");
        }
        po.setView(new MappingJackson2JsonView());
        return po;
    }


    @RequestMapping(value = "/change",method = RequestMethod.PUT)//修改接口
    public ModelAndView change(Collection collection,String edit){
        ModelAndView dd = new ModelAndView();
        if (collection.getName()!=null&&(!collection.getName().equals("")) &&collection.getCollec()!=null&&(!collection.getCollec().equals(""))){
            logger.info("判断名称和作品集不为空");
            if (edit!=null&&(!edit.equals(""))){
                logger.info("判断编辑人不为空");
                long tomeSiamp = System.currentTimeMillis();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");
                String sd = sdf.format(new Date(tomeSiamp));

                collection.setUpdateat(sd);
                int row = collectionService.updateByPrimaryKeySelective(collection);
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



    @RequestMapping(value = "/shelves",method = RequestMethod.PUT)//上下架接口
    public ModelAndView shelves(Collection collection, String according){
        ModelAndView li = new ModelAndView();

        if (according.equals("上架") && collection.getState().equals("下架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateLike(collection.getState());

            collection.setState(according);
            logger.info("判断上架是否对应");
            int row = collectionService.updateByPrimaryKeySelective(collection);
            if (row == 1){
                logger.info("修改完成");
            }else{
                logger.error("修改失败");
            }
        }
        if (according.equals("下架") && collection.getState().equals("上架")){
            StudioExample example = new StudioExample();
            StudioExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotLike(collection.getState());

            collection.setState(according);
            logger.info("判断下架是否对应");
            int row = collectionService.updateByPrimaryKeySelective(collection);
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
