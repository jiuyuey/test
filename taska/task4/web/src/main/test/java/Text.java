//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import pojo.Module;
//import pojo.ModuleExample;
//import service.ModuleService;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)//
//@ContextConfiguration("classpath:mybatisconfig.xml")
//public class Text {
//
//    @Autowired
//    private ModuleService moduleService;
//
//    @Test
//    public void ttt(){
//
////        Page page = new Page();
////        PageHelper.offsetPage(page.getStart(), page.getPageSize());
////        System.out.printf("111111111111111111111");
//
////        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mybatisconfig.xml");
////        ModuleService moduleService= (ModuleService) applicationContext.getBean(ModuleServiceImpe.class);
//        ModuleExample example = new ModuleExample();//创建Example对象
//        ModuleExample.Criteria criteria = example.createCriteria();//创建的查询条件
//        criteria.andIdBetween(1,2);//传入查询的参数
//        List<Module> list = moduleService.selectByExample(example);
////        System.out.printf("44444444444444444444");
////        long totat = new PageInfo<>(list).getTotal();
////        page.callbang(totat);
//        System.out.printf(String.valueOf(list));
//    }
//}
//
//
//
//
////        PageHelper.offsetPage(page.getStart(), page.getPageSize());//PageHelper分页插件的语句.
////
////                ModuleExample example=new ModuleExample();
////                ModuleExample.Criteria criteria=example.createCriteria();
////
////                List<Module> list = moduleService.selectByExample(example);
////
////        long totat = new PageInfo<>(list).getTotal();//PageHelper分页插件的语句.
////        page.callbang(totat);//PageHelper分页插件的语句.
//
