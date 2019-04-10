package service;

import org.springframework.stereotype.Service;
import pojo.User;

import java.util.List;

public interface UserService {
    List<User> all();
    void update(User user);
    User delete(User user);
    User findById(User user);
    List<User> findAll(String string, String user);

    List<User> findAll(String string);

    User insert(User user);
    User inserttest(List<User> user);
    UserService deletetest(int id);
    User updatetest(User user);


}
