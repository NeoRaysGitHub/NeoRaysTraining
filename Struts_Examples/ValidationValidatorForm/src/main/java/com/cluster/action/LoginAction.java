package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action {
	
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse)throws Exception{
		
		LoginForm loginForm=(LoginForm)pForm;
		String strName=(String)loginForm.getName();
		String strPassword=(String)loginForm.getPassword();
		
		if(strName.equalsIgnoreCase("pruthvi") && strPassword.equalsIgnoreCase("shivakumar")){
			
			return pMapping.findForward("success");
		}
		return pMapping.findForward("error");
		
	}

}
