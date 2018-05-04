package com.neorays.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.views.AbstractView;

import sun.util.calendar.BaseCalendar;

public class HomeController extends AbstractController {

	

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("home");
		return new ModelAndView("register");
	}

}
