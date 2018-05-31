package com.neorays.themeleaf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.themeleaf.bean.User;
import com.neorays.themeleaf.bean.UserEducation;
import com.neorays.themeleaf.bean.UserPersonal;

@Controller
public class UserController {
	@RequestMapping(value="/")
	public String home(){
		System.out.println("Home Page");
		return "index";
	}
	/*@RequestMapping(value="language")
	@ResponseBody
	public String ajaxHome(){
		return "index";
	}*/
	
	@RequestMapping(value="userRegisterForm",method=RequestMethod.GET)
	public ModelAndView showUserRegisterFrom(){
		System.out.println("User Reg Form");		
		return new ModelAndView("userRegForm","user",new User());
	}
	@RequestMapping(value="success",method=RequestMethod.POST)
	public String regSuccess(@Valid @ModelAttribute("user") User user,BindingResult result){
		if(result.hasErrors()){
			System.out.println("Has Errors");
			return "userRegForm";
		}
		else {
			System.out.println(result.hasErrors());
			System.out.println("No Errors");
			return "success";			
		}
		

		
	}
	
	@RequestMapping(value="userPersonalForm",method=RequestMethod.POST)
	public ModelAndView showUserPersonalFrom(@Valid @ModelAttribute("user") User user, BindingResult result){
		System.out.println("Personal From");
		if(result.hasErrors()){
			System.out.println("Errors Found");
			return  new ModelAndView("userPersonalForm","user",user);
		}
		return  new ModelAndView("userPersonalInfo","personal",new UserPersonal());
		
		
		
	}	
	/*
	
	@RequestMapping(value="userEduForm",method=RequestMethod.POST)
	public ModelAndView showUserEduFrom( @Valid @ModelAttribute("personal") UserPersonal personal,BindingResult result){
		System.out.println("Education From");		
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()){
			System.out.println("Find Error in binding result");
			modelAndView.addObject("personal",new UserPersonal());
			modelAndView.setViewName("userPersonalInfo");
			return modelAndView;
		}
		modelAndView.addObject("education",new UserEducation());
		modelAndView.setViewName("userEduInfo");
		return modelAndView;
	}
	
	@RequestMapping(value="userAddressForm")
	public String showUserAddressFrom(@ModelAttribute("education") UserEducation education) {
		System.out.println(education.getClassX()[0]);
		System.out.println(education.getClassX()[1]);
		System.out.println(education.getClassX()[2]);
		return "userAddressInfo";
	}*/
}
