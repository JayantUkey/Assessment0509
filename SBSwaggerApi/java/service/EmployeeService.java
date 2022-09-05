package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
		return "Employee Information saved Successfully";
	}
	
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(int id) {
		return employeeRepository.getOne(id);
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
	
}
