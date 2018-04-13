package com.neorays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController{
	
	
	protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		ModelAndView model=new ModelAndView("welcome");
		model.addObject("message", "WELLCOMEE!!!!");
		return model;
		
	}

}
