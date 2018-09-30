package com.inverseli.learning.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author liyuhao
 * @date 2018年9月30日上午10:02:04
 */
@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer age;

	public User() {
		super();
	}

	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	
}
