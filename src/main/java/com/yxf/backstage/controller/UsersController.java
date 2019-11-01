package com.yxf.backstage.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yxf.backstage.domain.Users;
import com.yxf.backstage.service.UsersService;

/**
 * 控制层</br>
 * @author win
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);
	
	@Autowired
	private UsersService usersService;
	/**
	 * 请求路径参数  </br>
	 * @PathVariable 获取路径参数。即url/{id}这种形式。</br>
	 * @RequestParam 获取查询参数。即url?name=这种形式 </br>
	 * @param name
	 * @param password
	 * @return
	 */
	@GetMapping("/login/{name}/{password}")
	public String login(@PathVariable(name="name") String name,@PathVariable(name="password") String password) {
		int result = usersService.longin(name, password);
		String message = "Success";
		if(result <= 0) {
			message = "Failure";
		}
		return name + " is login : " + message;
	}
	@GetMapping("/login2")
	public String login2(@RequestParam(name="name") String name) {
		LOGGER.info("request param is : {}",name);
		return name;
	}
	//===============post==========================
	/**
	 * @RequestBody
	 * @param users
	 * @return
	 */
	@PostMapping("/login3")
	public String login3(@RequestBody Users users) {
		LOGGER.info("post request body param is : {}",users.toString());
		return users.getUserName();
	}
	
	/**
	 * @RequestBody map
	 * @param users
	 * @return
	 */
	@PostMapping("/login4")
	public String login4(@RequestBody Map<String,String> userMap) {
		LOGGER.info("post request body param is : login4 {}", userMap.toString());
		return userMap.toString();
	}
	
	/**
	 * pojo
	 * @param users
	 * @return
	 */
	@PostMapping("/login5")
	public String login5(Users users) {
		LOGGER.info("post request body param is : login5 {}", users.toString());
		return users.toString();
	}
}
