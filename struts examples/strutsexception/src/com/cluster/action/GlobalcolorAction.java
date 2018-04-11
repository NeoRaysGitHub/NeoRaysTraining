package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.excpetion.UserdefinedException;
import com.cluster.form.GlobalcolorForm;

public class GlobalcolorAction extends Action {

	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {

		GlobalcolorForm globalform = (GlobalcolorForm) pForm;
		String strcolor = globalform.getGlobalcolor();

		if (strcolor.equals("red")) {
			System.out.println("inside red");
			throw new ArithmeticException();

		}
		if (strcolor.equals("blue")) {
			System.out.println("inside blue");

			throw new ArrayIndexOutOfBoundsException();
		}

		if (strcolor.equals("green")) {
			System.out.println("inside green");

			throw new NumberFormatException();
		}
		if (strcolor.equals("yellow")) {
			System.out.println("inside yellow");

			throw new UserdefinedException("hi");

		}else{
			
		return pMapping.findForward("invalid");
		}
		}

}
