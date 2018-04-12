package com.neo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.bean.UserBean;
import com.neo.dao.UserDao;

@Service
public class LoginService {
	@Autowired
	private UserDao dao;
	
	public String login(String username,String password){
		String msg = "Login failure";
		int count = dao.login(username, password);
		if(count > 0)
			msg = "Login Success";
		return msg;
		
	}
	
}
