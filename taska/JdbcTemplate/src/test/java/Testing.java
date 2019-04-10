import User.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    private ApplicationContext ctx = null;//私用 上下文配置文件 ctx空集
    private JdbcTemplate jdbcTemplate = null;//私用 定义jdbctemplate为空集
    {
        ctx = new ClassPathXmlApplicationContext("beans.xml");//使用ClassPathXmlApplicationContext  bean定义加载多个上下文文件
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");//将空集的jdbctemplate加载至beans文件中的jdbctemplate
    }

    @Test
    public void test_Update(){
        String sql = "UPDATE user set  name=? WHERE id=?";//定义sql增加语句
        jdbcTemplate.update(sql,"jak",3);//将增加的信息更新至jdbctemplate
    }

    @Test
    public void test_insert(){
        String sql = "INSERT INTO user(name, password, id) VALUES(?,?,?)";//定义sql更新语句

        List<Object[]> batchss = new ArrayList<Object[]>();//定义数组，以数组的形式多条更新

        batchss.add(new Object[]{"aaa","bgbg",36});
        batchss.add(new Object[]{"bbb","cdcd",37});
        batchss.add(new Object[]{"ccc","vfvf",38});

        jdbcTemplate.batchUpdate(sql, batchss);//将更新的信息更新至jdbctemplate
    }


    /**
     * 从数据库中获取一条记录，实际得到对应的一个对象
     * 注意：不是调用 queryForObject(String sql, Class<Employee> requiredType, Object... args) 方法!
     * 而需要调用 queryForObject(String sql, RowMapper<Employee> rowMapper, Object... args)
     * 1、其中的 RowMapper 指定如何去映射结果集的行，常用的实现类为 BeanPropertyRowMapper
     * 2、使用 SQL中的列的别名完成列名和类的属性名的映射，例如 last_name lastName
     * 3、不支持级联属性。 JdbcTemplate 只能作为一个 JDBC 的小工具, 而不是 ORM 框架
     */
    @Test
    public void test_check(){
        String sql = "SELECT id, name Name,password,id as \"department.id\" FROM USER WHERE id = ?";//根据id数查询数据
        //BeanPropertyRowMapper可自动将一行数据映射到指定类的实例中 它首先将这个类实例化，然后通过名称匹配的方式，映射到属性中去
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        //在将数据装入对象时需要调用set方法。
        User employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);//将表中的数据进行筛选

        System.out.println(employee);//打印输出表信息
    }

    @Test
    public void test_more(){
        String sql = "SELECT id, name Name,password From user WHERE id > ? ";//查询多个对象
        //BeanPropertyRowMapper可自动将一行数据映射到指定类的实例中 它首先将这个类实例化，然后通过名称匹配的方式，映射到属性中去
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        List<User> emps = jdbcTemplate.query(sql,rowMapper,6);//将表中的数据进行筛选

        System.out.println(emps);//打印输出表信息
    }

    @Test
    public void test_calculate(){
        String sql = "SELECT count(id) FROM user";//计算表中有多少条数据
        long count = jdbcTemplate.queryForObject(sql,long.class);//查询并返回表中共有多少条数据

        System.out.println(count);//打印表中共有多少数据
    }
}
