package service.serivcelmpe;

import dao.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserExample;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpe implements UserService {

    Logger logger = Logger.getLogger(UserServiceImpe.class);

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private MemcachedClient memcachedClient;

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Override
    public long countByExample(UserExample example) {
        return userMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {

//        try {    //memcached的
//            logger.info("判断有无缓存");
//            memcachedClient.set(record.getName(), 3600, record);//将数据缓存
//            memcachedClient.replace("count" + record.getName(),3600,1);//将缓存中的数据替换
//        } catch (InterruptedException | MemcachedException | TimeoutException e){
//            e.printStackTrace();
//        }
//        try {
//            logger.info("判断有没有");
//            redisTemplate.opsForValue().get("med");
//            redisTemplate.opsForValue().set("med",record.getName());
//            logger.info("22222222222");
//        }catch (InternalError error){
//            error.printStackTrace();
//        }
//        logger.info("444444444444444444");
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return userMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> select(String name) {
        return userMapper.select(name);
    }
}
