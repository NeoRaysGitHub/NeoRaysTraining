<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="wheat">
		<html:form action="/search">
					<bean:message key="login.username"/>
					<html:text property="username"/>
					<bean:message key="login.password"/>
					<html:password property="password"/>
		<html:submit value="Submit"/>
		</html:form>
		<html:errors/>
	</body>
</html:html>