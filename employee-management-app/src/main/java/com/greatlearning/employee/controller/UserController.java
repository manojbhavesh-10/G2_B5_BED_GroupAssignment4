package com.greatlearning.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employee.model.User;
import com.greatlearning.employee.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUser")
	public List<User> fetchAllUser() {
		return userService.getAllUser();
	}
	
	@PostMapping("/addUser") 
	public User addUser(User user) {
		return userService.saveUser(user);
	}
}
