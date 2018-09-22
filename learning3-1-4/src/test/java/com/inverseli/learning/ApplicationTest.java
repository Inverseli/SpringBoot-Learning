package com.inverseli.learning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inverseli.learning.service.UserService;


/**  
 * @date：2018年9月22日 下午11:55:03    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class ApplicationTest {

	@Autowired
	private UserService userService;
	@Before
	public void setUp() {
		userService.deleteAllUser();
	}
	
	@Test
	public void test() {
		userService.create("a", 1);
		userService.create("b", 2);
		userService.create("c", 3);
		userService.create("d", 4);
		userService.create("e", 5);
		
			
		
		// 删除两个用户
		userService.deleteByName("a");
		userService.deleteByName("e");

		// 查数据库，应该有5个用户
	}
}
  
