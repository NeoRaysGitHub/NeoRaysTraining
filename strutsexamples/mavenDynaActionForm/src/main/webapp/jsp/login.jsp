                                             <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>DYNAFORM</h1>
<html:form action="/login">
<table>
<tr>
 <td><bean:message key="login.UserName"/></td>
 <td><html:text property="username"/></td>
</tr>
<tr>
 <td><bean:message key="login.Password"/></td>
 <td><html:text property="password"/></td>
</tr>
</table>
<html:submit value="sign in"/>
</html:form>
</body>
</html:html>