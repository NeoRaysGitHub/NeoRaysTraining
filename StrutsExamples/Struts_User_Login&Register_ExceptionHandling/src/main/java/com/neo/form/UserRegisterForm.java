package com.neo.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserRegisterForm extends ActionForm {
	private String username;
	private String password;
	private String conform_password;
	private String email_id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConform_password() {
		return conform_password;
	}
	public void setConform_password(String conform_password) {
		this.conform_password = conform_password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors ae = new ActionErrors();
		if(username.equals("") && username.trim().length()==0)
			ae.add("username", new ActionMessage("msg1"));
		if(password.equals("") && password.trim().length()==0)
			ae.add("password", new ActionMessage("msg2"));
		if(conform_password.equals("") && conform_password.trim().length()==0)
			ae.add("conform_password", new ActionMessage("msg3"));
		if(email_id.equals("") && email_id.trim().length()==0)
			ae.add("email_id",new ActionMessage("msg4"));
		if(!password.equals(conform_password))
			ae.add("conform_password", new ActionMessage("msg3"));
			
		return ae;
	}
}
