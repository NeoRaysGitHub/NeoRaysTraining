<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body bgcolor="orange">
<h1>Without EL and using java code</h1><br>
<%
	String a = request.getMethod();
	String b = request.getProtocol();
	String c=request.getParameter("fname");
%>
 <h1>Http Method Name <%= a %><br>
     Http Protocol Name <%= b %>
     
     U r name is:<%=c %></h1>

</body>
</html>