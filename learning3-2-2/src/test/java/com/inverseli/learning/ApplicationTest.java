package com.inverseli.learning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**  
 * @date：2018年9月25日 上午9:53:16    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate primaryJdbcTemplate;
	
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	private JdbcTemplate secondJdbcTemplate;
	@Before
	public void setUp() {
		primaryJdbcTemplate.update("DELETE FROM USER");
		secondJdbcTemplate.update("DELETE FROM USER");
	}
	
	@Test
	public void test() {
		primaryJdbcTemplate.update("insert into user(name,age) values (?,?)","li",9);
		primaryJdbcTemplate.update("insert into user(name,age) values (?,?)","lyh",29);
		secondJdbcTemplate.update("insert into user(name,age) values (?,?)","lyh",21);
		Assert.assertEquals("2", primaryJdbcTemplate.queryForObject("select count(1) from user", String.class));
		Assert.assertEquals("1", secondJdbcTemplate.queryForObject("select count(1) from user", String.class));
	}
}
  
