package service;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
import pojo.User;

import java.util.List;

@Service
public class UserServiceImpe implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User finAll(){
        return userMapper.finAll();
    }

//
//    public List<User> selectAll() {
//        return userMapper.selectAll();
//    }

    @Override
    public  List<Admin> findThe(Admin admin){
        return userMapper.findThe(admin);
    }

    @Override
    public List<User> update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User delete(int id){
        return userMapper.delete(id);
    }

    @Override
    public User insert(User user){
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAll(int Start, int pageSize){

    return userMapper.selectAll(Start,pageSize);
    }


//    @Override
//    public User selectUserByUsernameAndPassword(User user) {
//        User m = userMapper.selectUserByUsernameAndPassword(user);
//        return m;
//    }
}
