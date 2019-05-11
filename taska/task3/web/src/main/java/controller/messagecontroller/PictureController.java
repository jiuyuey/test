package controller.messagecontroller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.io.File;

@Controller
public class PictureController {

    private org.apache.log4j.Logger logger= Logger.getLogger(PictureController.class);

    @RequestMapping(value = "/b/banner/addpicture",method = RequestMethod.POST)//图片上传功能的url和post修改方法
    public ModelAndView picture(@RequestParam("file") MultipartFile file) throws Exception{//指定图片流、多部份文件和抛出异常

//        String realpath = "D:\\tomcat\\webapps\\png\\";//本地的上传路径的绝对地址
        String realpath = "/home/png/";//服务器端的绝对地址
        ModelAndView li = new ModelAndView();//新建一个视图对象

//        li.setViewName("jump");//页面跳转的功能
        logger.info("判断上传文件是否为空");
        if (file!=null&&file.getSize()!=0){//判断上传图片不为空
            String fileName = file.getOriginalFilename();//获取原文件名
            String trueFileName = System.currentTimeMillis() + fileName;//获取时间戳加上原文件名，以防重名
            String path = realpath + trueFileName;//加上绝对路径和文件名
            logger.info("转存到指定路径");
            file.transferTo(new File(path));//文件移动到服务器端的地址
            String url = "/png/" + trueFileName;//获取绝对地址下的相对路径
            logger.info("图片存放到数据库中的相对路径" + url);
            li.addObject("url",url);//返回相对路径
            li.addObject("code",1030);
            li.addObject("message","图片上传成功");

        }else{
            logger.info("图片上传失败");
            li.addObject("code",1040);
            li.addObject("message","图片上传失败");

        }
        li.setView(new MappingJackson2JsonView());//格式化数据输出
        return li;
    }
}