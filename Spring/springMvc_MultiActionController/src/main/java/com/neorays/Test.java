package com.neorays;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

	@RequestMapping("/welcome/{country}/{username}")
	public ModelAndView show(@PathVariable Map<String, String> pathvar)
	{
		String name=pathvar.get("username");
		String cout=pathvar.get("country");
	ModelAndView model=new ModelAndView("result");
	model.addObject("msg", "may i help u"+name+"country is"+cout);
	return model;
	
	}
}
