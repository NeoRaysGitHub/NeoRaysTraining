package com.indian.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends DispatchAction {
	public ActionForward add(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse) throws Exception{
		
		DynaActionForm dynaActionForm =(DynaActionForm)pForm;
		int intNumber1=Integer.parseInt((String)dynaActionForm.get("number1"));
		int intNumber2=Integer.parseInt((String)dynaActionForm.get("number2"));
		int intAddNo=intNumber1+intNumber2;
		
		pRequest.setAttribute("result", String.valueOf(intAddNo));
		return pMapping.findForward("add");
	
	}

}
