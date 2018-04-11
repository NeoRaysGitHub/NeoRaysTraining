package com.neorays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.service.AddService;

@Controller
public class Hello {
	

	@RequestMapping(value="/add")
	
	public ModelAndView add(@RequestParam("t1")int a, @RequestParam("t2")int b,HttpServletRequest requrest,HttpServletResponse response)
	{
		System.out.println("inside controller");
		
		// int a=Integer.parseInt(requrest.getParameter("t1"));
		// int b=Integer.parseInt(requrest.getParameter("t2"));
		
		AddService service=new AddService();
		int result=service.add(a, b);
		
		ModelAndView  mv=new ModelAndView();
		mv.setViewName("add");
		mv.addObject("result",result);
		
		return mv;
	
		
		
		
	}

}
