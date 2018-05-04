package com.indian;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BeanFactory b=new DefaultListableBeanFactory();
	BeanDefinitionRegistry bdr=(BeanDefinitionRegistry)b;
 XmlBeanDefinitionReader xbr=new XmlBeanDefinitionReader(bdr);
 xbr.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
	Employee e=(Employee) b.getBean("emp");
	System.out.println("employee id is\t"+e.getId());
	System.out.println("employee name is\t"+ e.getName());
	System.out.println("employee salary is\t"+e.getSalary());
	}
}
