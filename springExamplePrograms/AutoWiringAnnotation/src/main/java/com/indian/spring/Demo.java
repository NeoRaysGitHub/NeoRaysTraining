package com.indian.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
A a=(A)ctx.getBean("obja");
B b=a.getB();
b.m1();
	}

}
