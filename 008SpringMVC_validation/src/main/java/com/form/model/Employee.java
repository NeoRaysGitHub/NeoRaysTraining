package com.form.model;

import javax.validation.constraints.Pattern;



public class Employee {

	private int id;
	@Pattern(regexp="([a-zA-Z]*)",  message="should not contain numeric")
	private String name;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}