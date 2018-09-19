package com.inverseli.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**  
 * @date：2018年9月19日 上午11:43:26    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RestController
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String toTest() {
		return "Hello World!";
	}
}
  
