package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.model.Role;

public interface RoleService {
	
	List<Role> getAllRoles();

	Role saveRole(Role role);
}
