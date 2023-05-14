package com.greatlearning.employee.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.model.Role;
import com.greatlearning.employee.repository.RoleRepository;
import com.greatlearning.employee.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

}
