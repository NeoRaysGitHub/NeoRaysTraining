package com.neorays;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXml {

	public static void main(String[] args) throws JAXBException {
		 Employee employee=new Employee();
		 employee.setEmpNo(102);
		 employee.setName("sachin");
		 employee.setSalary(15000.0);
		 JAXBContext context=JAXBContext.newInstance(employee.getClass());
		 Marshaller marshaller=context.createMarshaller();
		 
		// marshaller.marshal(employee, System.out); 
		 
		/* File file=new File("emp.xml");
		 marshaller.marshal(employee, file);
		 System.out.println("done!!!");
		 
		 */
		 
		 StringWriter writer=new StringWriter();
		 marshaller.marshal(employee, writer);
		 String xml=writer.toString();
		 System.out.println(xml);
		 
	}

}
