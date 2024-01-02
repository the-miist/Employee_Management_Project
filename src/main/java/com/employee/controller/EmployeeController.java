package com.employee.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.models.Employee;
import com.employee.service.ServiceInf;

@RestController
public class EmployeeController {

	ServiceInf service;
	
	@PostMapping("/employee/save")
	public String saveEmployee(@RequestBody Employee employee) {
		return null;
	}
}
