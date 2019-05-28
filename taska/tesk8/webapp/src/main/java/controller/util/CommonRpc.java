package controller.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 短信发送
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.0.3</version>
</dependency>
*/
public class CommonRpc {

    public static void main(String phone, long c) {
        String a = "LTAIJSj0QxidWRZL";
        String b = "oT1TgRGJkSu4qHIuJx7zwBcjSHYTeS";//请求签名
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", a, b);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);//传输的方法类型
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");//地区编号杭州
        request.putQueryParameter("PhoneNumbers", phone);//接收的手机号码
        request.putQueryParameter("SignName", "jiuyuey");//签名要和创建的签名一样
        request.putQueryParameter("TemplateCode", "SMS_166377239");//发送短信的模板编号
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + c + "\"}");//验证码
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}