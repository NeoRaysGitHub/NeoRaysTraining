package com.neorays.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.neorays.service.LoginService;


public class SelectController extends AbstractController {

	private LoginService service;
	
	public void setService(LoginService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
	    //use service class
	    List result=service.select();
		return new ModelAndView("select","loginList",result);
	} //method                                      //lvn                  //model data   
}//class
