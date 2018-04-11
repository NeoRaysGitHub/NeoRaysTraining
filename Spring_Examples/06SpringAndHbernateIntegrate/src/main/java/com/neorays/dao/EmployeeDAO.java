package com.neorays.dao;

import java.util.List;

import com.neorays.model.Employee;



public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	
	
	public List<Employee> listEmployees();

}
