package controller.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisUtil{
    // 通过构造方法注入
//    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /*
     * 如果使用注解注入RedisTemplate对象，则不需要该setter方法
     */
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * String类型缓存获取
     * @param key 键
     * @return 值
     */
    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * String类型缓存保存
     * @param key 键
     * @param value 值
     * @return true：成功；false：失败
     */
    public boolean set(String key, Object value) {
        try {
            if (StringUtils.isNotEmpty(key) && null != value) {
                redisTemplate.opsForValue().set(key, value);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // ... ...
}
