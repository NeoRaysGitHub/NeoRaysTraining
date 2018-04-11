package com.neorays;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;


public class User {

	@NotEmpty
	@Pattern(regexp=("[^0-9]+"))
	private String name;
	@NotEmpty
	private String password;
	
	
	public String getName() {
		
		System.out.println("inside getter name");
		return name;
	}
	public void setName(String name) {
		
		System.out.println("inside setter name");
		
		this.name = name;
	}
	public String getPassword() {
		System.out.println("inside getter password");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("inside setter password");
		this.password = password;
	}
	
	

}
