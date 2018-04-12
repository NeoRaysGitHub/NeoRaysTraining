package com.neo.login.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.login.model.Login;
import com.neo.login.service.LoginService;
import com.sun.tools.internal.ws.processor.model.Model;
import com.sun.tracing.dtrace.ModuleAttributes;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		return new ModelAndView("login", "login", new Login());
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute("login") Login login,
			BindingResult bindingResult) {
		String view = "login";
		String msg = "Incorrect Username or Password";
		if (bindingResult.hasErrors()) {
			return new ModelAndView("login");
		}
		// call service method
		String result = loginService.login(login);
		if (result.equalsIgnoreCase("success")) {
			view = "success";
			msg = "Login Success.! Welcome";
		}
		return new ModelAndView(view, "msg", msg);

	}
}
