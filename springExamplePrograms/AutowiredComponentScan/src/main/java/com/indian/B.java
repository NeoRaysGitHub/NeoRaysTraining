package com.indian;

import org.springframework.stereotype.Component;

@Component
public class B {
	public B() {
		System.out.println("Inside default constructor of B");
	}

	public void m1() {
		System.out.println("Inside m1() method of B");
	}

}
