package com.indian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[]){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person=(Person)ac.getBean("person");
		String[] hb=person.getHobbies();
		
		ArrayList<String>em=person.getEmails();
		HashSet<String>ph=person.getPhones();
		HashMap<String,String>edu=person.getEducation();
		 Properties ptg=person.getPercentage();
		 
		 System.out.println("person's id\t"+person.getPid());
		 System.out.println("Person's name\t"+person.getName());
		 
		 System.out.println("Hobbies are ");
		 for(String s:hb){
			 System.out.println("\t"+s);
		 }
		 System.out.println("emails are");
		 	for(String s:em){
		 		System.out.println("\t"+s);
		 	}
		 	System.out.println("phones are");
		 	for(String s:ph){
		 		System.out.println("\t"+s);
		 	}
		 	System.out.println("Education details are");
		 	
		 	java.util.Iterator<Entry<String, String>> it=edu.entrySet().iterator();
		 	
		 		while(it.hasNext()){
		 			System.out.println("\t"+it.next());
		 		}
		 	}
	}

