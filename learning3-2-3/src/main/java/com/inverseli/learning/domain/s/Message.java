package com.inverseli.learning.domain.s;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**  
 * @date：2018年9月25日 上午11:34:37    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Data
@Entity
public class Message {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String content;

	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public Message() {
		super();
	}
	
	
}
  
