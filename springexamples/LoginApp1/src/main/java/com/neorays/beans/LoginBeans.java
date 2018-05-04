package com.neorays.beans;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBeans {
	@NotEmpty(message="Please enter your username")
	String name;
	@NotEmpty(message="Please enter your username")
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBeans [name=" + name + ", password=" + password + "]";
	}
	
	
}
