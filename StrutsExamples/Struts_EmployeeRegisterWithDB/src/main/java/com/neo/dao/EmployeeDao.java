package com.neo.dao;

import java.sql.SQLException;
import java.util.List;

import com.neo.form.RegisterForm;

public interface EmployeeDao {
	public int saveEmployee(RegisterForm form) throws ClassNotFoundException, SQLException;
	public List<RegisterForm> getEmployees() throws ClassNotFoundException, SQLException;
}
