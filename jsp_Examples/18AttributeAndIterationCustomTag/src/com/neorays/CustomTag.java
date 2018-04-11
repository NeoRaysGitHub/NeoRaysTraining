package com.neorays;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTag extends TagSupport{
	
	private String var;
	int count;
	int n;
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	public int doStartTag()
	{
		return count;
		
	}
	

}
