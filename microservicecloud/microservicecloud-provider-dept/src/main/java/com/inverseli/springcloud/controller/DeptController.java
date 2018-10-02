package com.inverseli.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inverseli.springcloud.entities.Dept;
import com.inverseli.springcloud.service.DeptService;

/**
 * @author liyuhao
 * @date 2018年10月1日下午8:23:37
 */
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept) {
		return deptService.addDept(dept);
	}
	@GetMapping("/dept/list")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}
	@GetMapping("/dept/all")
	public List<Dept> getAll() {
		return deptService.findAll();
	}
	
}
