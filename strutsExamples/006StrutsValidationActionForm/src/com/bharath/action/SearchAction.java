package com.bharath.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bharath.form.SearchForm;

public class SearchAction extends Action {
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
		System.out.println("SEARCH ACTION");
		SearchForm searchform = (SearchForm) pForm;
		String strSid = searchform.getSid();
System.out.println("BEFORE VA;IE");
		String strName = "BHARATH KUMAR";
		String strEmail = "BHARATH@GMAIL.COM";
		String strPhone = "9502116463";

		if (strSid.equals("JLC-BT-B04-050")) {
			pRequest.setAttribute("a", strName);
			pRequest.setAttribute("b", strEmail);
			pRequest.setAttribute("c", strPhone);

			return pMapping.findForward("success");
		} else {
			String strMsg = "student not found";
			pRequest.setAttribute("MSG", strMsg);

			return pMapping.findForward("failure");

		}
	}

}
