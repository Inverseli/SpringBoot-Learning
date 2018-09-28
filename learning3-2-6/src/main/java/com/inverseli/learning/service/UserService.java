package com.inverseli.learning.service;

/**
 * @author liyuhao
 * @date 2018年9月28日下午4:23:01
 */
public interface UserService {
	
    void create(String name, Integer age);

    void deleteByName(String name);

    Integer getAllUsers() throws Exception;

    void deleteAllUsers();

}

