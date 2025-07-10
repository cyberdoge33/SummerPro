package cn.sdu.fd.util;
import java.util.concurrent.TimeUnit;  // 必须添加这行
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setWithExpire(String key, Object value, long timeout, TimeUnit unit) {
        // Redis操作实现
    }
}