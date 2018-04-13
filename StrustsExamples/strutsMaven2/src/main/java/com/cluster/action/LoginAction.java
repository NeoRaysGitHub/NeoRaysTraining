package com.cluster.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			ServletRequest req, ServletResponse res) throws Exception {
		
		DynaActionForm df=(DynaActionForm)form;
		
		String strUserName=(String)df.get("username");
		String strPassword=(String)df.get("password");
		
		if (strUserName.equalsIgnoreCase("Hari") && strPassword.equalsIgnoreCase("shankar"))
		{
			
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}
}

