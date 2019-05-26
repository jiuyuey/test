package service.serivcelmpe;

import dao.StudentsMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import pojo.Students;
import pojo.StudentsExample;
import service.StudentsService;

import java.util.List;

@Service
public class StudentsServiceImpe implements StudentsService {

    org.apache.log4j.Logger logger = Logger.getLogger(StudentsServiceImpe.class);

    @Autowired
    private StudentsMapper studentsMapper;

//    @Autowired
//    private MemcachedClient memcachedClient;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public long countByExample(StudentsExample example){

//        Long count = null;//计数的类型为长整型     memcached的
//        try {
//            logger.info("判断缓存有没有");
//            count = memcachedClient.get("count"+example);//从缓存中取出数据
//        } catch (InterruptedException | MemcachedException | TimeoutException e){//捕捉异常
//            e.printStackTrace();//打印异常
//            logger.info("没有");
//        }
//        if (count == null){//判断缓存中没有数据
//            count = studentsMapper.countByExample(example);//从数据库中查询数据
//            try {
//                memcachedClient.set("count"+example,3600,1);//将数据库中查询的数据放入缓存
//            } catch (InterruptedException | MemcachedException | TimeoutException e){//捕捉异常
//                e.printStackTrace();//打印异常
//            }
//        }
//        return count;

        Long count = null;
        try {
            logger.info("1111111111111111111");
            count = (Long) redisTemplate.opsForValue().get("count" + example);
        }catch (InternalError error){
            error.printStackTrace();
        }
        if (count == null){
            logger.info("2222222222222222222222");
            count = studentsMapper.countByExample(example);
            try {
                logger.info("333333333333333333333");
                redisTemplate.opsForValue().set("count",3600,1);
            }catch (InternalError error){
                error.printStackTrace();
            }
        }
        return count;
//        return studentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentsExample example) {
        return studentsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Students record) {
        return studentsMapper.insert(record);
    }

    @Override
    public int insertSelective(Students record) {
        return studentsMapper.insertSelective(record);
    }

    @Override
    public List<Students> selectByExample(StudentsExample example) {

        return studentsMapper.selectByExample(example);
    }

    @Override
    public Students selectByPrimaryKey(Integer id) {
        return studentsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Students record, StudentsExample example) {
        return studentsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Students record, StudentsExample example) {
        return studentsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Students record) {
        return studentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Students record) {
        return studentsMapper.updateByPrimaryKey(record);
    }
}
