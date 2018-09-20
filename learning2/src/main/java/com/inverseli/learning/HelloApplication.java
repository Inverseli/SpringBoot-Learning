package com.inverseli.learning;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

import com.inverseli.learning.entity.FooProperties;
import com.inverseli.learning.entity.PostInfo;

/**  
 * @date：2018年9月19日 上午11:38:55    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@SpringBootApplication
public class HelloApplication {
	
	/* springboot2.0 获取应用配置的方式 */
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloApplication.class,args);
		Binder binder = Binder.get(context.getEnvironment());
		
		// 绑定普通应用配置
		FooProperties foo = binder.bind("com.didispace", Bindable.of(FooProperties.class)).get();
		System.out.println(foo.getFoo());
		
		// 绑定list配置
		List<String> post = binder.bind("com.didispace.post", Bindable.listOf(String.class)).get();
		System.out.println(post);
		
		List<PostInfo> posts = binder.bind("com.didispace.posts", Bindable.listOf(PostInfo.class)).get();
		System.out.println(posts);
		
		// 读取配置
		System.out.println(context.getEnvironment().containsProperty("com.didispace.database-platform"));
		System.out.println(context.getEnvironment().containsProperty("com.didispace.databasePlatform"));
		
		
	}
	
	
}
  
