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

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**  
 * @date：2018年9月22日 上午10:31:24    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

	
		// 类似与ConcurrentHashMap，Map同步
		static Map<Long,User> users = Collections.synchronizedMap(new HashMap<Long,User>());
		
		
		// @GetMapping = @RequestMapping(value="/",method=RequestMethod.GET)
		@ApiOperation(value="获取用户列表",notes="")
		@RequestMapping(value="/",method=RequestMethod.GET)
		public List<User> getUserList() {
			List<User> userList = new ArrayList<User>(users.values());
			return userList;
		}
		
		@ApiOperation(value="创建用户",notes="根据User对象创建用户")
		@ApiImplicitParam(name="user",value="用户实体类",required=true,dataType="User")
		@PostMapping("/")
		public String postUser(@ModelAttribute User user) {
			// @ModelAttribute绑定参数，或者 @RequestParam从页面传递参数
			users.put(user.getId(), user);
			return "success";
		}
		
		@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
		@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
		@GetMapping(value="/{id}")
		public User getUser(@PathVariable Long id) {
			// url的id可通过@PathVariable绑定到参数中
			return users.get(id);
		}
		
	    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
	    @ApiImplicitParams({
	            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
	            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
	    })
		@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
	        // 处理"/users/{id}"的PUT请求，用来更新User信息
	        User u = users.get(id);
	        u.setName(user.getName());
	        u.setAge(user.getAge());
	        users.put(id, u);
	        return "success";
	    }

	    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
	    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	    public String deleteUser(@PathVariable Long id) {
	        // 处理"/users/{id}"的DELETE请求，用来删除User
	        users.remove(id);
	        return "success";
	    }


}
  
