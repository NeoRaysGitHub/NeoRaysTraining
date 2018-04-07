<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
	<html:html>
	<body bgcolor="wheat">
	
	<html:form action="/login" onsubmit="return validateLoginForm(this)">
		<html:javascript formName="loginForm"/>
	
		<bean:message key="login.username"/>
		<html:text property="username"/>
		<html:errors property="username"/><br><br>
		
		<bean:message key="login.password"/>
		<html:text property="password"/>
		<html:errors property="password"/><br><br>
		
		<bean:message key="login.type"/>
		<html:text property="type"/>
		<html:errors property="type"/><br><br>
		
	<html:submit value="sign in"/>

</html:form>
</body>
</html:html>