package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.neo.exception.UserDefinedException;
import com.neo.form.LocalColorForm;

public class LocalColorAction extends Action
{
	public org.apache.struts.action.ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception 
		{
	LocalColorForm globalForm =(LocalColorForm) form;
	 String strColor =globalForm.getLocalColor();

		if (strColor.equalsIgnoreCase("orange")) {
			throw new ArithmeticException();
		}
	
	return null;
	}
}
