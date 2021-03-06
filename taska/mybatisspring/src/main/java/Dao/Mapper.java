package Dao;

import org.springframework.stereotype.Repository;
import pojo.User;

import java.util.List;
@Repository
public interface Mapper {
    List<User> all();
    void update(User user);
    User delete(User user);
    User findById(User user);
    List<User> findAll();
    User insert(User user);
    User inserttest(List<User> user);
    User deletetest(int id);
    User updatetest(User user);

}
