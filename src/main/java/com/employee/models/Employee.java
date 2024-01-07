package com.employee.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	@Pattern(regexp = "(\\+91|0)[6-9][0-9]{9}",message = "Invalid Phone No." )
	private String phone;
	
	
	@Column
	@NotBlank(message = "Name Cannot be blank")
	private String name;
	
	@Column
	@NotNull(message = "Surname cannot be null")
	private String surname;
	
	@Column
	@Min(value=10000, message = "Salary cannot be less than 10000")
	private long salary;
	
	@Column
	@NotBlank(message = "Location Cannot be blank")
	private String location;
	
	@Column
	@Email(message = "Email is invalid")
	private String email;
	
	@CreationTimestamp
	private Date creationDate;
	
	@UpdateTimestamp
	private Date udatedDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUdatedDate() {
		return udatedDate;
	}

//	public void setUdatedDate(Date udatedDate) {
//		this.udatedDate = udatedDate;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee(int id, @Pattern(regexp = "(\\+91|0)[6-9][0-9]{9}", message = "Invalid Phone No.") String phone,
			@NotBlank(message = "Name Cannot be blank") String name,
			@NotNull(message = "Surname cannot be null") String surname,
			@Min(value = 10000, message = "Salary cannot be less than 10000") long salary,
			@NotBlank(message = "Location Cannot be blank") String location,
			@Email(message = "Email is invalid") String email, Date creationDate, Date udatedDate) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.location = location;
		this.email = email;
		this.creationDate = creationDate;
		this.udatedDate = udatedDate;
	}

	public Employee() {
		super();
	}

}
