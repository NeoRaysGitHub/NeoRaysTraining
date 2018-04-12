package com.neo.login.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	@NotEmpty(message="Username can't be empty")
	private String username;
	@NotEmpty(message = "Password can't be empty")
	private String password;
	private String role;
	private String login_id;
	private String email;
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
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password
				+ ", role=" + role + ", login_id=" + login_id + ", email="
				+ email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
