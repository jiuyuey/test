package Dao;

import pojo.User;

import java.util.List;

public interface Mapper {
    List<User> all();
    void update(User user);
    User delete(User user);
    User findById(User user);
    List<User> findAll(String string);
    User insert(User user);
    User inserttest(List<User> user);
    User deletetest(int id);
    User updatetest(User user);


/*@Select("SELECT * FROM user WHERE id = #{id}")
User getUser(@Param("userId") String userId);*/
}
