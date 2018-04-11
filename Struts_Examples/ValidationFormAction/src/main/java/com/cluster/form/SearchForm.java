package com.cluster.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	private String sid;
	public SearchForm(){
		System.out.println("inside constructor");
	}
	public String getsid() {
		System.out.println("inside getSid method");
		return sid;
	}
	public void setsid(String sid) {
		System.out.println("inside setsid method");
		this.sid = sid;
	}
	public ActionErrors validate(ActionMapping am,HttpServletRequest req){
		System.out.println("inside validate method");
		ActionErrors errors=new ActionErrors();
		if(sid==null || sid.length()==0){
			errors.add("sid", new ActionMessage("errors.sid.required"));
		}
		else if((!sid.startsWith("PMT_TS_"))){
			errors.add("sid", new ActionMessage("errors.sid.format"));
		}
		return errors;
	}
	public void reset(ActionMapping am,HttpServletRequest req){
		System.out.println("inside reset method");
		sid="pretty";
	}

}
