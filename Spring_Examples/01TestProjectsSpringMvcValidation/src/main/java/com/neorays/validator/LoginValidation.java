package com.neorays.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neorays.model.LoginModel;

public class LoginValidation implements Validator{

	public boolean supports(Class<?> a) {
		// TODO Auto-generated method stub
		return LoginModel.class.equals(a);
	}

	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmpty(errors, "name", "error.nme");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.pwd");
	}

}
