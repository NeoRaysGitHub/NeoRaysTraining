package com.neorays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping(value="/home")
	public String homePage(){
		return "/WEB-INF/ftl/index.ftl";
	}
	
}
