package com.neoray.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.neoray.bean.Employee;

public class MarshallerTest {
	public static void main(String[] args) throws JAXBException {
		Employee employee = new Employee();
		employee.setEmpNo(101);
		employee.setName("Reddy");
		employee.setSalary(10000);
		
		// convert the employee object into xml
		// Step1: Create JAXBContext object 
		// Using static factory method of JAXBContext Class
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		// Step2: Create the marshaller object using JAXBContext object
		Marshaller marshaller = context.createMarshaller();
		// Step3: Call the marshall method on the Marshaller object to generate Xml formate
		marshaller.marshal(employee, new File("employee.xml"));
		System.out.println("Done");
	}

}
