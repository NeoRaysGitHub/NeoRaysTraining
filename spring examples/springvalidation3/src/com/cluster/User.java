package com.cluster;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class User{
	@NotEmpty
	@Pattern(regexp="[^0-9]+")
	private String fname;
	@NotEmpty
	@Pattern(regexp="[^0-9]+")
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}