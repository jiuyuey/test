package service;

import org.springframework.stereotype.Service;
import pojo.Admin;
import pojo.User;

import java.util.List;

@Service
public interface UserService {
    User finAll();
//    List<User> selectAll();
    List<Admin> findThe(Admin admin);
    List<User> update(User user);
    User delete(int id);
    User insert(User user);
    List<User> selectAll(int Start ,int pageSize);

//    Page selectAll(Page page);
//    public User selectUserByUsernameAndPassword(User user);
}
