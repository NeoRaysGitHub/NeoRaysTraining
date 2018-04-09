package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/pruthvi")
	public String m1(Model mod)
	{
		mod.addAttribute("msg", "Welcome to Spring MVC");
		return "home";
	}

}
