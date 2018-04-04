package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;



public class Demo {

	public static void main(String[] args) {
		
		BeanFactory b = new DefaultListableBeanFactory();
		BeanDefinitionRegistry bdr = (BeanDefinitionRegistry) b;
		XmlBeanDefinitionReader xbr = new XmlBeanDefinitionReader(bdr);
		xbr.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		
		Employee e = (Employee) b.getBean("empl");
		
		System.out.println("Employee id is " + e.getEmpid());
		System.out.println("Employee name is " + e.getName());
		System.out.println("Employee salary is " + e.getSalary());
	}
}
