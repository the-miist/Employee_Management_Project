package com.employee.controller;

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

import com.employee.models.Employee;
import com.employee.service.ServiceInf;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	ServiceInf service;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		return service.SaveEmployee(employee);
	}
	
	@GetMapping("/fetch")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id){
		return service.deleteEmployee(id);
	}
	
	@GetMapping("/fetch/{name}/{surname}")
	public List<Employee> getNameAndSurname(@PathVariable String name,@PathVariable String surname){
		return service.getNameAndSurname(name,surname);
	}
	
	@GetMapping("/distinct/{name}")
	public List<Employee> getDistictName (@PathVariable String name){
		return service.getDistinctName(name);
	}
	
	@GetMapping("/fetch/{salary}")
	public List<Employee> getEmployees(@PathVariable int salary){
		return service.getBySalary(salary);
	}
	
}
