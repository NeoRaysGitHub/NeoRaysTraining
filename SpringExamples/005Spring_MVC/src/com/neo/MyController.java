package com.neo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping(value="/welcome")
	public String m1(Model mod)
	{
		mod.addAttribute("msg","greeting from neorays");
		return "home";
	}
}
