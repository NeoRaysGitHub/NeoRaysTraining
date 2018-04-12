package com.neo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.dao.EmployeeDao;
import com.neo.dao.EmployeeDaoImpl;
import com.neo.entity.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	public String saveEmployee(Employee employee) {
		String status = "Fail";
		int count = employeeDao.saveEmployee(employee);
		if(count > 0 ){
			status = "success";
		}
		return status;
	}

}
