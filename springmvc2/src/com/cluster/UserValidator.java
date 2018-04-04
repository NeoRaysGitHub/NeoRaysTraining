package com.cluster;

import org.apache.catalina.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;




public class UserValidator implements Validator{
	
 public boolean supports(Class clazz){
	 
	 return User.class.equals(clazz);
 }
 
 public void validate(Object target,Errors errors){
	 
	 User user = (User)target;
 
 
 }
	
}