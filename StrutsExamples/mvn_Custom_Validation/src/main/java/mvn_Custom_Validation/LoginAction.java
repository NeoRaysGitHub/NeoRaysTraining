package mvn_Custom_Validation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import mvn_Custom_Validation.LoginForm;

public class LoginAction extends Action {
    public ActionForward execute(ActionMapping am, ActionForm af,
	    HttpServletRequest req, HttpServletResponse res) throws Exception {
	LoginForm loginForm = (LoginForm) af;
	String strSid = loginForm.getSid();

	if (strSid.equals("CLS-111")) {
	    return am.findForward("success");
	} else {
	    return am.findForward("error");
	}
    }
}
