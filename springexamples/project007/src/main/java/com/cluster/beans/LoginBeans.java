package com.cluster.beans;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBeans {
	@NotEmpty(message="user name required")
	String user;
	@NotEmpty(message="password is required")
	String pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "LoginBeans [user=" + user + ", pass=" + pass + "]";
	}

}
