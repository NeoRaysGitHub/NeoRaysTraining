package com.indian.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.indian.model.Customer;

@Component
public class CustomerValidator  implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Customer customer=(Customer)target;
		int age=customer.getAge();
		String password=customer.getPassword();
		String confPassword=customer.getConfPassword();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"age","customer.age.empty" );
	if(!password.equals(confPassword)){
		errors.rejectValue("password","customer.password.missMatch");
	}
	
	if(age<18||age>60){
		errors.rejectValue("age", "customer.age.range.invalid");
	}
	}

}
