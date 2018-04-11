package com.neorays.dao;



import java.util.List;

import com.neorays.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void removeEmployee(int id);
	
	public List<Employee> listEmployees();

}
