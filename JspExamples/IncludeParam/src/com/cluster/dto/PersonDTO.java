package com.cluster.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable
{
	private int id;
	private String fname;
	private String lname;
	private double salary;
	
	
	public PersonDTO() {
		System.out.println(" running PersonDTO constructor");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}