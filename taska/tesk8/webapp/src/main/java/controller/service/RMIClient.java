//package controller.service;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import service.*;
//
///**
// * 客户端程序
// */
//public class RMIClient{
//
////    public static void main(String[] args) {
////        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
////        RmiService rmiService =  applicationContext.getBean("myRMIClient", RmiService.class);
////        System.out.println(rmiService.getAdd(3, 4));
////    }
//
//    public static ProfessionalService RmiRrodessional() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
//        ProfessionalService professionalService =  applicationContext.getBean("ProfessionalService", ProfessionalService.class);
//        return professionalService;
//    }
//
//    public static RecommendedService RmiRecommended() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
//        RecommendedService recommendedService =  applicationContext.getBean("RecommendedService", RecommendedService.class);
//        return recommendedService;
//    }
//
//    public static StudentsService RmiStudents() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
//        StudentsService studentsService =  applicationContext.getBean("StudentsService", StudentsService.class);
//        return studentsService;
//    }
//
//    public static UserService RmiUser() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
//        UserService userService =  applicationContext.getBean("UserService", UserService.class);
//        return userService;
//    }
//}