package com.cluster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleA a= (SimpleA)ac.getBean("simpleb");
		SimpleB b=a.getB();
				b.m1();
	}

}
