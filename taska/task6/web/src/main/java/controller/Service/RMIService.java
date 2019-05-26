//package service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.Random;
//
///**
// * @program: task8v1
// * @description:
// * @author: LZP
// * @create: 2019-05-04 15:30
// **/
//@Service
//public class RMIService {
//    @Qualifier("userService")
//    @Autowired
//    private  UserService userService;
//    @Qualifier("professionalService")
//    @Autowired
//    private ProfessionalService professionalService;
//    @Qualifier("recommendedService")
//    @Autowired
//    private  RecommendedService recommendedService;
//    @Qualifier("studentsService")
//    @Autowired
//    private  StudentsService studentsService;
//    @Qualifier("userServiceB")
//    @Autowired
//    private  UserService userServiceB;
//    @Qualifier("professionalServiceB")
//    @Autowired
//    private ProfessionalService professionalServiceB;
//    @Qualifier("recommendedServiceB")
//    @Autowired
//    private  RecommendedService recommendedServiceB;
//    @Qualifier("studentsServiceB")
//    @Autowired
//    private  StudentsService studentsServiceB;
//
//    private Logger logger=Logger.getLogger(RMIService.class);
//    public UserService getUserService(){
//        Integer random = new Random().nextInt(2);
//        if (random == 0) {
//            try {
//                logger.info("启用service服务A");
//                return   userService;
//            }catch (Exception e){
//                logger.info("A出错，启用service服务B");
//                return userServiceB;
//            }
//        } else {
//            try {
//                logger.info("启用service服务B");
//                return   userServiceB;
//            }catch (Exception e){
//                logger.info("B出错，启用service服务A");
//                return userService;
//            }
//        }
//    }
//    public ProfessionalService getProfessionalService(){
//        Integer random = new Random().nextInt(2);
//        if (random == 0) {
//            try {
//                logger.info("启用service服务A");
//                return   professionalService;
//            }catch (Exception e){
//                logger.info("A出错，启用service服务B");
//                return professionalServiceB;
//            }
//        } else {
//            try {
//                logger.info("启用service服务B");
//                return   professionalServiceB;
//            }catch (Exception e){
//                logger.info("B出错，启用service服务A");
//                return professionalService;
//            }
//        }
//    }
//    public RecommendedService getRecommendedService(){
//        Integer random = new Random().nextInt(2);
//        if (random == 0) {
//            try {
//                logger.info("启用service服务A");
//                return   recommendedService;
//            }catch (Exception e){
//                logger.info("A出错，启用service服务B");
//                return recommendedServiceB;
//            }
//        } else {
//            try {
//                logger.info("启用service服务B");
//                return   recommendedServiceB;
//            }catch (Exception e){
//                logger.info("B出错，启用service服务A");
//                return recommendedService;
//            }
//        }
//    }
//    public StudentsService getStudentsService(){
//        Integer random = new Random().nextInt(2);
//        if (random == 0) {
//            try {
//                logger.info("启用service服务A");
//                return  studentsService;
//            }catch (Exception e){
//                logger.info("A出错，启用service服务B");
//                return studentsServiceB;
//            }
//        } else {
//            try {
//                logger.info("启用service服务B");
//                return   studentsServiceB;
//            }catch (Exception e){
//                logger.info("B出错，启用service服务A");
//                return studentsService;
//            }
//        }
//    }
//}
