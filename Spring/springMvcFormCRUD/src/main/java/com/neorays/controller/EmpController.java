package com.neorays.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.form.Emp;

@Controller
public class EmpController {
	
	static List<Emp> list = new ArrayList<Emp>();
	
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	@RequestMapping(value="/index")
	public String home1()
	{
		return "index";
	}
	

	@RequestMapping("/empform")
	public ModelAndView showform() 
	{
		// command is a reserved request attribute name, now use <form> tag to
		// show object data
		return new ModelAndView("empform", "command", new Emp());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp) 
	{
		
		list.add(emp);
		// write code to save emp object
		// here, we are displaying emp object to prove emp has data
		System.out.println(emp.getName() + " " + emp.getSalary() + " "
				+ emp.getDesignation());
		
		return new ModelAndView("index","command","data is inserted");//will display
		// object data
		//return new ModelAndView("redirect:/viewemp");// will redirect to viewemp
														// request mapping
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {
		// write the code to get all employees from DAO
		// here, we are writing manual code of list for easy understanding
		/*
			list.add(new Emp(1, "rahul", 35000f, "S.Engineer"));
			list.add(new Emp(2, "aditya", 25000f, "IT Manager"));*/
		return new ModelAndView("viewemp", "list", list);
	}
}
