<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<%
	String strName = request.getParameter("name");
	String strPassword = request.getParameter("password");
	if ((strName.equalsIgnoreCase("bandhu")) && (strPassword.equalsIgnoreCase("123"))) {
%>
<p> <font size="3" color="green">Hello Mr <%=strName%> you are welcome</font></p> 
<%}else{%>
<p><font size="3" color="red">Hello Mr <%=strName%>your password is incoret</font></p>                
<%}%>
</body>
</html>