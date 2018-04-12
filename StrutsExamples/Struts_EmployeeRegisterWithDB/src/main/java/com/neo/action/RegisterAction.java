package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neo.form.RegisterForm;
import com.neo.service.EmployeeService;
import com.neo.service.EmployeeServiceImpl;

public class RegisterAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {	
		// convert the form date into regsterform
		RegisterForm rform = (RegisterForm) form;
		EmployeeService service = new EmployeeServiceImpl();
		// call service method
		String result = service.saveEmployee(rform);
		return mapping.findForward(result);
	}
}
