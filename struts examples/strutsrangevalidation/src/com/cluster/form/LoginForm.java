package com.cluster.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{
	
	private String  name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}