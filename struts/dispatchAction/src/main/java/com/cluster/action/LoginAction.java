package com.cluster.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action{
      

	public ActionForward add(ActionMapping mapping, ActionForm form,
			ServletRequest request, ServletResponse response) throws Exception {
		  DynaActionForm dynaActionForm=(DynaActionForm)form;
		 
		   int strNumber1=Integer.parseInt((String)dynaActionForm.get("number1"));
		   int strNumber2=Integer.parseInt((String)dynaActionForm.get("number2")); 
		   int result=strNumber1+strNumber2;
		   request.setAttribute("Add", result);
		   return mapping.findForward("add");
	}
	
	
	public ActionForward sub(ActionMapping mapping, ActionForm form,
			ServletRequest request, ServletResponse response) throws Exception {
		 DynaActionForm dynaActionForm=(DynaActionForm)form;
		int strNumber1=Integer.parseInt((String)dynaActionForm.get("number1"));
		   int strNumber2=Integer.parseInt((String)dynaActionForm.get("number2")); 
		   int result=strNumber1-strNumber2;
		   request.setAttribute("Sub", result);
		   return mapping.findForward("substract");
	}
	

	public ActionForward mul(ActionMapping mapping, ActionForm form,
			ServletRequest request, ServletResponse response) throws Exception {
		 DynaActionForm dynaActionForm=(DynaActionForm)form;
			int strNumber1=Integer.parseInt((String)dynaActionForm.get("number1"));
			   int strNumber2=Integer.parseInt((String)dynaActionForm.get("number2")); 
			   int result=strNumber1*strNumber2;
			   request.setAttribute("Mul", result);
			   return mapping.findForward("multiply");
	}
	                   
}
