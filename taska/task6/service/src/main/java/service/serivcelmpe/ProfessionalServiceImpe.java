package service.serivcelmpe;


import dao.ProfessionalMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import pojo.Professional;
import pojo.ProfessionalExample;
import service.ProfessionalService;

import java.util.List;

@Service
public class ProfessionalServiceImpe implements ProfessionalService {

    org.apache.log4j.Logger logger = Logger.getLogger(ProfessionalServiceImpe.class);

    @Autowired
    private ProfessionalMapper professionalMapper;

//    @Autowired
//    private MemcachedClient memcachedClient;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public long countByExample(ProfessionalExample example) {
        return professionalMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ProfessionalExample example) {
        return professionalMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return professionalMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Professional record) {
        return professionalMapper.insert(record);
    }

    @Override
    public int insertSelective(Professional record) {
        return professionalMapper.insertSelective(record);
    }

    @Override
    public List<Professional> selectByExample(ProfessionalExample example) {

//        List<Professional> count = null;//设置一个空的count    memcached的
//        try {
//            logger.info("判断缓存有没有");
//            count = memcachedClient.get("count" + example);//取出缓存
//        } catch (InterruptedException | MemcachedException | TimeoutException e){//捕捉异常
//            e.printStackTrace();//打印异常
//            logger.info("没有");
//        }
//        if (count == null) {//判断缓存没有值
//            logger.info("判断count是不是空");
//            count = professionalMapper.selectByExample(example);//查询数据库中的数值
//            try {
//                memcachedClient.set("count" + example, 3600, 1);//将查询到的集合放入缓存，设置值的 过期时间，
//            } catch (InterruptedException | MemcachedException | TimeoutException e){//捕捉异常
//                e.printStackTrace();//打印异常
//            }logger.info("2222222");
//        }
//        return count;

        List<Professional> count = null;
        try {
            logger.info("判断有无缓存");
            count = (List<Professional>) redisTemplate.opsForValue().get("count" + example);
        }catch (InternalError error){
            error.printStackTrace();
        }
        if (count == null){
            logger.info("判断缓存有木有");
            count = professionalMapper.selectByExample(example);
            try {
                redisTemplate.opsForValue().set("count" + example, 3000);
            }catch (InternalError error){
                error.printStackTrace();
            }
        }
        return count;
//        return professionalMapper.selectByExample(example);
    }

    @Override
    public Professional selectByPrimaryKey(Integer id) {
        return professionalMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Professional record, ProfessionalExample example) {
        return professionalMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Professional record, ProfessionalExample example) {
        return professionalMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Professional record) {
        return professionalMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Professional record) {
        return professionalMapper.updateByPrimaryKey(record);
    }
}
