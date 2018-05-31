package com.neorays.themeleaf.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


public class User {
	
	@NotEmpty
	@NotNull
	private String user_name;
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	private String password;
	@NotNull
	private String conform_password;
	@NotNull
	private String phone;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		System.out.println("User Setter's");
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		this.password = password;
	}
	public String getConform_password() {
		return conform_password;
	}
	public void setConform_password(String conform_password) {
	
		this.conform_password = conform_password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", email=" + email
				+ ", password=" + password + ", conform_password="
				+ conform_password + ", phone=" + phone + "]";
	}
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("User");
	}
}
