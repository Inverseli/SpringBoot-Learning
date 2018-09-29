package com.inverseli.learning;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**  
 * @date：2018年9月19日 上午11:38:55    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@SpringBootApplication
@EnableScheduling // 启用定时任务的配置
public class HelloApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class,args);
	}

}
  
