package com.indian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) ac.getBean("emp");
		System.out.println("Employee id is "+emp.getId());
		System.out.println("Employee name is  "+emp.getName());
		System.out.println("Employee salary is  "+emp.getSalary());

	}

}
