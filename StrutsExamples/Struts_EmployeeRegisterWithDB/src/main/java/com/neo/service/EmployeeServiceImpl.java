package com.neo.service;

import java.sql.SQLException;
import java.util.List;

import com.neo.dao.EmployeeDao;
import com.neo.dao.EmployeeDaoImpl;
import com.neo.form.RegisterForm;

public class EmployeeServiceImpl implements EmployeeService {

	public String saveEmployee(RegisterForm form) throws ClassNotFoundException, SQLException {
		String result = "Failure";
		EmployeeDao dao = new  EmployeeDaoImpl();
		// call the dao method
		int count = dao.saveEmployee(form);
		if(count > 0)
			result = "Success";		
		return result;
	}
	public List<RegisterForm> getEmployees() throws ClassNotFoundException, SQLException{
		EmployeeDao dao = new  EmployeeDaoImpl();
		// call the dao
		List list = dao.getEmployees();		
		return list;		
	}

}
