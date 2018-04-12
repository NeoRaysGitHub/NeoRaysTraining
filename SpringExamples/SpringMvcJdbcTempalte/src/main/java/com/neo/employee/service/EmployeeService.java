package com.neo.employee.service;

import java.util.List;

import com.neo.employee.model.Employee;


public interface EmployeeService {
	public Employee getEmployee(int empno);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployees(int deptno);
}
