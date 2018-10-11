package com.inverseli.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
	@Autowired
	private DiscoveryClient client;
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午4:38:00
	 * @description 服务端 - 添加dept人员
	 */
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept) {
		return deptService.addDept(dept);
	}
	
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午4:38:44
	 * @description 服务端 - 根据id获得dept人员
	 */
	@GetMapping("/dept/list/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}
	
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午4:39:37
	 * @description 服务端 - 得到所有的dept人员
	 */
	@GetMapping("/dept/all")
	public List<Dept> getAll() {
		return deptService.findAll();
	}
	
	@RequestMapping(value="/dept/discovery",method=RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("***" + list);
		
		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + '\t' + element.getHost() + '\t' + element.getPort() + '\t' + element.getUri());
			
		}
		return this.client;
	}
	
}
