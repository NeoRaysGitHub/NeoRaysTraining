package com.neo.service;

import java.sql.SQLException;
import java.util.List;

import com.neo.form.EmployeeForm;
import com.neo.dao.EmployeeDao;
import com.neo.dao.EmployeeDaoImpl;


public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao = null;
	int count = 0;
	String result = "Failure";
	public String saveEmployee(EmployeeForm from)
			throws ClassNotFoundException, SQLException {
		// get the dao object
		dao = new EmployeeDaoImpl();
		// call the dao methods
		count = dao.saveEmployee(from);
		if(count > 0)
			result = "Success";
		return result;
	}

	

	public String deleteEmployee(int employee_id) throws ClassNotFoundException, SQLException {
		// get the dao object
		dao = new EmployeeDaoImpl();
		// call the methods
		count = dao.deleteEmployee(employee_id);
		if(count > 0)
			result = "Success";
		return result;
	}

	public String updateEmployee(EmployeeForm from) throws ClassNotFoundException, SQLException {
				// get the dao object
				dao = new EmployeeDaoImpl();
				// call the dao methods
				count = dao.updateEmployee(from);
				if(count > 0)
					result = "Success";
				return result;
	}


}
