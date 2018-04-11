package com.neorays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.dao.EmployeeDAO;
import com.neorays.model.Employee;




@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	public void setemployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void addEmployee(Employee employee) {
		
		System.out.println("inside service layer");
		
		employeeDAO.addEmployee(employee);
	}

	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}



	

	
	

	}

