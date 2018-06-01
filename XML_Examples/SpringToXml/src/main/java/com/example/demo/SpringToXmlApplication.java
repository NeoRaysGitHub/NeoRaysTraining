package com.example.demo;
import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.xmlconverter.XmlConverter;

@SpringBootApplication
public class SpringToXmlApplication {
	
	@Resource
	XmlConverter xmlConverter;
	
	public static void main(String... args) {
		SpringApplication.run(SpringToXmlApplication.class,args);
	}
	
	
	public void run(String... args)throws Exception{
		final String xmlFile="customer.xml";
		Customer cust=new Customer(20,"Pruthvi","Shivakumar");
		
		System.out.println("Convert Customer Object to xml");
		xmlConverter.convertFromObjectToXML(cust,xmlFile);
		System.out.println("Done\n");
		
		System.out.println("Convert xml to Customer Object");
		Customer cust2=(Customer)xmlConverter.convertFromXMLToObject(xmlFile);
		System.out.println(cust2.toString());
		System.out.println("Done");
	}
}
