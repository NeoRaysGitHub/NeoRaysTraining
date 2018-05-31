package com.neoray.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.neoray.bean.Employee;

public class UnMarshallerTest {
	public static void main(String[] args) throws JAXBException {
		// UnMarshalling means : Converting XML into Java object
		// Step1: Create JAXBContext object
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		// Step2: Create UnMarshaller object using JAXBContext object
		Unmarshaller unmarshaller = context.createUnmarshaller();
		// Step3: Call the unMarshalle method 
		Employee employee = (Employee) unmarshaller.unmarshal(new File("employee.xml"));
		System.out.println(employee.toString());
	}

}
