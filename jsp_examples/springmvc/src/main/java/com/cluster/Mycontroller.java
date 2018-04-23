package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
	@RequestMapping(value="/login") 
	public ModelAndView display(){
		
		
		UserDTO userDTO = new UserDTO();
		return new ModelAndView("enter","dto",userDTO);
			
	}
	@RequestMapping(value="/check")
	public String checkuser(UserDTO user)
	{
		if (user.getName().equals("manju") && user.getPassword().equals("manju")) 
		{
			return "success";
		}
		
		else
		{
			return "failure";
		}
	}
	

}
