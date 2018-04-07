<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<%
String num1=request.getParameter("number1");
String num2=request.getParameter("number2");
int a= Integer.parseInt(num1);
int b= Integer.parseInt(num2);
int result=a/b;

%>
<h1> division of both numbers result is<%=result %></h1>
</body>
</html>