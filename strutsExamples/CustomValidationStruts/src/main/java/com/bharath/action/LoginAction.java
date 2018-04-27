package com.bharath.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bharath.form.LoginForm;

public class LoginAction  extends Action{
	public ActionForward execute(ActionMapping am,ActionForm af, HttpServletRequest req, HttpServletResponse  res)throws  Exception{
		
		LoginForm loginform=(LoginForm)af;
		String strSid=loginform.getSid();
	if(strSid.equals("CLS-111")){
		return am.findForward("success");
		
	}
	else {
		return am.findForward("error");
	}
		
	
		}

}
