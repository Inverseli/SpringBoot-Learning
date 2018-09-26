package com.inverseli.learning.domain;

import java.io.Serializable;

import lombok.Data;

/**  
 * @date：2018年9月26日 下午12:44:18    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  序列化对象，redis保存对象需进行序列化
 */
@Data
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private Integer age;
	
	public User(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}
	
}
  
