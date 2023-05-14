package com.greatlearning.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String greeting() {
		return "<h1>Welcome to Employee Management Application</h1>";
	}

	@PostMapping("/addEmployee")
	public Employee addEmployee(Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> fetchAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/getEmployeeById")
	public Employee fetchEmployeeById(Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/sortEmployee")
	public List<Employee> fetchEmployeeSortedByFirstName(String order) {
		return employeeService.getEmployeeSortedByFirstName(order);
	}

	@GetMapping("/search")
	public List<Employee> searchEmployeeByFirstName(String firstName) {
		return employeeService.searchByFirstName(firstName);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(Employee theEmployee) {
		return employeeService.updateEmployee(theEmployee);
	}

	@DeleteMapping("/deleteEmployeeById")
	public String deleteEmployeeById(long id) {
		Employee theEmployee = employeeService.getEmployeeById(id);
		return employeeService.deleteEmployeeById(id);
	}

}
