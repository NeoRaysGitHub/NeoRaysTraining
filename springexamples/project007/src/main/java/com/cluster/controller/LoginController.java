package com.cluster.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cluster.beans.LoginBeans;
import com.cluster.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login.htm")
	public String home(){
		return "home";
	}
	@RequestMapping(value="/home.htm")
public String display(Map<String,Object> map,@ModelAttribute LoginBeans bean, BindingResult errors) throws Exception{
	  
	if(errors.hasErrors())
		return "home";
	
	//  System.out.println(user+"..........CONTROLLER...........");
	String msg=service.insert(bean);
	map.put("MSG", msg);
	return "hello";
}
	
	@RequestMapping(value="selectAll.htm")
	public String selectAll(Map<String ,Object> map) throws Exception{
		System.out.println("------selectAll------------");
		List list=null;
	    list=service.selectAll();
	   map.put("list", list);
		return "selectAll";
	}
	
	@RequestMapping(value="select.htm")
	public String select(Map<String,Object> map,HttpServletRequest req) throws Exception{
		System.out.println("------select------");
		String strName=req.getParameter("name");
		List list=null;
		list=service.select(strName);
		map.put("list", list);
		System.out.println(list);
		return "select1";
	}
	
}
