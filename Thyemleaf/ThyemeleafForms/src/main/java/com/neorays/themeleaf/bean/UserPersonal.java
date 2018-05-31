package com.neorays.themeleaf.bean;

import javax.validation.constraints.NotNull;


public class UserPersonal {
	@NotNull
	private String first_name;
	private String last_name;
	private String dob;
	private String gender;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		System.out.println("Personal Setters");
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserPersonal [first_name=" + first_name + ", last_name="
				+ last_name + ", dob=" + dob + ", gender=" + gender + "]";
	}
	public UserPersonal() {
		// TODO Auto-generated constructor stub
		System.out.println("Personal");
	}		
}
