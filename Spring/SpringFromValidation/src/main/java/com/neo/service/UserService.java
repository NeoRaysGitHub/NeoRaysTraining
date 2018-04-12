package com.neo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

	@Autowired
	private com.neo.dao.UserDAO userDAO;
	
	public List<com.neo.model.User> getUserList() {
		return userDAO.getUserList();
	}

	public void createUser(com.neo.model.User user) {
		userDAO.addUser(user);
	}
}
