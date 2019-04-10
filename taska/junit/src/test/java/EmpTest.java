//定义包
//引入包
import org.junit.Test;
import the.testclass.Emp;
import the.testclass.Empp;
//引入包
import static org.junit.Assert.assertEquals;
//公有类Emptest
public class EmpTest {
    //创建新的empp
    Empp empp = new Empp();
    //创建新的emp
    Emp emmp = new Emp();

    //测试
    @Test
    //公有无返回you
    public void you(){
        //姓名rwby
        emmp.setName("rwby");
        //age 7
        emmp.setAge(7);
        //the 100
        emmp.setThe(100);
        //双精度浮点类型emm等于empp的类fakeyou
        double emm = empp.fakeyou(emmp);
        //
        assertEquals(1200,emm,0.0);
    }

    //测试
    @Test
    //无返回公共类aryouok
    public void aryouok(){
        //姓名rwby
        emmp.setName("rwby");
        //age 77
        emmp.setAge(77);
        //the 100
        emmp.setThe(100);
        //双精度浮点类型salary等于empp里的fakeyou的类
        double salary = empp.fakeyou(emmp);
        //
        assertEquals(1200,salary,0.0);
    }
}
