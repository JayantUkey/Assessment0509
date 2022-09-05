package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmp(){
		return employeeService.getEmployees();
	}

	@PostMapping
	public void save(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody @PathVariable int id, Employee employee)
	{
		Employee e = employeeService.updateEmployee(id);
		e.setName(employee.getName());
		e.setDesignation(employee.getDesignation());
		e.setSalary(employee.getSalary());
		
		employeeService.saveEmployee(e);
	}
	
	@DeleteMapping
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
