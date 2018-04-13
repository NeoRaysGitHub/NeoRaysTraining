package com.neorays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
	
	protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		ModelAndView model=new ModelAndView("hello");
		model.addObject("message", "hellloooo!!!!!");
		return model;
	}

}
