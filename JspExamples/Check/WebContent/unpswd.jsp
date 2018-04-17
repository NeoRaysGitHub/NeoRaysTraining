<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body bgcolor='grey'>
<% String surname=request.getParameter("nm");
String strpswd=request.getParameter("pwd");
if(surname.equalsIgnoreCase("Deepa")&&strpswd.equalsIgnoreCase("shree")){
%> <p style="COLOR: #ff0080;">welcome </p><%=surname %><p>to neorays</p>
<p><a href="logout.jsp">logout...</a></p>  
<% }else{ %><p> your are not a valid user</p><%} %>
</body>
</html>