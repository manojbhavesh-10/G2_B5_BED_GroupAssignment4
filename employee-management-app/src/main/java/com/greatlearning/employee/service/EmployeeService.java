package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	String deleteEmployeeById(long id);
	
	List<Employee> getEmployeeSortedByFirstName(String order);
	
	List<Employee> searchByFirstName(String firstName);
	
	

}
