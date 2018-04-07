package com.neorays.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.neorays.service.LoginService;


public class LoginController extends AbstractController {

	private LoginService service;
	
	public void setService(LoginService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
	    String user=req.getParameter("name");
	    String pass=req.getParameter("password");
	    System.out.println(user+"      "+pass);
	    //use service class
	    String result=service.insert(user, pass);
	    
		return new ModelAndView("insert","eeee",result);
	} //method                                      //lvn                  //model data   
	

}
