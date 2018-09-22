package com.inverseli.learning.service;   
/**  
 * @date：2018年9月22日 下午11:46:02    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
public interface UserService {
	/**
	 * @author liyuhao
	 * @date 2018年9月22日 下午11:47:28
	 * @param name
	 * @param age void
	 * @description:
	 */
	void create(String name,Integer age);
	/**
	 * @author liyuhao
	 * @date 2018年9月22日 下午11:48:02
	 * @param name void
	 * @description:
	 */
	void deleteByName(String name);
	/**
	 * @author liyuhao
	 * @date 2018年9月22日 下午11:48:38
	 * @return Integer
	 * @description: 获得用户总数
	 */
	Integer getAllUsers();
	/**
	 * @author liyuhao
	 * @date 2018年9月22日 下午11:48:59 void
	 * @description:
	 */
	void deleteAllUser();
}
  
