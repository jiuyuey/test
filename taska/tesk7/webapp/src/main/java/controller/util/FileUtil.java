package controller.util;

import com.aliyun.oss.OSSClient;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**文件上传工具类
 *
 */

public class FileUtil {

    public static void fileup(MultipartFile file) throws IOException ,RuntimeException{
        org.apache.log4j.Logger logger = Logger.getLogger(FileUtil.class);
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";//连接节点
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIkisLIqNplPLp";
        String accessKeySecret = "NB7iG2W3iV2Oz6co2agPy5IkcpL613";//密钥

        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId,accessKeySecret);

        // 上传Byte数组。
        byte[] content = file.getBytes();
        logger.info(file);
        ossClient.putObject("mykon", "kon/"+file.getOriginalFilename(), new ByteArrayInputStream(content));
        // 关闭OSSClient。
        ossClient.shutdown();
    }
}

