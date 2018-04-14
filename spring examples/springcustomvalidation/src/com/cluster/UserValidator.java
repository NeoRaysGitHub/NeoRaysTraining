package com.cluster;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{
	
	@Override
	public boolean supports(Class clazz){
		
		return User.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target,Errors errors){
		
		System.out.println("0000000000000000000000000000");
		User user =(User)target;
		
		if(user.getFname().isEmpty()){
			System.out.println("11111111111");
			errors.rejectValue("fname","null.user.fname");
			
		}
		
if(user.getLname().isEmpty()){
	System.out.println("2222222222");
			
			errors.rejectValue("lname","null.user.lname");
		}
	}
}