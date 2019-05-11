package controller.messagecontroller;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Message;
import pojo.MessageExample;
import service.MessageService;
import util.Page;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/L/message")
public class MessageController {

    private static org.apache.log4j.Logger logger = Logger.getLogger(MessageController.class);//创建一个私有的logger记录器

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/change",method = RequestMethod.POST)//修改接口
    public ModelAndView change(Message message, String editperson){//接入页面传入的message和rditperson的值
        ModelAndView dd = new ModelAndView();//新建一个视图对象
        if (message.getTitle()!=null&&(!message.getTitle().equals("")) &&message.getNickname()!=null&&(!message.getNickname().equals(""))){//判断message中的不为空
            logger.info("判断名称和昵称不为空");
            if (editperson!=null&&(!editperson.equals(""))){//判断editperson不为空
                logger.info("判断编辑人不为空");

                long tomeSiamp = System.currentTimeMillis();//获取当前时间的毫秒数
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");//提供一个要转换的时间格式
                String sd = sdf.format(new Date(tomeSiamp));//将当前毫秒数转换时间格式，格式为字符串

                message.setModifythetime(sd);//将字符串格式的时间插入到message中
                int row = messageService.updateByPrimaryKeySelective(message);//修改表中的数据并返回一个受到影响的行数
                if (row==1){
                    logger.info("修改成功");
                    dd.addObject("code",1102);
                    dd.addObject("message","修改成功");
                }else {
                    logger.error("修改失败");
                    dd.addObject("code",1102);
                    dd.addObject("message","修改失败");
                }
            }else{
                logger.error("编辑人为空");
                dd.addObject("code",1102);
                dd.addObject("message","编辑人为空");
            }
        }
        dd.setView(new MappingJackson2JsonView());
        return dd;
    }


    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)//删除接口
    public ModelAndView delete(Integer id){//从页面接到id
        ModelAndView ni = new ModelAndView();//新建一个视图对象
        int row = messageService.deleteByPrimaryKey(id);//根据id进行删除并返回一个受影响的行数
        if (row==1){
            logger.info("删除成功");
            ni.addObject("code",1092);
            ni.addObject("message","删除成功");
        }else{
            logger.error("删除失败");
            ni.addObject("code",1092);
            ni.addObject("message","删除失败");
        }
        ni.setView(new MappingJackson2JsonView());
        return ni;
    }



    @RequestMapping(value = "/flashback",method = RequestMethod.GET)//倒序分页
    public ModelAndView flashback(Page page){
        ModelAndView xx = new ModelAndView();

        MessageExample example = new MessageExample();
//        MessageExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("messagetime DESC");//根据时间倒序分页

        long totat = messageService.countByExample(example);
        PageHelper.offsetPage(page.getStart(), page.getPageSize());
        List<Message> list = messageService.selectByExample(example);
        page.callbang(totat);

        if (list!=null&&list.size()>0){
            logger.info("查询成功");
            xx.addObject("list",list);
            xx.addObject("code",1208);
            xx.addObject("message","查询成功");
        }else{
            logger.error("查询失败");
            xx.addObject("code",1208);
            xx.addObject("message","查询失败");
        }
        xx.setView(new MappingJackson2JsonView());
        return xx;
    }


    @RequestMapping(value = "/check",method = RequestMethod.GET)//根据模块名模糊查询
    public ModelAndView check(String title,Page page){
        ModelAndView po = new ModelAndView();
        MessageExample example = new MessageExample();
        MessageExample.Criteria criteria = example.createCriteria();
        if ( title != null &&(!title.equals(""))){
            criteria.andTitleLike("%"+title+"%");//模糊查询
            logger.info("模块名不为空");
        }else{
            logger.error("模块名为空");
        }
        logger.info("分页显示");

        long totat = messageService.countByExample(example);
        PageHelper.offsetPage(page.getStart(), page.getPageSize());//分页语句
        List<Message> list = messageService.selectByExample(example);
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
            logger.error("查询失败");
        }
        po.setView(new MappingJackson2JsonView());
        return po;
    }
}
