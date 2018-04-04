package com.cluster;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserTo{
	@NotNull
	@Size(min = 5, max = 10)
	private String name;
	@NotNull
	@Size(max = 15)
	private String password;
	
	
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
}