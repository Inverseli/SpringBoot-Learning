package com.inverseli.springcloud.service;

import java.util.List;
import com.inverseli.springcloud.entities.Dept;

/**
 * @author liyuhao
 * @date 2018年10月1日下午8:17:46
 */
public interface DeptService {

	boolean addDept(Dept dept);
	
	Dept findById(Long id);
	
	List<Dept> findAll();
}
