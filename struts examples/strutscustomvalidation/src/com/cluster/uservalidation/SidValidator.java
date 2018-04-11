package com.cluster.uservalidation;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class SidValidator implements Serializable{
	
	public static  boolean  validateSid(Object pBean,ValidatorAction pAction,
			Field pField,ActionMessages pMessages,Validator pValidator,HttpServletRequest req){
		String value = req.getParameter("sid");
		System.out.println(value);
		if(value!=null || value.length()!=0){
		try{
			String sub1 = value.substring(0,4);
			System.out.println(sub1);
			String sub2 = value.substring(3);
			System.out.println(sub2);
			int i=Integer.parseInt(sub2);
			System.out.println(i);
			
			if(sub1.equals("CLS-")!=true){
				
				pMessages.add("sid",new ActionMessage("errors.sid"));
				return false;
			}
			
			
		}catch(Exception e){
			pMessages.add("sid",new ActionMessage("errors.sid"));
			return false;
		}
			
		}else{
			pMessages.add("sid", new ActionMessage("errors.sid"));
			return false;
			
		}
		return true;
	}
}