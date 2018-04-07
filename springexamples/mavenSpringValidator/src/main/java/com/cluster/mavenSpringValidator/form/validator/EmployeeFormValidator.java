package com.cluster.mavenSpringValidator.form.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cluster.mavenSpringValidator.form.model.Employee;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class EmployeeFormValidator implements Validator {

	//which objects can be validated by this validator
	
	public boolean supports(Class<?> paramClass) {
		return Employee.class.equals(paramClass);
	}

	
	public void validate(Object obj, Errors errors) 
	{
		

	String matcher="";

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
		
		Employee emp = (Employee) obj;
		if(emp.getId() <=0){
			errors.rejectValue("id", "negativeValue", new Object[]{"'id'"}, "id can't be negative");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
		if(emp.getName().equals("345"))
		{
			errors.rejectValue("name", "digits", new Object[]{"name"}, "name should not include digits"); ;
		}
		
		if (!(emp.getName() != null && emp.getName().isEmpty())) {  
			 
			   if (!matcher.matches(emp.getName())) {  
			    errors.rejectValue("name", "name.containNonChar",  
			      "Enter a valid name");  
			   }  
		//ValidationUtils.rejectIfdigits(errors,"name","name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");
	}
}
}