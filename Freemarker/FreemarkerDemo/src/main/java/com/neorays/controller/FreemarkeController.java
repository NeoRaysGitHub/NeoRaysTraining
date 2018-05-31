package com.neorays.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.bean.Login;
import com.neorays.service.FreemarkerService;

@Controller
public class FreemarkeController {
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
		
	}
	
	@RequestMapping(value="home")
	public String home(){
		return "home";
	}
	@RequestMapping(value="save")
	public ModelAndView save(@ModelAttribute("login") Login login,HttpServletRequest request){
		if(login.getUsername().equalsIgnoreCase("suresh") && login.getPassword().equalsIgnoreCase("reddy")){
			HttpSession session = request.getSession();
			session.setAttribute("username", login.getUsername());
			session.setAttribute("password", login.getPassword());
			String msg = "Suresh";
		return new ModelAndView("save","msg",msg);
		}
		else{
			return new ModelAndView("fail");
		}
	}
	
	@RequestMapping(value="getlist")
	public ModelAndView getList() {
		System.out.println("List Method");
		// get the list from service
		FreemarkerService service = new FreemarkerService();
		List userList = service.getList();
		return new ModelAndView("showlist","userList",userList);
		
	}
	
	@RequestMapping(value="session")
	public ModelAndView getUser(HttpServletRequest request){
		HttpSession session = request.getSession();		
		return new ModelAndView("show");
	}
}
