package com.neo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Binding {
	
	public Binding() {
		System.out.println("default constructor "+getClass().getSimpleName());

	}

	public void func()
	{
		System.out.println("running func() in "+getClass().getName());
	}
	
}
