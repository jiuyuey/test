package controller;

import controller.util.FileUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class UploadController {

    private org.apache.log4j.Logger logger = Logger.getLogger(FigureController.class);

    @RequestMapping(value = "/u/upload",method = RequestMethod.POST)
    public ModelAndView uplocad(@RequestParam("file") MultipartFile file) throws RuntimeException, IOException {
        ModelAndView uplocad = new ModelAndView();
        logger.info("判断是否有文件");
        if (file != null && file.getSize() > 0){
            logger.info("判断文件");
            FileUtil.fileup(file);
            uplocad.setViewName("login");
        }else{
            uplocad.setViewName("login");
            logger.info("并没有文件上传");
        }
        return uplocad;
    }
}
