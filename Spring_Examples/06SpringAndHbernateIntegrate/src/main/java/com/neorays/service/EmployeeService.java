package com.neorays.service;

import java.util.List;

import com.neorays.model.Employee;


public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	
	
	public List<Employee> listEmployees();


}
