package com.neorays;

import java.io.IOException;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;



public class TestTagHadler implements Tag{
	
	Tag p;
	PageContext pc;
	
	public void setPageContext(PageContext p)
	{
		System.out.println("inside setPageContext");
		pc=p;
	}
	
	public void setParent(Tag t){
		System.out.println("inside setParent()");
		p=t;
	}
	public Tag getParent()
	{
		System.out.println("inside getParent()");
	return p;
	}
	
	public int doStartTag()
	{
		System.out.println("inside dostartTag()");
		
		try {
			pc.getResponse().getWriter().println("hi guys");
			pc.getResponse().getWriter().println("gud eving");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
		
	}
	
	public int doEndTag()
	{
		System.out.println("inside doEndTag()");
		return EVAL_PAGE;
		
	}
	public void release()
	{
		System.out.println("Inside release method");
	}
	

}
