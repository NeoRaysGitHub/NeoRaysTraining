package com.neo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Another
{
	@Autowired
	private Binding b;
	
	public Another() {
		System.out.println("default constructor....");
	}
	public Another(Binding b)
	{
		this.b=b;
		
	}

	public Binding getB() {
		return b;
	}	
	
	public void setB(Binding b) {
		this.b = b;
	}
	
	
	

}
