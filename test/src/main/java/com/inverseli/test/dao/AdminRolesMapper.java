package com.inverseli.test.dao;

import com.inverseli.test.pojo.AdminRoles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminRolesMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(AdminRoles record);

    int insertSelective(AdminRoles record);

    AdminRoles selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(AdminRoles record);

    int updateByPrimaryKey(AdminRoles record);

    List<Object> selectAllRoles();

    int selectCount();
}