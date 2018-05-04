package com.neorays.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neorays.command.StudentCommand;

@Controller
public class StudentController {

	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String home(@ModelAttribute("StudentCmd") StudentCommand  cmd){
		System.out.println("home method");
		
		return "register";
	}//homePage method
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String processPage(Map<String,Object> map,@Valid @ModelAttribute("StudentCmd") StudentCommand  cmd, BindingResult errors){
		System.out.println("process page method");
		/*String ss=req.getParameter("id");
		String ss1=req.getParameter("name");
		String ss2=req.getParameter("add");*/
		if(errors.hasErrors()){
			System.out.println("valid method");
			return "register";
		}
			
		System.out.println(cmd);
		return "home";
	}//homePage method

	
}//class
