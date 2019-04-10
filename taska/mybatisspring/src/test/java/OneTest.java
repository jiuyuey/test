import Dao.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.util.Collections;
import java.util.List;

public class OneTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() throws  Exception{
        //初始化spring容器
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test//根据名字（信息）查询
    public void test_findAll(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        List<User> user = mapper.findAll("aaa");
        for(User user1 :user){
            System.out.println(user1.getName());
        }
    }

    @Test//id查询  动态sql语句
    public void test_findById(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        User user = new User();
        user.setName("55");
        mapper.findById(user);
        System.out.println(mapper.findById(user));
    }

    @Test//删除 动态sql语句
    public void test_delete(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        User user = new User();
        user.setId(4);
        user.setName("dd");
        mapper.delete(user);
        System.out.println("删除完成");
    }

    @Test//更新id所在行表数据
    public void test_update(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        User user = new User();
        user.setId(4);
        user.setName("dd");
        user.setPassword("mn");
        mapper.update(user);
    }

    @Test//查询全部
    public void test_all(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        List<User> user = mapper.all();
        System.out.println(user.toString());
    }

    @Test//增加
    public void test_insert(){
        Mapper mapper = applicationContext.getBean(Mapper.class);
        User user = new User();
        user.setName("dd");
        user.setPassword("mn");
        mapper.insert(user);
    }//利用自增增加id数

    @Test//批量增加
    public void test_insert_test(){
        for (int x = 0;x < 1000;x++){
            Mapper mapper = applicationContext.getBean(Mapper.class);
            User user = new User();
            user.setName("dhdshtrhtjhdyd");
            user.setPassword("dggedagergbergbg");
            user.setCreateat(2018);
            user.setUpdateat(2019);
            mapper.inserttest(Collections.singletonList(user));
        }//利用自增自动增加id数
    }

    @Test//批量删除
    public void test_delete_test(){
        for (int x=1;x < 10;x++){
            Mapper mapper = applicationContext.getBean(Mapper.class);
            User user = mapper.deletetest(x);
            System.out.println("删除成功");
        }//将x每次的值给id，x循环的同时将在这个范围内的数据删除。
    }

    @Test//批量更新
    public void test_update_test(){
        for (int x=1;x<10;x++){
            Mapper mapper = applicationContext.getBean(Mapper.class);
            User user = new User();
            user.setId(4);
            user.setName("22");
            user.setPassword("33");
            mapper.updatetest(user);
            System.out.println("更新完成");
        }//对数据库中id在x的这个范围内的数据进行批量更新
    }
}
