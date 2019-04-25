import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.User;
import service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//
@ContextConfiguration("classpath:mybatisconfig.xml")
public class TestClass {
    @Autowired
    private UserService userService;
    @Test
    public void tttt(){
        List<User> list=userService.selectAll(0,5);
        System.out.println(list);
    }
}
