package com.inverseli.learning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inverseli.learning.domain.User;
import com.inverseli.learning.domain.UserRepository;

/**
 * @author liyuhao
 * @date 2018年9月30日上午10:13:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest 
public class ApplicationTest {

	@Autowired
	private UserRepository userRepository;

	@Before
	public void before() {
		userRepository.save(new User("AAA", 10));
	}

	@Test
	public void test() throws Exception {
		User u1 = userRepository.findByName("AAA");
		System.out.println("第一次查询：" + u1.getAge());

		User u2 = userRepository.findByName("AAA");
		System.out.println("第二次查询：" + u2.getAge());
	}

}
