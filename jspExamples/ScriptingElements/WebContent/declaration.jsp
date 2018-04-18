<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!
int i=100;
public String sayhello(String name)
	{
	return"hello\t"+name;
	
	} 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h3>hai to uers:<%=sayhello("bharath") %></h3>
<h5>value of i:<%=i %></h5>

</body>
</html>