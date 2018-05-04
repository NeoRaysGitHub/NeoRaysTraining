package com.indian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[]){
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println("After \t applicationContext & before A aref ");
	A aref=(A) ac.getBean("objA");
	System.out.println("After getBean()");
	B bref=aref.getB();
	bref.display();
	System.out.println("after end of main()");
}
}