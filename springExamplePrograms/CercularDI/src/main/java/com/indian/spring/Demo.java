package com.indian.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[]){
		System.out.println("begin main()");
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=(A)ctx.getBean("obja");
		System.out.println("Successfully Doone!");
	}

}
