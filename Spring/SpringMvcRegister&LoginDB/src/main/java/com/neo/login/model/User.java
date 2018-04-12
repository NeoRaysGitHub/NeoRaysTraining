package com.neo.login.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotNull(message="Id should not be empty")
	private int user_id;
	@NotEmpty(message="Name can't be empty")
	private String username;
	@NotEmpty(message="Password can't be empty")
	private String password;
	@NotEmpty(message="Type should be empty")
	private String role;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
