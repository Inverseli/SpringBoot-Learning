package com.inverseli.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liyuhao
 * @date 2018年10月3日下午4:43:12
 */
@Configuration // 相当于applicationContext.xml
public class ConfigBean {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}

/* 
@Bean
public UserService getUserService() {
	return new UserServiceImpl();
}
applicationContext.xml == ConfigBean(@Configuration)
<bean id="userService" class="com.inverseli.tmall.UserServiceImpl">
*/