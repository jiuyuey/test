package controller.util;
;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class FirstException {

    private org.apache.log4j.Logger logger = Logger.getLogger(FirstException.class);

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ModelAndView exception(Exception e){
        ModelAndView mo = new ModelAndView();
        logger.info("vfgsegsdgsdgsd");
        mo.addObject("message",e);
        mo.setViewName("error");
        return mo;
    }
}
