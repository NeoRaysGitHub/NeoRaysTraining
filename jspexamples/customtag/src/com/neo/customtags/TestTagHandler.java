package com.neo.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class TestTagHandler implements Tag {
	String x;
	String y;
	PageContext pc;

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(x);
		int c = a + b;

		System.out.println("value of a= " + a);

		return c;
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

	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub

	}

}
