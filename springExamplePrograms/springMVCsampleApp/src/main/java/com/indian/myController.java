package com.indian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping(value="/welcome")
	public String first(Model model)
	{
		model.addAttribute("ms","HELLO BHARATH KUMR CHENNURU");
		return "home";
	}
}
