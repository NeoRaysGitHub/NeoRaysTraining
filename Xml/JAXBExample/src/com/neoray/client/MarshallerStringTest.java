package com.neoray.client;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.neoray.bean.Employee;

public class MarshallerStringTest {
	public static void main(String[] args) throws JAXBException {
		// Create the employee object
		Employee employee = new Employee();
		// set the data into the employee object
		employee.setEmpNo(100);
		employee.setName("Suresh");
		employee.setSalary(20000);
		// convert the java object into StringWriter object by following steps
		// Step1: Create the JAXBContext object, by calling static factory method
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		// Step2: Create the marshaller object using the conect object
		Marshaller marshaller =  context.createMarshaller();
		// Step3: Call the marshaller method on the marshaller object
		// Create StringWriter Object 
		StringWriter writer = new StringWriter();
		marshaller.marshal(employee, writer); // Generate the output in the StringWriter object
		String Xml = writer.toString();
		System.out.println(Xml);
		
		
	}

}
