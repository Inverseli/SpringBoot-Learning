package com.inverseli.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.inverseli.springcloud.entities.Dept;

/**
 * @author liyuhao
 * @date 2018年10月1日下午7:58:52
 */
@Mapper
public interface DeptMapper {

	boolean addDept(Dept dept);
	
	Dept findById(Long id);
	
	List<Dept> findAll();
	
}
