<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Information 
<bean:write name="searchForm" property="sid"/></h1>
<h1>Name:<%=request.getAttribute("a") %></h1>
<h1>Email:<%=request.getAttribute("b") %></h1>
<h1>PhoneNumber:<%=request.getAttribute("c") %></h1>
</body>
</html:html>