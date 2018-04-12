package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neo.form.UserForm;
import com.neo.service.UserService;
import com.neo.service.UserServiceImpl;

public class UserLogin extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {	
		String result = "Failure";
		UserForm userForm = (UserForm) form;
		// call the service object
		UserService service = new UserServiceImpl();
		userForm = service.login(userForm);
		if(userForm!=null){
			request.setAttribute("form", userForm);
			result = "Success";
		}
		return mapping.findForward(result);
	}
}
