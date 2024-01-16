package com.artemoleshev.spring.mvc;

import java.util.HashMap;
import java.util.Map;

import com.artemoleshev.spring.mvc.validation.CheckEmail;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Employee {
	@Size(min = 2, message = "name must be minimum 2 symbols")
	private String name;
	
	@NotBlank(message = "surname is required field")
	private String surname;
	
	@Min(value = 500, message = "must be greater than 499")
	@Max(value = 1000, message = "must be less than 499")
	private int salary;
	
	private String department;
	private Map<String, String> departments;
	private String gender;
	private Map<String, String> genders;
	private String[] languages;
	
	@Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",
			message = "please use pattern XXX-XX-XX")
	private String phoneNumber;
	
	@CheckEmail
	private String email;
	
	public Employee() {
		departments = new HashMap<>();
		departments.put("IT", "Information Technology");
		departments.put("HR", "Human Resources");
		departments.put("Sales", "Sales");
		
		genders = new HashMap<>();
		genders.put("man", "man");
		genders.put("woman", "woman");
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Map<String, String> getDepartments() {
		return departments;
	}

	public void setDepartments(Map<String, String> departments) {
		this.departments = departments;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Map<String, String> getGenders() {
		return genders;
	}

	public void setGenders(Map<String, String> genders) {
		this.genders = genders;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", salary=" + salary + ", department=" + department
				+ "]";
	}
}
