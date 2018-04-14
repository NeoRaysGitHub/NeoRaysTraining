package com.cluster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController{
	
	@RequestMapping("/")
	public ModelAndView index(){
		
		User user = new User();
		return new ModelAndView("index","user",user);
	}
	
	@RequestMapping(value="/display")
	public String  display(Model model,@ModelAttribute("user")User user,BindingResult result){
		
		System.out.println("intocontroller");
		
		
		UserValidator userValidator = new UserValidator() ;
		
		userValidator.validate(user, result);
		
		if(result.hasErrors()){
			System.out.println("into error loop");
			return "index";
		}
		return "redirect:/check";
	}
	
	@RequestMapping(value="/check")
	public ModelAndView check(){
		
		return new ModelAndView("success");
		
	}
}