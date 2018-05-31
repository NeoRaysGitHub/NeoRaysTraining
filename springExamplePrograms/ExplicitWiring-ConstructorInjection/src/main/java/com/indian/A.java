package com.indian;

public class A {
	private B b;
	public A(){
		System.out.println("Inside default constructor of A");
	}
	public A(B b){
		System.out.println("Inside parameterized constructor of A");
		this.b=b;
	

}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
}