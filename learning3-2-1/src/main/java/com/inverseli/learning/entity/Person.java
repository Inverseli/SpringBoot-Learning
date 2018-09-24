package com.inverseli.learning.entity;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;
import lombok.Data;

/**  
 * @date：2018年9月24日 上午12:24:44    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Entry(base = "ou=people,dc=learning,dc=inverseli,dc=com",objectClasses="inetOrgPerson")
@Data
public class Person {
	
	@Id
	private Name id;
	@DnAttribute(value="uid",index = 3)
	private String uid;
	@Attribute(name = "cn")
	private String commonName;
	@Attribute(name = "sn")
	private String suerName;
	private String userPassword;
}
  
