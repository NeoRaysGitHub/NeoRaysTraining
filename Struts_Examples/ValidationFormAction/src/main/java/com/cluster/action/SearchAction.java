package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.SearchForm;

public class SearchAction extends Action {
	
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse)throws Exception{
		SearchForm searchForm=(SearchForm)pForm;
		String strsid=searchForm.getsid();
		String strName="pruthvi";
		String strEmail="pruthvits1994@gmail.com";
		String strPhone="99999999999";
		
		if(strsid.equals("PMT_TS_1234")){
			pRequest.setAttribute("a",strName);
			pRequest.setAttribute("b", strEmail);
			pRequest.setAttribute("c", strPhone);
			return pMapping.findForward("success");
		}else{
			String strMsg="Student NOT Found";
			pRequest.setAttribute("MSG", strMsg);
			return pMapping.findForward("failure");
		}
	}

}
