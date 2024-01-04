package com.employee.service;

import java.util.List;

import com.employee.models.Employee;


public interface ServiceInf {

	public String SaveEmployee(Employee employee);

	public List<Employee> getEmployees();

	public List<Employee> deleteEmployee(int id);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getNameAndSurname(String name, String surname);

	public List<Employee> getDistinctName(String name);
	
}
