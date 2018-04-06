package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction{
	
public ActionForward add(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res){
	
	DynaActionForm dyna = (DynaActionForm)pForm;
	
	int intNumber1 = Integer.parseInt((String)dyna.get("number1"));
	int intNumber2 = Integer.parseInt((String)dyna.get("number2"));
	int intAddNo = intNumber1+intNumber2;
	
	req.setAttribute("result",String.valueOf(intAddNo));
	return pMapping.findForward("add");
}

public ActionForward subtract(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res){
	DynaActionForm dyna = (DynaActionForm)pForm;
    int intnumber1 = Integer.parseInt((String)dyna.get("number1"));
    int intnumber2 = Integer.parseInt((String)dyna.get("number2"));
    int intsubtractNo=intnumber1-intnumber2;
    
    req.setAttribute("result",String.valueOf(intsubtractNo));
    return pMapping.findForward("subtract");
    
}
public ActionForward multiply(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res){
	
	DynaActionForm dyna = (DynaActionForm)pForm;
	int intNumber1 = Integer.parseInt((String)dyna.get("number1"));
	int intNumber2 = Integer.parseInt((String)dyna.get("number2"));
	int intmultiplyNo = intNumber1 * intNumber2;
	
	req.setAttribute("result",String.valueOf(intmultiplyNo));
	return pMapping.findForward("multiply");
}
}