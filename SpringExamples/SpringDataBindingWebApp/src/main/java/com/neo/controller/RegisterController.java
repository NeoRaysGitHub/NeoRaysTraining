package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.bean.Register;

@Controller
public class RegisterController {
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public ModelAndView register(){
		return new ModelAndView("/WEB-INF/jsp/register.jsp", "register", new Register());		
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute Register register){
		return new ModelAndView("/WEB-INF/jsp/to.jsp", "register", register);
		
	}
}
