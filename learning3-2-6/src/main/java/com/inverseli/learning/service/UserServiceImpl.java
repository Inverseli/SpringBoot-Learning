package com.inverseli.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author liyuhao
 * @date 2018年9月28日下午4:24:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
			jdbcTemplate.update("insert into user(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
			jdbcTemplate.update("delete from user where NAME = ?", name);
    }


    @Override
    public void deleteAllUsers() {
			jdbcTemplate.update("delete from user");
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from user", Integer.class);
    }


}

