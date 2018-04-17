<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<body bgcolor="wheat">
<h1>your sid" <bean:write name="loginForm" property="sid"/>" is invalid ,</h1>
		<h1>Please Enter Valid SID</h1>
</body>
</html>