package com.neorays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.bean.Employee;

@Controller
public class EmployeeControloler {
	@RequestMapping(value="/")
	public ModelAndView index(){
		 ModelAndView modelAndView = new ModelAndView("index");
		 modelAndView.addObject("employee", new Employee());
		 return modelAndView;
	}
	@RequestMapping(value="/registerEmployee")
	public ModelAndView registerEmployee(@ModelAttribute("employee") Employee employe){		
		return new ModelAndView("success","employee",employe);		
	}

}
