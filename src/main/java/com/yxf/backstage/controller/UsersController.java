package com.yxf.backstage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yxf.backstage.service.UsersService;

/**
 * 控制层
 * @author win
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/login/{name}/{password}")
	public String login(@PathVariable String name,@PathVariable String password) {
		int result = usersService.longin(name, password);
		String message = "Success";
		if(result <= 0) {
			message = "Failure";
		}
		return name + " is login : " + message;
	}
}
