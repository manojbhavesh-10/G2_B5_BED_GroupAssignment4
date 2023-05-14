package com.greatlearning.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employee.model.Role;
import com.greatlearning.employee.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping("/getAllRoles")
	public List<Role> fetchAllRoles() {
		return roleService.getAllRoles();
	}

	@PostMapping("/addRole")
	public Role addRole(Role role) {
		return roleService.saveRole(role);
	}

}
