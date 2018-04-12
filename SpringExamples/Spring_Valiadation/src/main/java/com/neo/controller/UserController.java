package com.neo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.bean.UserBean;

@Controller
public class UserController {
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		return new ModelAndView("/WEB-INF/jsp/register.jsp", "user",
				new UserBean());
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView registerUser(
			@Valid @ModelAttribute("user") UserBean user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("/WEB-INF/jsp/register.jsp");
		}

		return new ModelAndView("/WEB-INF/jsp/success.jsp", "userBean", user);

	}
}
