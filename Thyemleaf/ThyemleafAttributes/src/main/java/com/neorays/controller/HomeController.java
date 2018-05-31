package com.neorays.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public ModelAndView indexPage(){
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("allUsers", getUserNames());
		return modelAndView;
	}
	public List<String> getUserNames(){
		List<String> list = new ArrayList<String>();
		list.add("Suresh");
		list.add("Hari");
		list.add("Mittu");
		list.add("Barath");
		list.add("Sachin");
		list.add("Manju");
		return list;
	}
}
