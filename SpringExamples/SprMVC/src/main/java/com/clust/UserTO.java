package com.clust;

import org.springframework.stereotype.Component;

@Component
public class UserTO 
{
	private String username;
	private String password;
	
	public UserTO() {
		System.out.println("default constructor..."+getClass().getSimpleName());
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
	
	
	
}
