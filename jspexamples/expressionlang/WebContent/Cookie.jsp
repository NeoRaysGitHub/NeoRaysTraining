<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String s1=request.getParameter("fn");
String ss=request.getParameter("ln");%>

<h1>

Company name is ${param.compname}<br/>
Salary is ${param.sal}<br/>
First name cookie is ${cookie.FNAME.value}<br/>
</h1>
</body>
</html>