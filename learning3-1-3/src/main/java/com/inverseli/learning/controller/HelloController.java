package com.inverseli.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inverseli.learning.exception.MyException;

/**  
 * @date：2018年9月19日 上午11:43:26    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
// @RestController用于描述REST服务，相当于@Controller+@ResponseBody
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() throws Exception {
		throw new Exception("发生错误");
	}
	
	@RequestMapping("/json")
	public String json() throws Exception {
		throw new MyException("发生错误2");
	}
	
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}

  
