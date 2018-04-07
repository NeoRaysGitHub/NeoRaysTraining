package com.clust;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/qualifier.xml");
		
		//executing qualifier using spring in com.clust
		Tester test=(Tester) context.getBean("tester");
		Bean bean=test.getBean();
		bean.print();
	}

}
