package com.indian.spring;

public class B {
private A a;
public B(){
	System.out.println("inside default constructor of B");
	
}
public B(A a)

{
	
System.out.println("inside parameterized constructor of B");
this.a=a;
}

public A getA(){
	return a;
	
}
public void setA(A a){
	System.out.println("inside setA() method of B");
	this.a=a;
}
}
