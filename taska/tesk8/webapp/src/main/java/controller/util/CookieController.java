package controller.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieController {

//    org.apache.log4j.Logger logger = Logger.getLogger(CookieController.class);
//    public static void createCookie(String key, String value, HttpServletResponse response){
//        Cookie cookie = new Cookie(key,value);
//        cookie.setMaxAge(-1);
//        cookie.setPath("/");
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.addCookie(cookie);
//    }

    public static void deletaCookie(String key, String value, HttpServletResponse response){//接收传入的名称，值和需要返回的响应
        Cookie cookie = new Cookie(key, value);//新建一个cookie
        cookie.setMaxAge(0);//为零时，删除这个cookie
        cookie.setPath("/");//要和需要删除的cookie的路径相同
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.addCookie(cookie);//将cookie添加响应，没有这个响应cookie就没有动作。
    }

    public static Cookie getCookie(String name, HttpServletRequest request){//获得Http中的请求和名字
        Cookie[] cookies = request.getCookies();//将请求中的名字取出
        Cookie cookie = null;//返回一个空值
        if (cookies != null){//获得的cookies不为空
            for (int i = 0;i < cookies.length; i++){//将所有的cookie循环
                if (cookies[i].getName().equals(name)){//循环出的cookie中的名字和页面传来的名字相同时
                    cookie = cookies[i];
                    break;//跳出多层循环
                }
            }
        }
        return cookie;//返回cookie
    }


    public static void createCookie(String md5,String value, HttpServletResponse response) {//cookie生成
        Cookie cookie = new Cookie(md5,value);//新建一个cookie
        cookie.setMaxAge(3600);//失效时间
        cookie.setPath("/");//cookie的使用路径
        response.setContentType("text/html;charset=UTF-8");//内容类型为文本
        response.setCharacterEncoding("UTF-8");//字符集为UTF-8
        response.addCookie(cookie);//cookie响应
    }
}
