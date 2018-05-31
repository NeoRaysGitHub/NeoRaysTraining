package com.neorays.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	public Employee() {
		System.out.println("Employeee");
	}
	@NotEmpty
	private int empNo;
	@NotNull
	private String name;
	@NotNull
	private int age;
	@NotNull
	private double salary;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		System.out.println("Setter Methods Executing");
		this.empNo = empNo;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
}
