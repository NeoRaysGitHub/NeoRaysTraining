package com.neo.service;

import java.sql.SQLException;

import com.neo.dao.UserDao;
import com.neo.dao.UserDaoImpl;
import com.neo.form.UserForm;
import com.neo.form.UserRegisterForm;

public class UserServiceImpl implements UserService{
	String result = "Failure";
	public UserForm login(UserForm form) throws ClassNotFoundException,
			SQLException {
		UserDao dao = new UserDaoImpl();
		UserForm userForm = dao.login(form);
		return userForm;
	}
	public String registerUser(UserRegisterForm registerFrom)
			throws ClassNotFoundException, SQLException {
		// call the dao method
		UserDao dao = new UserDaoImpl();
		int count = dao.registerUser(registerFrom);
		if(count > 0)
			result = "Success";
		return result;
	}
	
}
