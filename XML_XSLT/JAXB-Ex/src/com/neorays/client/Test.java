package com.neorays.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.neorays.binding.Employee;

public class Test {
	public static void main(String[] args)throws JAXBException {
		//marshling: converting java obj to XML..
		Employee employee=new Employee();
		employee.setEmpno(101);
		employee.setName("Harishankar");
		employee.setSalary(12000);
		//creat JAXBContext Object,to create JAXBContext object we can use newInstance(from) JAXBContext class
		//the newInstance() method is static factory method
		
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		//Create a Marshller Object from JAXBContext
		Marshaller marshaller=context.createMarshaller();
	
		//call marshall() from marshller object
		//marshaller.marshal(employee, System.out);//the generated XML  output is display on console
		File file=new File("emp.xml");
		marshaller.marshal(employee, file);
		System.out.println("Xml Done");
	}
}
