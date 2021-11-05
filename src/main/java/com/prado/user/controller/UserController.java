package com.prado.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prado.user.VO.UDResponseTemplateVO;
import com.prado.user.entity.User;
import com.prado.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/fetch/{id}")
	public User findUser(@PathVariable("id") Long userId) {
		log.info("User Controller: find-user: " + userId);
		return userService.findUser(userId);
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		log.info("User Controller: save-user: " + user);
		return userService.saveUser(user);
	}
	
	@GetMapping("/user-dept/{id}")
	public UDResponseTemplateVO findDepartmentByUserId(@PathVariable("id") Long userId) {
		log.info("User Controller: findUserDepartmentByUserId: " + userId);
		return userService.findDepartmentByUserId(userId);
	}

}
