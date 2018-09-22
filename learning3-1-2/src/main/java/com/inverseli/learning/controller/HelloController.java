package com.inverseli.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

/**  
 * @date：2018年9月19日 上午11:43:26    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
// @RestController用于描述REST服务，相当于@Controller+@ResponseBody
@RestController
public class HelloController {
	
	@ApiIgnore
	@RequestMapping("/hello")
	public String toTest() {
		return "Hello World!";
	}
	
}

  
