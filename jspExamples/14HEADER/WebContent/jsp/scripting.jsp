<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="orange">
<h1>
<%
String x = request.getHeader("host");
String y = request.getHeader("user-agent");
String z = request.getHeader("accept-encoding");
String a = request.getHeader("accept-language");
%>
Value of header is: <%=x %> <br>
Value of header is: <%=y %> <br>
Value of header is: <%=z %> <br>

 </h1>
</body>
</html>