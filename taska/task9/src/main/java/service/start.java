package service;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;
import service.add.Add;
import service.mange.Mang;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @program: task9v6
 * @description:
 * @author: LZP
 * @create: 2019-05-07 15:19
 **/
public class start {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
//     System.setProperty("java.rmi.server.hostname","127.0.0.1");
      Node node = NodeFactory.newInstance().createNode("Calculator.composite");//获取Calculator配置文件中的节点
      node.start();//打开节点
      Add c = (Add) Naming.lookup("//127.0.0.1:9999/addRMIService");//查找add的实现类
      System.out.println(c.add(1,5));//接口的数据中放入数据，通过实现类来实现，之前定好的算法。
      Mang d = (Mang) Naming.lookup("rmi://127.0.0.1:9999/mangRMIService");//查找mang的实现类
      System.out.println(d.bbc(4,6));
      System.out.println("tuscany服务启动");

    }
}
