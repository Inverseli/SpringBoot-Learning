package com.inverseli.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * @date：2018年9月19日 上午11:43:26    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String toTest() {
		return "Hello World";
	}
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("host","http://blog.inverseli.com");
		return "index";
	}
	
}

  
