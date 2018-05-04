package com.indian.spring;

public class A {
	private B b;
	public A(){
		System.out.println("inside default constructor of A");
	}
public A(B b){
	System.out.println("inside parameterized constructor of A");
	this.b=b;
}
public B getB(){
	return b;
}
public void setB(B b){
	System.out.println("inside setB() method of A");
	this.b=b;
	
}
}
