package service;

import dao.Mapper;
import User.User;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Single {
    public static void main(MysqlxDatatypes.Scalar.String[] args){
        try {
            Reader reader = Resources.getResourceAsReader("bean.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            Mapper mapper = session.getMapper(Mapper.class);
            User user = mapper.findById(8);//查询id为8的行数据
            session.close();//结束会话
            System.out.println(user.toString());//将表中信息转换为字串符输出
        }catch (IOException e){//异常管理，打印堆栈信息
            e.printStackTrace();
        }
    }
}
