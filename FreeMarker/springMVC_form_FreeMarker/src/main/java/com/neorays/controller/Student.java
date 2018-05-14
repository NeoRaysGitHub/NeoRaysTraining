package com.neorays.controller;

import java.util.Map;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Student {
	@RequestMapping(value="/addmissionForm2",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("addmissionForm2");
		return model;
	}
	
	@RequestMapping(value="/AddmissionSuccess",method=RequestMethod.POST)
	public ModelAndView submitAddmissionForm(@RequestParam Map<String, String> map)
	{
		String name=map.get("studentname");
		String course=map.get("studentcourse");
		ModelAndView model=new ModelAndView("addmissionSuccess");
		model.addObject("msg1",name);
		model.addObject("msg2",course);
		return model;
	}
}
