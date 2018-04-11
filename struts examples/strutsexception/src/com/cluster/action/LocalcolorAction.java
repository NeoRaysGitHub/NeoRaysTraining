package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LocalcolorForm;

public class LocalcolorAction  extends Action{
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)throws Exception{
		LocalcolorForm localform = (LocalcolorForm)pForm;
	   String strcolor = localform.getLocalcolor();
	   if(strcolor.equals("orange")){
		   throw new ArithmeticException();
	   }else{
	   return pMapping.findForward("invalid");
	   }
	}
}