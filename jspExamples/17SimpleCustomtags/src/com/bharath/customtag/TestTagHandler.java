package com.bharath.customtag;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
public class TestTagHandler implements Tag {
 
	Tag p;
	PageContext pc;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPageContext(PageContext arg0) {
		// TODO Auto-generated method stub
		pc=t
	}
	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		
	}
}
