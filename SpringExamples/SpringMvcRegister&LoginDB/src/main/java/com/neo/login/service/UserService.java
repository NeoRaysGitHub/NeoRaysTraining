package com.neo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.login.dao.UserDao;
import com.neo.login.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public String registerUser(User user) {
		String status = "failuer";
		//call dao
		int count = userDao.registerUser(user);
		if(count > 0){
			status = "success";
		}
		return status;
	}
}
