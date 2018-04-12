package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neo.service.HelloWorldService;



@Controller
@RequestMapping()
public class HelloworldController {
	
	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	@RequestMapping(value="/welcome" , method=RequestMethod.GET, params="name")
	public ModelAndView welcome(@RequestParam("name") String name){
		return new ModelAndView("welcomePage", "welcomeMessage", helloWorldService.welcomeMessage(name));
	}
}
