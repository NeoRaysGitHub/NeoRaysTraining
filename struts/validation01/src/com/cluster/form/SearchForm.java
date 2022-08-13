package com.cluster.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchForm extends ActionForm{
               
	   private String sid;
	   
	 public SearchForm(){
		 System.out.println("Inside Constructor");
	 }
          
	public String getSid() {
		System.out.println("Inside Getter ()");
		return sid;
	}

	public void setSid(String sid) {
		System.out.println("Inside the setter()");
		this.sid = sid;
	}       
	
	public ActionErrors validate(ActionMapping am,HttpServletRequest req){
		System.out.println("Inside the validate Method()");
		ActionErrors errors=new ActionErrors();
		if(sid==null || sid.length()==0){
			errors.add("sid",new ActionMessage("error.sid.required"));
		}
		else if((!sid.startsWith("CLR-BR-15"))){
			errors.add("sid",new ActionMessage("errors.sid.format"));
		}
		return errors;
	}
	
	public void reset(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("Inside the Reset");
		sid="cluster";
	}
}
