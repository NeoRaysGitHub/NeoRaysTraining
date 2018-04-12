package com.neo.login.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neo.login.dao.LoginDaoImpl;
import com.neo.login.model.Login;

@Controller
public class LoginController {
	@Autowired
	private LoginDaoImpl loginDao;

	@RequestMapping(value="login" , method= RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("login") Login login){
		return "login";
	}
	@RequestMapping(value="login" , method=RequestMethod.POST)
	public String loginPage(@Valid @ModelAttribute("login") Login login,BindingResult result){
		if(result.hasErrors()){
			return "login";		}
		login = loginDao.login(login);		
		return "success";
	}
}
