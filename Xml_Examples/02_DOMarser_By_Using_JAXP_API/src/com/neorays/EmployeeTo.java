package com.neorays;

public class EmployeeTo {

	private String empno;
	private String name;
	private String  salary;
	
	public EmployeeTo() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTo [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
