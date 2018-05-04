package com.indian;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(){
		System.out.println("default constructor executed");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside  setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside  setName" );
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("inside setSalary");
		this.salary = salary;
	}
	

}
