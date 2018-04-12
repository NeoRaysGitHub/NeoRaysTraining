package com.cluster.service;

import java.sql.SQLException;

import com.cluster.dao.UserDao;
import com.cluster.pojo.User;

public class UserService {
	public static User getUser(String username,String password) throws ClassNotFoundException, SQLException{
		// call the dao methods
		UserDao userDao = new UserDao();
		User user = userDao.getUser(username, password);
		return user;
	}
}
