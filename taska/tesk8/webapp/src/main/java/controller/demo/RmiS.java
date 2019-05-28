//package controller.demo;
//
//import org.apache.log4j.Logger;
//
//import service.Rmidemo;
//import service.serivcelmpe.RmiService;
//
//import java.net.MalformedURLException;
//import java.rmi.AlreadyBoundException;
//import java.rmi.Naming;
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//
///**
// * 服务器端程序
// */
//public class RmiS {
//    public static void main(String[] args){
//        org.apache.log4j.Logger logger = Logger.getLogger(RmiS.class);
//        try {
//            //创建一个远程对象
//            Rmidemo rmi = new RmiService();
//
//            //远程主机远程对象注册表Registry的实例，并指定端口8888（java默认是1099）
//            //缺少了注册表创建的话，则无法绑定对象到远程注册表上。
//            LocateRegistry.createRegistry(8888);
//
//            //把远程对象绑定到RMI注册服务器上，并命名
//            //绑定的URL标准格式为：rmi：//host：port/name（协议名可以省略。）
//            Naming.bind("rmi://127.0.0.1:8888/Rmi",rmi);
////            Naming.bind("//localhost:8888/Rmi",rmi);
//
//            logger.info("远程对象绑定成功");
//            //必须捕获这三个异常。
//        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
