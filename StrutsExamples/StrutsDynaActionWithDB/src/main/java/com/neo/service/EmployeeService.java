package com.neo.service;

import java.sql.SQLException;

import com.neo.form.EmployeeForm;
public interface EmployeeService {
	public String saveEmployee(EmployeeForm from) throws ClassNotFoundException, SQLException;
	public String updateEmployee(EmployeeForm from) throws ClassNotFoundException, SQLException;
	public String deleteEmployee(int employee_id) throws ClassNotFoundException, SQLException;
}
