package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.SearchForm;

public class SearchAction extends Action {

	public ActionForward execute(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res)throws Exception {
		SearchForm searchForm = (SearchForm) af;
		String strSid = searchForm.getSid();

		String strName = "bharat";
		String strMAil = "bharat@bharat.com";
		String phone = "9999999";

		if (strSid.equals("CLR-BR-15")) {
			req.setAttribute("a", strName);
			req.setAttribute("b", strMAil);
			req.setAttribute("c", phone);
		
			return	am.findForward("success");
		} else {
			String ERRORMSG = "TRY TO Access Valid DATA";
			req.setAttribute("MSG", ERRORMSG);
			
		return	am.findForward("failure");
		}
		

	}
}
