package com.indian;

public class Employee {
private int id;
private String name;
private  double salary;

public Employee(){
	System.out.println("default constructor executed");
}

public Employee(int id, String name, double salary) {
	super();
	System.out.println("employee 3 arg cosntructor");
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public int getId() {
	System.out.println("GETiD() ");
	return id;
}

public void setId(int id) {

	System.out.println("SETID() ");
	this.id = id;
}

public String getName() {

	System.out.println("GETiD() ");
	return name;
}

public void setName(String name) {

	System.out.println("SETnAMAE()");
	this.name = name;
}

public double getSalary() {


	System.out.println("GETSALRY() ");
	return salary;
}

public void setSalary(double salary) {

	System.out.println("SETSALARY() ");
	this.salary = salary;
}



}
