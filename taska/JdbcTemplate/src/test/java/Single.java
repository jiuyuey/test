import Dao.EmployeeDao;
import User.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class Single {

    private ApplicationContext ctx = null;//私用 上下文配置文件 ctx空集
    private JdbcTemplate jdbcTemplate = null;//私用 定义jdbctemplate为空集

    @Test
    public void test() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");//使用ClassPathXmlApplicationContext  bean定义加载多个上下文文件
        EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");//将dao层的Employeedao包 实例化注入进 测试下Atest里
        User employee = employeeDao.get(1);//将接口接至用户层，并赋值id为1
        System.out.println(employee);//打印输出id当前的行信息
    }
}
