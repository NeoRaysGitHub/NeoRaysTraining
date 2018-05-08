package com.neorays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hi")
public class Test {

	@RequestMapping("/")
	public ModelAndView show()
	{
	ModelAndView model=new ModelAndView("result");
	model.addObject("msg", "may i help u");
	return model;
	
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld()
	{
		ModelAndView model=new ModelAndView("result");
		model.addObject("msg", "hello world");
		return model;
	}
}
