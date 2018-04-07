package com.cluster;



public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Inside default constructor");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		System.out.println("Inside setEmpid() method");
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName() method");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Inside setSalary() method");
		this.salary = salary;
	}
}
