package com.cluster.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction {

	public ActionForward add(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		DynaActionForm dynaActionForm = (DynaActionForm) actionForm;
		int int1 = Integer.parseInt((String) dynaActionForm.get("number1"));
		int int2 = Integer.parseInt((String) dynaActionForm.get("number2"));
		int intadd = int1 + int2;
		request.setAttribute("result", String.valueOf(intadd));
		return actionMapping.findForward("add");

	}

	public ActionForward sub(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		DynaActionForm dynaActionForm = (DynaActionForm) actionForm;
		int int1 = Integer.parseInt((String) dynaActionForm.get("number1"));
		int int2 = Integer.parseInt((String) dynaActionForm.get("number2"));
		int intsub = int1 - int2;
		request.setAttribute("result", String.valueOf(intsub));
		return actionMapping.findForward("sub");
		
		
		
		

	}


	public ActionForward multiply(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{

		DynaActionForm dynaActionForm = (DynaActionForm) actionForm;
		int int1 = Integer.parseInt((String) dynaActionForm.get("number1"));
		int int2 = Integer.parseInt((String) dynaActionForm.get("number2"));
		int intsub = int1 * int2;
		request.setAttribute("result", String.valueOf(intsub));
		return actionMapping.findForward("multiply");
}
}



