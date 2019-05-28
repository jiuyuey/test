import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务器端程序
 */
public class RMIService {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:mybatisconfig.xml");
    }

}
