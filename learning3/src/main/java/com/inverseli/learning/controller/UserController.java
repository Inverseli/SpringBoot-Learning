package com.inverseli.learning.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inverseli.learning.entity.User;

/**  
 * @date：2018年9月21日 上午10:53:20    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RestController
@RequestMapping("/users") // /user请求映射到此controller
public class UserController {
	// 类似与ConcurrentHashMap，Map同步
	static Map<Long,User> users = Collections.synchronizedMap(new HashMap<Long,User>());
	
	// @GetMapping = @RequestMapping(value="/",method=RequestMethod.GET)
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>(users.values());
		return userList;
	}
	
	@PostMapping("/")
	public String postUser(@ModelAttribute User user) {
		// @ModelAttribute绑定参数，或者 @RequestParam从页面传递参数
		users.put(user.getId(), user);
		return "success";
	}
	
	@GetMapping(value="/{id}")
	public User getUser(@PathVariable Long id) {
		// url的id可通过@PathVariable绑定到参数中
		return users.get(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }
}

  
