package com.neo.service;

import java.sql.SQLException;

import com.neo.form.RegisterForm;

public interface EmployeeService {
	public String saveEmployee(RegisterForm form) throws ClassNotFoundException,SQLException;
}
