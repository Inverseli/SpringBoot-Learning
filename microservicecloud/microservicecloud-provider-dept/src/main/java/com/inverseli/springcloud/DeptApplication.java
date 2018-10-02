package com.inverseli.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liyuhao
 * @date 2018年10月1日下午8:37:53
 */
@SpringBootApplication // 只是扫描bean
@MapperScan("com.inverseli.springcloud.dao") // 与mybatis结合，扫描mapper.java ,如果mapper.java与mapper.xml在同一文件夹下就没必要
public class DeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeptApplication.class, args);
	}
}
