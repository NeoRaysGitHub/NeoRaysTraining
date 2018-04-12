package com.neo.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.neo.login.model.User;

@Repository("userDao")
public class UserDao {
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	public int registerUser(User user) {
		String sql = "insert into user_details values(?,?,?,?)";
		int count = jdbcTemplate.update(sql, user.getUser_id(),user.getUsername(),user.getPassword(),user.getRole());
		return count;
		
	}
}
