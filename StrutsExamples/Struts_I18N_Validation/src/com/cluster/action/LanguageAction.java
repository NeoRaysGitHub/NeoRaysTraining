package com.cluster.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LanguageAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String language = request.getParameter("language");
		// create locale object
		Locale locale = new Locale(language);
		request.getSession().setAttribute("org.apache.struts.action.LOCALE", locale);
		return mapping.findForward("indexpage");
	}
}
