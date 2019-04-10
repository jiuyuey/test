import Dao.Mapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class TwoTest {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    UserService userService = (UserService) ctx.getBean("userServiceImpl");

    @Test//批量增加
    public void test_insert_test()throws Exception{
        for (int y = 0;y <= 3;y++) {
            List<User> list = new ArrayList<>();
            for (int x = 0;x <= 10;x++){
                User user = new User();
                user.setName("dhdshtrhtjhdyd");
                user.setPassword("dggedagergbergbg");
                user.setCreateat(2017);
                user.setUpdateat(2018);
                list .add(user);
            }
            userService.inserttest(list);
        }
    }
}