package com.neo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.neo.service.WishService;


public class WishController implements Controller{
	private WishService service;

	public WishService getService() {
		return service;
	}

	public void setService(WishService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String name = null;
		String msg = null;
		String targetView = "/WEB-INF/wish.jsp";
		// get the request param value
		name = req.getParameter("name");
		// call service method.
		msg = service.sayHello(name);		
		return new ModelAndView(targetView, "msg", msg);
	}

	
	
}
