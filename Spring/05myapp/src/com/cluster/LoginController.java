package com.cluster;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController
{ 
	@RequestMapping("/hello")
	
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response)
	{
		String name=request.getParameter("name");
		String password=request.getParameter("password");
if(password.equals("vikas"))
{
	 String message= "hello" + name ;
     return new ModelAndView("hello", "message", message);  
}
else{  
    return new ModelAndView("error", "message","Sorry, username or password error"); 
		
	}
	
}
}