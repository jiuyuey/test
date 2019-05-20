package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
public class FigureController {

    org.apache.log4j.Logger logger = Logger.getLogger(FigureController.class);

    @RequestMapping(value = "/p/figure",method = RequestMethod.POST)//上传图片的url
    public ModelAndView figure(@RequestParam("file") MultipartFile file) throws Exception{//接页面的file传来的图片

        String realpath = "/home/static/";//服务器端的绝对路径
        ModelAndView m = new ModelAndView();//创建一个新的视图对象

        logger.info("判断上传图片是否为空");
        if (file != null && file.getSize() != 0 ){//判断上传的图片不是空的
            String fileName = file.getName();//获取图片的当前名称
            String truefileName = System.currentTimeMillis() + fileName;//在当前名称上加上时间戳
            String path = realpath + truefileName;//将绝对路径和加上时间戳的名称合并
            logger.info("转存指定路径");
            file.transferTo(new File(path));//转存到绝对路径中的图片位置
            String url = "/png/" + truefileName;//获取一个相对路径的url
            logger.info("图片存放相对路径" + url);
            m.addObject("url",url);//返回一个相对路径的url
            m.addObject("message","图片上传成功");
        }else{
            m.addObject("message","图片上传失败");
        }
        return m;
    }
}
