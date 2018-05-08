package com.indian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indian.dao.EmployeeDAO;
import com.indian.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public void addEmployee(Employee employee) {
		System.out.println("EmployeeServiceImpl>>addEmployee");
		employeeDAO.addEmployee(employee);
	}

	
	@Transactional
	public List<Employee> getAllEmployees() {
		System.out.println("EmployeeServiceImpl>>getAllEmployees");
		return employeeDAO.getAllEmployees();
	}

	
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		System.out.println("EmployeeServiceImpl>>deleteEmployee");
		employeeDAO.deleteEmployee(employeeId);
	}

	public Employee getEmployee(int empid) {
		System.out.println("EmployeeServiceImpl>>getEmployee"+empid);
		return employeeDAO.getEmployee(empid);
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeServiceImpl>>updateEmployee");
		return employeeDAO.updateEmployee(employee);
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

}
