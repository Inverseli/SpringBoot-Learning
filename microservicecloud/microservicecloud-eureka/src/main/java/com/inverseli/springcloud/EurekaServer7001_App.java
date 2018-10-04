package com.inverseli.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liyuhao
 * @date 2018年10月4日下午2:21:41
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
