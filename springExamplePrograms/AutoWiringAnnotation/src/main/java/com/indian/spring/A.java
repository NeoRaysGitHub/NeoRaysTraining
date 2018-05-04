package com.indian.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	//@Autowired
	private B b;
	
public A(){
	System.out.println("inside default constructor of A");
	
}
@Autowired
public A(B b){
	System.out.println("inside parameterized constructor of A");
	this.b=b;
}
public B getB(){
	return b;
}
//@
public void setB(B b){
	System.out.println("inside setB() method of A");
	this.b=b;
	
}

//@Autowired
public void fun(B b){
	System.out.println("inside arbitrary fun() method of A");
	this.b=b;
}


}
