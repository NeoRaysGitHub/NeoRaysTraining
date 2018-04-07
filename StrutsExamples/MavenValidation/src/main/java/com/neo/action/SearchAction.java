package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neo.form.SearchForm;

public class SearchAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SearchForm searchform = (SearchForm)form;
		String strSid = (String)searchform.getSid();

		String strName = "deepa";
		String strEmail = "deepashree@gmail.com";
		String strPhone = "9999987643";

		if (strSid.equals("CLS-B15-9632")) {
			request.setAttribute("a", strName);
			request.setAttribute("b", strEmail);
			request.setAttribute("c", strPhone);
			return mapping.findForward("success");
		} 
		else 
		{
			String strMsg = "student not found";
			request.setAttribute("MSG", strMsg);
			return mapping.findForward("failure");
		}
	}
}
