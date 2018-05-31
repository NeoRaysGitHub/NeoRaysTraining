package com.neorays.themeleaf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.themeleaf.bean.User;
import com.neorays.themeleaf.bean.UserAddress;
import com.neorays.themeleaf.bean.UserEducation;
import com.neorays.themeleaf.bean.UserPersonal;

@Controller
public class UserController {
	/*
	public HttpSession getSession(HttpServletRequest request){
		HttpSession session = request.getSession();
		return session;		
	}
	
	private HttpServletRequest request;
	private HttpSession session = getSession(request);
	
	
	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		this.session = session;
	}
*/
	@RequestMapping(value="/")
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="userRegisterForm",method=RequestMethod.GET)
	public ModelAndView showUserRegisterFrom(){
		ModelAndView modelAndView = new ModelAndView("userRegForm");
		System.out.println("User Reg Form");	
		modelAndView.addObject("user", new User());
		return modelAndView;
	}
	
	@RequestMapping(value="userPersonalForm",method=RequestMethod.POST) //@ModelAttribute("user") User user
	public ModelAndView showUserPersonalFrom(@ModelAttribute("user") User user,HttpServletRequest request){
		System.out.println("Personal From");
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		ModelAndView modelAndView = new ModelAndView("userPersonalInfo");
		modelAndView.addObject("personal",new UserPersonal());		
		return modelAndView;
	}	
	
	
	@RequestMapping(value="userEduForm",method=RequestMethod.POST) //@ModelAttribute("personal") UserPersonal personal
	public ModelAndView showUserEduFrom( @Valid@ModelAttribute("personal") UserPersonal personal,BindingResult result,HttpServletRequest request){
		System.out.println("Education From");		
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()){
			System.out.println("Find Error in binding result");			
			modelAndView.addObject("personal",new UserPersonal());
			modelAndView.setViewName("userPersonalInfo");
			return modelAndView;
		}
		HttpSession session = request.getSession();
		session.setAttribute("personal", personal);
		modelAndView.addObject("education",new UserEducation());
		modelAndView.setViewName("userEduInfo");
		return modelAndView;
	}
	
	@RequestMapping(value="userAddressForm") //@ModelAttribute("education") UserEducation education
	public String showUserAddressFrom(@ModelAttribute("education") UserEducation education,Model model,HttpServletRequest request) {
		System.out.println("Education Form");
		HttpSession session = request.getSession();
		session.setAttribute("education", education);
		/*System.out.println(education.getClassX()[0]);
		System.out.println(education.getClassX()[1]);
		System.out.println(education.getClassX()[2]);*/
		model.addAttribute("address", new UserAddress());
		return "userAddressInfo";
	}
	@RequestMapping(value="success",method=RequestMethod.POST)
	public String showSuccessFrom(@ModelAttribute("address") UserAddress address,HttpServletRequest request){
		HttpSession session = request.getSession();
		session.setAttribute("address", address);
		System.out.println("Success Form");
		return "success";
	}
}
