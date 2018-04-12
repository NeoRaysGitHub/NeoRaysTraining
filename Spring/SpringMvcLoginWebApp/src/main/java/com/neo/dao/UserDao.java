package com.neo.dao;

import org.springframework.stereotype.Repository;

import com.neo.bean.UserBean;
@Repository
public class UserDao {
	public int login(String username,String password){
		UserBean user = new UserBean();
		user.setUsername("suresh");
		user.setPassword("reddy");
		int count = 0;
		if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
			count = 1;
		}
		return count;
		
	}
}
