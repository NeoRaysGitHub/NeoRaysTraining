package com.neorays.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.neorays.service.LoginService;


public class DeleteController extends AbstractController {

	private LoginService service;
	
	public void setService(LoginService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		System.out.println("delete controller");
	    String user=req.getParameter("name");
	    //use service class
	    String result=service.delete(user);
	    
		return new ModelAndView("delete","del",result);
	} //method                                      //lvn                  //model data   
	

}
