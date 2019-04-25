package dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Admin;

import pojo.User;

import java.util.List;

@Repository
public interface UserMapper {
    User finAll();
//    List<User> selectAll();
    List<Admin> findThe(Admin admin);
    List<User> update(User user);
    User delete(int id);
    User insert(User user);
    List<User> selectAll(@Param("Start") int Start ,@Param("pageSize") int pageSize);//注解param参数绑定

//    Page selectAll(Page page);

//    User selectUserByUsernameAndPassword(User user);
}
