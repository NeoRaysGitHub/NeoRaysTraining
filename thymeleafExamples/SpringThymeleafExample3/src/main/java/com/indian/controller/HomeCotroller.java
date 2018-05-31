package com.indian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCotroller { 
	@RequestMapping(value="/")
	public String home(){
		return "home";
	}
	

}
