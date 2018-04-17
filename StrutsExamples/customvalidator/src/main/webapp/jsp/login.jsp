<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<body bgcolor="#00fff0">

<html:form action="/login" onsubmit="return validateLoginForm(this)">
<html:javascript formName="loginForm"/>

	<bean:message key="login.sid"/>
	<html:text property="sid"/>
	
	<html:submit value="submit"/>
	<html:errors property="sid"/>
</html:form>
</body>
</html:html>