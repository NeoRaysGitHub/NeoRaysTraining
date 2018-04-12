package com.neo.login.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.login.model.User;
import com.neo.login.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userSerive;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		return new ModelAndView("register", "user", new User());
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error method");
			return "register";
		}
		// service method
		String status = userSerive.registerUser(user);
		return status;

	}
}
