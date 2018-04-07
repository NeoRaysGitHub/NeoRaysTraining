<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
	<body bgcolor="#00ffff">
		<h1>Dear <bean:write name="loginForm" property="username"/> ,</h1>
		<h1>Please Enter Valid Username And Password</h1>
		<h1>Server Version: <%= application.getServerInfo() %><br>
		</h1>

	</body>
</html:html>