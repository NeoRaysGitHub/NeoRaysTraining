package com.neorays.bean;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employee {
	private int empno;
	private String name;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary="
				+ salary + "]";
	}
	

}
