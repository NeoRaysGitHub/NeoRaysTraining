package com.neorays.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.beans.LoginBeans;
import com.neorays.service.LoginService;

@Controller
public class AnnotationLoginController {
	@Autowired
	LoginService service;

	@RequestMapping(value = "home.htm", method = RequestMethod.GET)
	public String homePage(@ModelAttribute("login") LoginBeans bean) {
		System.out.println("login page");
		return "login";
	}

	@RequestMapping(value = "/login.htm")
	public String insert(Map<String, Object> map,
			@ModelAttribute("login") @Valid LoginBeans beans,
			BindingResult errors) throws ClassNotFoundException {
		/*
		 * String user=req.getParameter("name"); String
		 * pass=req.getParameter("password");
		 * System.out.println(user+"      "+pass);
		 */
		// use service class
		System.out.println("validation..");
		System.out.println(beans);
		if (errors.hasErrors())
			return "login";

		String result = service.insert(beans);
		// set result in map
		map.put("data", result);
		return "insert";
	}// inser method

	@RequestMapping(value = "/select.htm")
	public String select(Map<String, Object> map)
			throws ClassNotFoundException, SQLException {
		// use service class
		List result = service.select();
		map.put("loginList", result);

		return "select";
	}// select method

	@RequestMapping(value = "/delete.htm")
	public String delete(Map<String, Object> map, @ModelAttribute("login") @Validated LoginBeans beans,BindingResult errors)
			throws ClassNotFoundException, SQLException {
		System.out.println("delete controller");
	//	String user = req.getParameter("name");
		// use service class
		if(errors.hasErrors())
			return "login";
		
		String result = service.delete(beans);

		map.put("del", result);

		return "delete";
	}// select method

}
