package service;

import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserExample;

import java.util.List;

@Service
public interface UserService {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

}