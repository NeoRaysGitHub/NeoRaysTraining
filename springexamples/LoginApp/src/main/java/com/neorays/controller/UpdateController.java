package com.neorays.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.neorays.service.LoginService;


public class UpdateController extends AbstractController {

	private LoginService service;
	
	public void setService(LoginService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		 String oldval=req.getParameter("old");
		    String newval=req.getParameter("new");
		    System.out.println(oldval+"      "+newval);
		    //use service class
		    String result=service.insert(oldval, newval);
		    
			return new ModelAndView("update","upd",result);
	} //method                                      //lvn                  //model data   
	

}
