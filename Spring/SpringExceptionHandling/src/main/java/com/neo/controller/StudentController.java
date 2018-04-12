package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.model.Student;

@Controller
public class StudentController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "student", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student) {
		if(student.getName().equals("")){
			throw new RuntimeException();
		}
		if(student.getId()==0){
			throw new ClassCastException();
		}
		return "result";
	}
	@ExceptionHandler(value=RuntimeException.class)
	public String exception(){
		return "exception";
	}
	@ExceptionHandler(value=ClassCastException.class)
	public String classCasteException(){
		return "ccException";
	}
}
