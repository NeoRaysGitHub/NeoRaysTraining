package com.neo.employee.dao;

import java.util.List;

import com.neo.employee.model.Employee;


public interface EmployeeDao {
	
	public Employee getEmployee(int empno);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployees(int deptno);

}
