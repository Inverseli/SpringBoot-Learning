package com.inverseli.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import com.inverseli.learning.domain.User;

/**  
 * @date：2018年9月26日 下午12:27:59    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Configuration
public class RedisConfig {

	@Bean
	public RedisTemplate<String,User> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String,User> template = new RedisTemplate<String,User>();
		template.setConnectionFactory(redisConnectionFactory);
		RedisSerializer<String> stringSerializer = new StringRedisSerializer();
		template.setKeySerializer(stringSerializer);
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}
}
  
