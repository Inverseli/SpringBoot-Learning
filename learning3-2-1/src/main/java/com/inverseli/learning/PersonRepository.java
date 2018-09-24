package com.inverseli.learning;

import javax.naming.Name;

import org.springframework.data.repository.CrudRepository;

import com.inverseli.learning.entity.Person;

/**  
 * @date：2018年9月24日 上午12:30:56    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
public interface PersonRepository extends CrudRepository<Person, Name>{

}
  
