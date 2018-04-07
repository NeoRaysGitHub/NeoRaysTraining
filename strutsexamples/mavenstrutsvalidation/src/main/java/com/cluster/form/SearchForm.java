package com.cluster.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchForm extends ActionForm 
{
 private String sid;
 

 public SearchForm() {
	 System.out.println("inside constructor");

}

public String getSid() {
	System.out.println("inside getter method");
	return sid;
}

public void setSid(String sid) {
	System.out.println("inside setter method");
	this.sid = sid;
}
public ActionErrors validate(ActionMapping pMap, HttpServletRequest pRequest)
{
	System.out.println("inside validate method");
	ActionErrors errors=new ActionErrors();
	
	if(sid.equals(null)|| sid.length()==0)
	{
		errors.add("sid", new ActionMessage("errors.sid.required"));
	}
	else if((!sid.startsWith("CLS-B5-")))
	{
		errors.add("sid", new ActionMessage("errors.sid.format"));
	}
	return errors;
}

public void reset(ActionMapping pMap, HttpServletRequest req)
{
	System.out.println("inside reset method");
	sid="cluster";
}
 
}
