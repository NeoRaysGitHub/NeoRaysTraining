package com.neorays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	@RequestMapping(value="/addStudent", method=RequestMethod.GET)
	public ModelAndView student()
	{
		return new ModelAndView("addStudent","student",new Student());
	}
	
	/*@ModelAttribute("student")
	public Student createStudentModel()
	{
		return new Student();
	}*/
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public ModelAndView addStudent(  @ModelAttribute("student")  @Validated Student student,  BindingResult bindingresult,Model model)
	{
		if(bindingresult.hasErrors())
		{
			return new ModelAndView("addStudent");
		}
		
		/*model.addAttribute("age", student.getAge());
		model.addAttribute("name", student.getName());
		model.addAttribute("id", student.getId());*/
		
		return new ModelAndView("result","student",student);
	}
}
