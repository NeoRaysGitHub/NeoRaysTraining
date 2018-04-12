package com.neo.dao;

import java.sql.SQLException;

import com.neo.form.UserForm;
import com.neo.form.UserRegisterForm;

public interface UserDao {
	public UserForm login(UserForm form) throws ClassNotFoundException, SQLException;
	public int registerUser(UserRegisterForm registerFrom) throws ClassNotFoundException, SQLException;
}
