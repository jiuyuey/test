package controller.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 邮箱发送工具类
 */

public class SendCommonPostMail {

    public static void main(String email, long b) throws IOException {
        org.apache.log4j.Logger logger = Logger.getLogger(SendCommonPostMail.class);
        final String url = "http://api.sendcloud.net/apiv2/mail/send";
        final String apiUser = "jiuyuey_test_MQ9Cxw";
        final String apiKey = "GDccAZKQDF9oesTe";
        logger.info("判断");
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httPost = new HttpPost(url);

        List<BasicNameValuePair> params = new ArrayList<>();

        // 您需要登录SendCloud创建API_USER，使用API_USER和API_KEY才可以进行邮件的发送。
        params.add(new BasicNameValuePair("apiUser", apiUser));
        params.add(new BasicNameValuePair("apiKey", apiKey));
        //发件人
        params.add(new BasicNameValuePair("from", "service@sendcloud.im"));
        params.add(new BasicNameValuePair("fromName", "jiuyuey"));
        //收件人
        params.add(new BasicNameValuePair("to", email));
        params.add(new BasicNameValuePair("subject", "来自SendCloud的第一封邮件！"));
        params.add(new BasicNameValuePair("html", "你太棒了！你已成功的从SendCloud发送了一封测试邮件，接下来快登录前台去完善账户信息吧！验证码" + b ));


        httPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        // 请求
        HttpResponse response = httpclient.execute(httPost);
        // 处理响应
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) { // 正常返回
            // 读取xml文档
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        } else {
            System.err.println("error");
        }
        httPost.releaseConnection();
    }
}



//    public static void main(String[] args) throws IOException {
//        final String url = "http://api.sendcloud.net/apiv2/mail/send";
//        final String apiUser = "您账户中的API_USER";
//        final String apiKey = "您自己设置的API_KEY";
//
//        HttpClient httpclient = new DefaultHttpClient();
//        HttpPost httPost = new HttpPost(url);
//
//        List params = new ArrayList();
//        // 您需要登录SendCloud创建API_USER，使用API_USER和API_KEY才可以进行邮件的发送。
//        params.add(new BasicNameValuePair("apiUser", apiUser));
//        params.add(new BasicNameValuePair("apiKey", apiKey));
//        params.add(new BasicNameValuePair("from", "service@sendcloud.im"));
//        params.add(new BasicNameValuePair("fromName", ""));
//        params.add(new BasicNameValuePair("to", "收件人地址"));
//        params.add(new BasicNameValuePair("subject", "来自SendCloud的第一封邮件！"));
//        params.add(new BasicNameValuePair("html", "你太棒了！你已成功的从SendCloud发送了一封测试邮件，接下来快登录前台去完善账户信息吧！"));
//
//        httpost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
//        // 请求
//        HttpResponse response = httpclient.execute(httPost);
//        // 处理响应
//        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) { // 正常返回
//            // 读取xml文档
//            String result = EntityUtils.toString(response.getEntity());
//            System.out.println(result);
//        } else {
//            System.err.println("error");
//        }
//        httpost.releaseConnection();
//    }