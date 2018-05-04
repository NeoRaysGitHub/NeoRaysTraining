package com.indian;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=(Employee)ac.getBean("emp");
	System.out.println("employee id is\t"+e.getId());
	System.out.println("employee name is\t"+ e.getName());
	System.out.println("employee salary is\t"+e.getSalary());
	
	}
}
