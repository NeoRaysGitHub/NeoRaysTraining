package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FirstController {
	@RequestMapping(value={"/welcome","/hi"})
	public ModelAndView first()
	{
		return new ModelAndView("viewname1", "m1","hello"); 
	}
	


	/*@RequestMapping("/first")
	public ModelAndView one()
	{
		String m1="hello welcome to CLusterIndia";
		//String m2="hru";
		return new ModelAndView("viewname1", "m1", m1);
	}
	@RequestMapping("/second")
	public ModelAndView second()
	{
		//String m1="hello welcome to CLusterIndia";
		String m2="hru";
		return new ModelAndView("viewname2", "m2", m2);
	}
	@RequestMapping("/third")
	public ModelAndView third()
	{
		//String m1="hello welcome to CLusterIndia";
		//String m2="hru";
		String m3="how you are doing today";
		return new ModelAndView("viewname3", "m3", m3);
	}
	
*/
}
