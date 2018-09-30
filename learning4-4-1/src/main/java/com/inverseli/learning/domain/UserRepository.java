package com.inverseli.learning.domain;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author liyuhao
 * @date 2018年9月30日上午10:07:12
 */
@CacheConfig(cacheNames = "Users") // 缓存在名为Users的对象中
public interface UserRepository extends JpaRepository<User,Long>{
	// 将该方法的返回值存入缓存中，并在查询时先从缓冲中获取，获取不到，在到数据库中进行获取
	@Cacheable 
	User findByName(String name);
	
	User findByNameAndAge(String name,Integer age);
	@Query("from User u where u.name=:name")
	User findUser(@Param("name") String name);
}
