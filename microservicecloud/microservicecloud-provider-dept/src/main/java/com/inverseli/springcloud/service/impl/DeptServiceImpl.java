package com.inverseli.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inverseli.springcloud.dao.DeptMapper;
import com.inverseli.springcloud.entities.Dept;
import com.inverseli.springcloud.service.DeptService;

/**
 * @author liyuhao
 * @date 2018年10月1日下午8:18:14
 */
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptDao;
	
	@Override
	public boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
