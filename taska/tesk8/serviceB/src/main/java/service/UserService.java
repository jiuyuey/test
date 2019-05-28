package service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserExample;

import java.util.List;
/**
 * B
 */
@Service
public interface UserService {

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> select(String user);
}
