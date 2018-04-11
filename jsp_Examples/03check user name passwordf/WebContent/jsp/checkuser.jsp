<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%
String strNme=request.getParameter("nme");
String strPwd=request.getParameter("pwd");
if((strNme.equalsIgnoreCase("sachin")) && (strPwd.equalsIgnoreCase("pree")))
{
	%>
	
	 <p> hello miss/mr <%=strNme %> you are welcome </p>
	 <% 
}
else
{
	%>
	<p> <font color="blue"> you are inavlid uswer   <%=strNme %> </font></p>
	
	<%
}
%>

</body>
</html>