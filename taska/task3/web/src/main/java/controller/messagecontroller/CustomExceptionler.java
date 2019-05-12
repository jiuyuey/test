package controller.messagecontroller;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionler implements HandlerExceptionResolver{

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        //handler就是处理器适配器要执行Handler对象（只有method）
        //解析出异常类型
        //如果该 异常类型是系统 自定义的异常，直接取出异常信息，在错误页面展示
        //String message = null;
        //if(ex instanceof CustomException){
        //message = ((CustomException)ex).getMessage();
        //}else{
        ////如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
        //message="未知错误";
        //}
        Logger logger=Logger.getLogger(CustomExceptionler.class);
        logger.info(ex);
        //上边代码变为
        RuntimeException runtimeException;//获取异常错误提示，逆向生成中的example中带有异常抛出
        if(ex instanceof CustomException){//判断对象是否为特定类的实例
            runtimeException = (RuntimeException) ex;//

        }else{
            runtimeException = new RuntimeException("未知错误");//将异常错误转换成文本位置错误。
        }

        String message = runtimeException.getMessage();//获取错误信息并转换成字符串
        logger.info(message);
        ModelAndView mm = new ModelAndView();//新建一个视图对象

        mm.addObject("message", message);//将错误信息传到页面

        mm.setViewName("error");//指向错误页面

        return mm;

    }
}









//public class CustomExceptionler implements HandlerExceptionResolver{
//
//    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//
//        //handler就是处理器适配器要执行Handler对象（只有method）
//        //解析出异常类型
//        //如果该 异常类型是系统 自定义的异常，直接取出异常信息，在错误页面展示
//        //String message = null;
//        //if(ex instanceof CustomException){
//        //message = ((CustomException)ex).getMessage();
//        //}else{
//        ////如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
//        //message="未知错误";
//        //}
//
//        //上边代码变为
//        RuntimeException runtimeException;//获取异常错误提示，逆向生成中的example中带有异常抛出
//        if(ex instanceof CustomException){//判断对象是否为特定类的实例
//            runtimeException = (RuntimeException) ex;//
//        }else{
//            runtimeException = new RuntimeException("未知错误");//将异常错误转换成文本位置错误。
//        }
//
//        String message = runtimeException.getMessage();//获取错误信息并转换成字符串
//
//        ModelAndView mm = new ModelAndView();//新建一个视图对象
//
//        mm.addObject("message", message);//将错误信息传到页面
//
//        mm.setViewName("error");//指向错误页面
//
//        return mm;
//
//    }
//}