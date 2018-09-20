package com.inverseli.learning.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**  
 * @date：2018年9月20日 下午3:50:26    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Data
@ConfigurationProperties
public class FooProperties {
	
	private String foo;
	private String databasePlatform;
}
  
