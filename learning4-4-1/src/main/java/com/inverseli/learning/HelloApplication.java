package com.inverseli.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author liyuhao
 * @date 2018年9月30日上午9:56:42
 */
@SpringBootApplication
@EnableCaching // 使用springboot的缓存
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
