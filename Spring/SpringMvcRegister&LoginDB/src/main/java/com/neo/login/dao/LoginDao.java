package com.neo.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.neo.login.model.Login;
import com.neo.login.model.User;

@Repository("loginDao")
public class LoginDao {
	static final String SQL_USER_SELECT = "SELECT USERNAME,ROLE FROM LOGIN WHERE USERNAME = ? AND PASSWORD = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Login login(Login login) {
		return login;
	}
	public int userRegister(User user){
		return 0;
		
	}
}
