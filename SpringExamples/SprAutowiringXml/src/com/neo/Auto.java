package com.neo;

import org.springframework.beans.factory.annotation.Autowired;

public class Auto {
	@Autowired
	private Binding b;
	
	public Auto() {
		System.out.println("default constructor....");
	}
	
	@Autowired
	public Auto(Binding b)
	{
		this.b = b;
		System.out.println("parameterized constructor...");
	}
	public Binding getB() {
		return b;
	}
	@Autowired
	public void setB(Binding b) {
		this.b = b;
	}
	

}
