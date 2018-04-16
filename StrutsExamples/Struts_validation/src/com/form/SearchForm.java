package com.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchForm extends ActionForm
{
	private String sid;
	public SearchForm()
	{
		System.out.println("inside constructor");
	}

	public String getsid()
	{
		System.out.println("inside getsid constructor");
		return sid;
	}
	public void setsid(String sid)
	{
		System.out.println("inside setsid()");
		this.sid=sid;
	}
	public ActionErrors validate(ActionMapping am, HttpServletRequest req)
	{
		System.out.println("inside validate method");
		ActionErrors errors=new ActionErrors();
		if(sid==null||sid.length()==0)
		{
			errors.add("sid", new ActionMessage("errors.sid.required"));
		}
		else if((!sid.startsWith("CLS-B15-")))
		{
			errors.add("sid", new ActionMessage("errors.sid.format"));
		}
		return errors;
	}
	public void reset(ActionMapping am, HttpServletRequest req)
	{
		System.out.println("inside reset method");
		sid="cluster";
	}
}
