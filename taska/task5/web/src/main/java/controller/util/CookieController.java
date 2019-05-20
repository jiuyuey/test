package controller.util;

import org.apache.log4j.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieController {

    org.apache.log4j.Logger logger = Logger.getLogger(CookieController.class);
//    public static void createCookie(String key, String value, HttpServletResponse response){
//        Cookie cookie = new Cookie(key,value);
//        cookie.setMaxAge(-1);
//        cookie.setPath("/");
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.addCookie(cookie);
//    }

    public static void deletaCookie(String key, String value, HttpServletResponse response){
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
    }

    public static Cookie getCookie(String name, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        if (cookies != null){
            for (int i = 0;i < cookies.length; i++){
                if (cookies[i].getName().equals(name)){
                    cookie = cookies[i];
                    break;
                }
            }
        }
        return cookie;
    }


    public static void createCookie(String md5,String value, HttpServletResponse response) {//cookie生成
        Cookie cookie = new Cookie(md5,value);//新建一个cookie
        cookie.setMaxAge(100);//失效时间
        cookie.setPath("/");//cookie的使用路径
        response.setContentType("text/html;charset=UTF-8");//内容类型为文本
        response.setCharacterEncoding("UTF-8");//字符集为UTF-8
        response.addCookie(cookie);//cookie响应
    }
}
