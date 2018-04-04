package com.neo.customvalidation;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class SidValidator implements Serializable{

	public static boolean validateSid(Object obj,ValidatorAction action,Field field, ActionMessages messages, Validator validator, HttpServletRequest request)
	{
		String sid=request.getParameter("sid");
		System.out.println(sid);
		if(sid!=null || sid.length()!=0)
		{
		    try {
		    	
			String sub1 = sid.substring(0, 4);
			System.out.println(sub1);
			String sub2 = sid.substring(4);
			System.out.println(sub2);
			int i = Integer.parseInt(sub2);
			System.out.println(i);

			if (sub1.equals("DEE-") != true) {
			    // errors.add(field.getKey(),Resources.getActionError(request, action, field));
			    messages.add("sid", new ActionMessage("errors.sid"));
			    return false;
			}
		    } catch (Exception e) {
			 // errors.add(field.getKey(),Resources.getActionError(request, action, field));
			messages.add("sid", new ActionMessage("errors.sid"));
			return false;
		    }

		} else {
		    // errors.add(field.getKey(),Resources.getActionError(request, action, field));
		    messages.add("sid", new ActionMessage("errors.sid"));
		    return false;
		}
		return true;
	    }

}
