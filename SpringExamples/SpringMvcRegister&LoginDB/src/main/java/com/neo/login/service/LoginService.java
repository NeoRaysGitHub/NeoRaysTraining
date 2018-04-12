package com.neo.login.service;

import org.springframework.stereotype.Service;

import com.neo.login.model.Login;

@Service
public class LoginService {
	public String login(Login login){
		String result = "failure";
		if(login.getUsername().equalsIgnoreCase("suresh") && login.getPassword().equalsIgnoreCase("reddy"))
			result =  "success";
		return result;
	}
}
