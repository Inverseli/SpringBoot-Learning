package com.inverseli.learning;

import java.util.HashMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liyuhao
 * @date 2018年9月30日上午10:13:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest 
public class ApplicationTest {

	@Autowired
	RabbitTemplate rabbitTemplate;
	// 发送消息
	@Test
	public void test() {
		HashMap<String,Object> map = new HashMap<>();
		map.put("msg", "这是第一个消息");
		rabbitTemplate.convertAndSend("exchange.direct", "atguigu.news",map);
	}
	// 接收消息
	@Test
	public void receive() {
		Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
		System.out.println(o.getClass());
		System.out.println(o);
	}

}
