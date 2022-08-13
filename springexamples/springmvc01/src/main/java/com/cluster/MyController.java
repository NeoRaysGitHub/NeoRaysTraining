package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

@RequestMapping(value="/welcome")
public String m1(Model mod){
	
	mod.addAttribute("msg", "Greeting for the first spring app");
	return "home";
}

}
