package com.inverseli.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.inverseli.learning.service.UserService;

/**  
 * @date：2018年9月22日 下午11:46:53    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	@Override
	public void create(String name, Integer age) {
		jdbcTemplate.update("insert into USER(NAME,AGE) values (?,?)",name,age);
	}

	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("delete from USER where NAME = ?",name);
	}

	@Override
	public Integer getAllUsers() {
		return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
	}

	@Override
	public void deleteAllUser() {
		jdbcTemplate.update("delete from USER");
	}

}
  
