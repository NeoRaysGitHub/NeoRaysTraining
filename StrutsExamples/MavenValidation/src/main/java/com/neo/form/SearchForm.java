package com.neo.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchForm extends ActionForm
{
	private String sid;
	
	public SearchForm() {
		System.out.println("running inside constructor....");
	}
	public String getSid() {
		System.out.println("running inside getSid()....");
		return sid;
	}
	public void setSid(String sid) {
		System.out.println("running inside setsid....");
		this.sid = sid;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

	System.out.println("running validate method()...");
	ActionErrors errors=new ActionErrors();
	 if(sid==null||sid.length()==0)
	 {
			errors.add("sid",new ActionMessage("errors.sid.required"));
		}
		else if((!sid.startsWith("CLS-B15-")))
		{
			errors.add("sid",new ActionMessage("errors.sid.format"));
		}
		return errors;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("inside reset method");
		sid="cluster";
	}
}
