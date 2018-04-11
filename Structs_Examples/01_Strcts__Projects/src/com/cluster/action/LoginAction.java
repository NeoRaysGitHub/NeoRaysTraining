package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;


public class LoginAction extends org.apache.struts.action.Action {
	
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res){
		
		LoginForm loginform = (LoginForm)pForm;
		
		String strUserName = loginform.getUsername();
		String strPassword  = loginform.getPassword();
		
		
		if(strUserName.equalsIgnoreCase("sachin")&& strPassword.equalsIgnoreCase("neorays")){
			
			return pMapping.findForward("success");
		}
		else{
		
		return pMapping.findForward("failure");
		}
	}
}
