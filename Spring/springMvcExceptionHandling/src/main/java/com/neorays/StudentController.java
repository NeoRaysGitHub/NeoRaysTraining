package com.neorays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student")
	public ModelAndView student()
	{
		System.out.println("get....");
		return new ModelAndView("student","command",new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("command") Student student,ModelMap model)
	{
		if (student.getAge() < 10) {
			throw new SpringException("Age is too short");
		}else
		{
			model.addAttribute("age", student.getAge());
		}
		if(student.getName().length() < 5)
		{
			throw new SpringException("Name is too short");
		}else
		{
			model.addAttribute("name", student.getName());
		}
		model.addAttribute("id", student.getId());
		return "result";
		
	}
}
