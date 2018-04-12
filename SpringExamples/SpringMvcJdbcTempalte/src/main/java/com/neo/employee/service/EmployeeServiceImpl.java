package com.neo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.employee.dao.EmployeeDao;
import com.neo.employee.model.Employee;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Employee getEmployee(int empno) {
		return employeeDao.getEmployee(empno);		 
	}

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public List<Employee> getAllEmployees(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}

}
