package com.neo.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserForm extends ActionForm {
	private String username;
	private String email_id;
	private String password;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors ae = new ActionErrors();
		if(email_id.equals("") && email_id.trim().length()==0)
			ae.add("email_id", new ActionMessage("msg5"));
		if(password.equals("") && password.trim().length()== 0)
			ae.add("password", new ActionMessage("msg6"));
		return ae;
	}
	
	
}
