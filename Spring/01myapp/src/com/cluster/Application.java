package com.cluster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e = (Employee) ac.getBean("emp");
		System.out.println(e.getFirstname());
		System.out.println(e.getLastname());
	}

}
