package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action{

	public ActionForward execute(ActionMapping aMap, ActionForm aForm, HttpServletRequest aRequest, HttpServletResponse aResponse)
	{
		DynaActionForm dynaActionForm=(DynaActionForm)aForm;
		
		String strName=(String)dynaActionForm.get("username");
		String strPassword=(String)dynaActionForm.get("password");
	if(strName.equalsIgnoreCase("neorays") || strPassword.equalsIgnoreCase("software"))
	{
		return aMap.findForward("success");
	}
        return aMap.findForward("failure");
	}

}
