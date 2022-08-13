package com.neorays.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.beans.LoginBeans;
import com.neorays.service.LoginService;

@Controller
public class AnnotationLoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login.htm")
	public String insert(Map<String,Object> map,HttpServletRequest req) throws ClassNotFoundException
	{
		  String user=req.getParameter("name");
		    String pass=req.getParameter("password");
		    System.out.println(user+"      "+pass);
		    //use service class
		    String result=service.insert(user, pass);
		   //set result in map
		    map.put("data", result);
		return  "insert";
	}//inser method
	
	
	

	@RequestMapping(value="/select.htm")
	public String select(Map<String,Object> map) throws ClassNotFoundException, SQLException 
	{
		 //use service class
	    List result=service.select();
		map.put("loginList", result);
		
		
		return  "select";
	}//select method
	@RequestMapping(value="/selectone.htm")
	public String selectOne(Map<String,Object> map) 
	{
		 //use service class
	    List result=service.selectOneData();
		map.put("loginList", result);
		
		
		return  "selectone";
	}//select method
	
}