package com.inverseli.test.dao;

import com.inverseli.test.pojo.AdminUsers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminUsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(AdminUsers record);

    int insertSelective(AdminUsers record);

    AdminUsers selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(AdminUsers record);

    int updateByPrimaryKey(AdminUsers record);

    List<Object> selectAll();
}