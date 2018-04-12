package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neo.service.LoginService;

@Controller
public class LinksController {
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login(){
		return "/WEB-INF/jsp/login.jsp";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password){
		String targetView = "/WEB-INF/jsp/loginSuccess.jsp";
		String msg = service.login(username, password);
		return new ModelAndView(targetView, "msg", msg);		
	}
}
