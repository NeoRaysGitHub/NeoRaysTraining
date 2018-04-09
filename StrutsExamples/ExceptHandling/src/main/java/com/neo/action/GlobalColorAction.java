package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neo.exception.UserDefinedException;
import com.neo.form.GlobalColorForm;

public class GlobalColorAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		GlobalColorForm globalForm = (GlobalColorForm)form;
		 String strColor =globalForm.getGlobalColor();
	
		 
		if (strColor.equalsIgnoreCase("red")) {
			throw new ArithmeticException();
		}

		if (strColor.equalsIgnoreCase("blue")) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (strColor.equalsIgnoreCase("green")) {
			throw new NumberFormatException();
		}
		if (strColor.equalsIgnoreCase("yellow")) {
			throw new UserDefinedException("hi");

		}
		
		return null;
		
	}

}
