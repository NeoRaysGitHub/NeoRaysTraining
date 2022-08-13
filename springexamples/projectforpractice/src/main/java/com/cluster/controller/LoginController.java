package com.cluster.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cluster.service.LoginService;


@Controller
public class LoginController {
       @Autowired      
	LoginService service;
	            @RequestMapping(value="/login.htm")
	            public String insert(Map<String,Object>map,HttpServletRequest req){
	            	String user=req.getParameter("name");
	            	String pass=req.getParameter("password");
	            	String mail=req.getParameter("email");
	            	 String result=service.insert(user,pass,mail);
	            	 System.out.println("Result...."+result);
	            	 map.put("data", result);
	            	return "login";
	            }
	            
	           /* @RequestMapping(value="/select")
	            public String select(HttpServletRequest req,Map<String ,Object> map){
	            	return null;
	            }
	
	            @RequestMapping(value="/selectAll")
	            public String selectAll(){
	            	return null;
	            }
	            
	            @RequestMapping(value="/delete")
	            public String delete(HttpServletRequest req,Map<String,Object>map){
	            	return null;
	            }
	            
	            @RequestMapping(value="/deleteAll")
	            public String deleteAll(){
	            	return null;
	            }
	            
	            @RequestMapping(value="/upadte")
	            public String update(){
	            	return null;
	            }*/
}
