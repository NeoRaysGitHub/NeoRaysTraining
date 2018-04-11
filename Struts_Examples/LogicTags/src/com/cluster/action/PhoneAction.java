package com.cluster.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.exception.UserNotFoundException;
import com.cluster.form.PhoneForm;
import com.cluster.to.UserTo;

public class PhoneAction extends Action
{
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
		
		PhoneForm phoneform=(PhoneForm)pForm;
		String ph=phoneform.getPhone();
		
		if(ph.equals("9999999999")||ph.equals("8888888888"))
		{
			ArrayList arrayList=new ArrayList();
			
			UserTo userTo1=new UserTo();
			userTo1.setUsername("pruthvi");
			userTo1.setUserid("101");
			userTo1.setEmail("pruthvi@cluster.com");
			userTo1.setPhone("9999999999");
			arrayList.add(userTo1);
			
			UserTo userTo2=new UserTo();
			userTo2.setUsername("naveen");
			userTo2.setUserid("102");
			userTo2.setEmail("naveen@cluster.com");
			userTo2.setPhone("8888888888");
			arrayList.add(userTo2);
			
			UserTo userTo3=new UserTo();
			userTo3.setUsername("swathi");
			userTo3.setUserid("103");
			userTo3.setEmail("swathi@cluster.com");
			userTo3.setPhone("9999999999");
			arrayList.add(userTo3);
			
			UserTo userTo4=new UserTo();
			userTo4.setUsername("chandan");
			userTo4.setUserid("104");
			userTo4.setEmail("chandan@cluster.com");
			userTo4.setPhone("8888888888");
			arrayList.add(userTo4);
			
			pRequest.setAttribute("USERS",arrayList);
		}
		else
		{
			throw new UserNotFoundException();
		}
		
		
		return pMapping.findForward("byphone");
	}

}
