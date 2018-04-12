package com.neo.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {
	@NotEmpty(message = "Name can't be empty.")
	private String name;
	@Min(value = 12, message = "Age should not be less then 12")
	@Max(value = 120, message = "age should not be more then 120")
	@NotNull(message = "Should not be empty")
	private int age;
	@NotEmpty(message="Email can't be empty")
	@Email
	private String email;
	
	@NotEmpty(message="Should not be empty")
	@Min(value = 10,message= "Phone should have 10 numbers")
	private String phone;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
