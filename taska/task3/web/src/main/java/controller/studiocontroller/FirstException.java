//package controller.studiocontroller;
//
//import org.apache.log4j.Logger;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
////一种方法
//@ControllerAdvice//注解定义全局异常处理类
//public class FirstException {//创建一个类
//
//    private static org.apache.log4j.Logger logger = Logger.getLogger(FirstException.class);//新建一个日志记录器
//
//    @ExceptionHandler(RuntimeException.class)//声明异常处理方法，获取异常的错误提示
//    @ResponseBody//表示该方法的返回结果直接写在响应的正文中，不为跳转路径
//    public ModelAndView exception(Exception e){
//        ModelAndView mu = new ModelAndView();//新建一个视图对象
//        logger.info("全局异常处理统计");
//        logger.info("----------------");
//        logger.info(e);//输出错误信息
//        mu.addObject("message", e );//对象中放入获取到的异常错误，并传给页面的message
//        mu.setViewName("error");//要返回的页面
//        return mu;
//    }
//}
