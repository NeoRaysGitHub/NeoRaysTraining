package com.indian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	   @RequestMapping("home.htm")
	   public String index(Model model) {
	 System.out.println("controller");
	      model.addAttribute("message", "Hello Spring MVC 5! i am bharath ");
	      return "welcome";
	   }

}
