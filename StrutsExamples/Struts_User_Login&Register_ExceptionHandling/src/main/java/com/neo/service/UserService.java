package com.neo.service;

import java.sql.SQLException;

import com.neo.form.UserForm;
import com.neo.form.UserRegisterForm;

public interface UserService {
	public UserForm login(UserForm form) throws ClassNotFoundException, SQLException;
	public String registerUser(UserRegisterForm registerFrom) throws ClassNotFoundException, SQLException;
}
