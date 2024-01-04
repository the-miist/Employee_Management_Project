package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.models.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeService implements ServiceInf {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public String SaveEmployee(Employee employee) {
		
		try {
			repo.save(employee);
			return "Employee Details Saved for Id: "+employee.getId();
		} catch (Exception e) {
			System.out.println(e);
			return "Something Went Wrong!!";
		}
	}

	@Override
	public List<Employee> getEmployees() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
		try {
			repo.deleteById(id);
			return repo.findAll();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		try {
			repo.save(employee);
			return repo.findById(employee.getId()).get();
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<Employee> getNameAndSurname(String name, String surname) {
		try {
			return repo.findByNameAndSurname(name, surname);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<Employee> getDistinctName(String name) {
		try {
			return repo.findDistinctByName(name);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
