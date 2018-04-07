package com.neo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		//using autowiring implicitly using xml with applicationcontext.xml
		
				/*
				 ApplicationContext context=new ClassPathXmlApplicationContext("/spring/applicationcontext.xml");
				 Auto a=(Auto) context.getBean("obja") ;
				Binding b=a.getB();
				System.out.println("value of a "+a);
				System.out.println("value of b "+b);
				b.func();*/
		
		//using autowiring implicitly using annotations with context.xml
		
				/*
				 ApplicationContext context=new ClassPathXmlApplicationContext("/spring/context.xml");
				 Auto a=(Auto) context.getBean("obja") ;
				Binding b=a.getB();
				System.out.println("value of a "+a);
				System.out.println("value of b "+b);
				b.func();*/
				
		//using component scan for creating beans with Componentscan.xml
				
		
				ApplicationContext context=new ClassPathXmlApplicationContext("/spring/ComponentScan.xml");
				Another a1=(Another)context.getBean("another");
				Binding b1=a1.getB();
				System.out.println("value of a "+a1);
				System.out.println("value of b "+b1);
				
	}

}
