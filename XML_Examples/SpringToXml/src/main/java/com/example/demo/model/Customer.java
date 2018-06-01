package com.example.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Customer")
public class Customer {
	private int age;
	private String firstname;
	private String lastname;
	
	public Customer(){	
		super();
	}
	
	public Customer(int age, String firstname, String lastname){
		this.age=age;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	@XmlElement
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@XmlElement
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@XmlElement
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		String info= String.format("Customer info:age=%d, firstname=%s,lastname=%s ",age,firstname,lastname);
		return info;
	}
	
	

}
