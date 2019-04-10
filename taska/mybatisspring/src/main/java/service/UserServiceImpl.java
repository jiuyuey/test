package service;

import Dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Mapper mapper;
    @Override
    public List<User> all() {
        return mapper.all();
    }

    @Override
    public void update(User user) {
    }

    @Override
    public User delete(User user) {
        return mapper.delete(user);
    }

    @Override
    public User findById(User user) {
        return mapper.findById(user);
    }

    @Override
    public List<User> findAll(String string, String user) {
        return null;
    }

    @Override
    public List<User> findAll(String string) {
        return mapper.findAll();
    }

    @Override
    public User insert(User user) {
        return mapper.insert(user);
    }

    @Override
    public User inserttest(List<User> user) {
        return mapper.inserttest(user);
    }

    @Override
    public UserService deletetest(int id) {
        return null;
    }

    @Override
    public User updatetest(User user) {
        return null;
    }
}
