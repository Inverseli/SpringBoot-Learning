package com.inverseli.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.inverseli.springcloud.entities.Dept;

/**
 * @author liyuhao
 * @date 2018年10月3日下午4:52:21
 */
@RestController
public class DeptController_Consumer {

	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate; // 访问远程http服务 客户端
	
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午5:19:21
	 * @description 客户端 - 添加dept人员
	 */
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject( // method - post
				REST_URL_PREFIX + "/dept/add", // url
				dept,  // request parameter
				Boolean.class); // resultType
	} 
	
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午5:19:52
	 * @description 客户端 - 根据id查询dept人员
	 */
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(
				REST_URL_PREFIX + "/dept/list/" + id,  // url
				Dept.class); // resultType.class
	}
	
	/**
	 * @author liyuhao
	 * @data 2018年10月3日下午5:20:15
	 * @description 客户端 - 获取全部的dept人员
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(
				REST_URL_PREFIX + "/dept/all", 
				List.class);
	}
	
	/**
	 * @author liyuhao
	 * @data 2018年10月11日下午2:01:46
	 * @description
	 */
	@RequestMapping(value="/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(
				REST_URL_PREFIX + "/dept/discovery", 
				Object.class);
	}
}
