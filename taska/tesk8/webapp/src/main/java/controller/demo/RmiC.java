//package controller.demo;
//
//
//
//import service.Rmidemo;
//
//import java.net.MalformedURLException;
//import java.rmi.Naming;
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
//
///**
// * 客户端程序
// */
//public class RmiC {
//    public static void main(String[] args){
//        try {
//            Rmidemo rmi = (Rmidemo) Naming.lookup("rmi://127.0.0.1:8888/Rmi");
//            System.out.println(rmi);
//            System.out.println(rmi.sayHello("mmmmmmmmmm"));
//        } catch (RemoteException | NotBoundException | MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//}
