package com.neo.dao;

import java.sql.SQLException;
import java.util.List;

import com.neo.form.EmployeeForm;


public interface EmployeeDao {
	public int saveEmployee(EmployeeForm from) throws ClassNotFoundException, SQLException;
	public int updateEmployee(EmployeeForm from) throws ClassNotFoundException, SQLException;
	public int deleteEmployee(int employee_id) throws ClassNotFoundException, SQLException;
}
