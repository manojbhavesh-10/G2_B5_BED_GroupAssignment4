package com.greatlearning.employee.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.repository.EmployeeRepository;
import com.greatlearning.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		  
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee theEmployee = employeeRepository.findById(id).get();
		System.out.println(theEmployee);
		if(theEmployee == null) {
			throw new RuntimeException("Did not get the id " + id);
		} else {
			return theEmployee;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
		  
	}

	@Override
	public String deleteEmployeeById(long id) {
		employeeRepository.deleteById(id);
		return "Deleted employee id - "+ id;
	}

	@Override
	public List<Employee> getEmployeeSortedByFirstName(String order) {
		if(order.equals("asc")) {
			return employeeRepository.findAll(Sort.by("firstName").ascending());
		} else if(order.equals("desc")) {
			return employeeRepository.findAll(Sort.by("firstName").descending());
		}
		throw new RuntimeException("Please enter an order as 'asc' or 'desc' ");
	}

	@Override
	public List<Employee> searchByFirstName(String firstName) {
		return employeeRepository.findByFirstNameContainingIgnoreCase(firstName);
	}
	

	
}
