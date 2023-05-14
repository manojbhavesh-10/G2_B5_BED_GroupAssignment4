package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.model.User;

public interface UserService {

	List<User> getAllUser();

	User saveUser(User user);
}
