package com.indian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[]){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	A ref=(A)ctx.getBean("a");
	B re=ref.getB();
	re.m1();
	
	}
	

}
