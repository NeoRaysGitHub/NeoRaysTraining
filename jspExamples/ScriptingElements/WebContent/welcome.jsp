<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! int a=3; %>
<%!int b=3;
%>
<%!int sum=0; %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h1>welcome</h1>
<%
sum=a+b;
out.println("the sume is\t"+sum);
if(sum == 6 ){
	out.println("hello how are you"+sum+"conditions true");
	%><br>
	Hello how r u
	<%=sum%>
	conditon true
	<br>
	<%
} else {
	out.println("is not equal to 6<BR>");
	out.println(sum);
	
	%>
	this is from else loop:<%=sum %>
	<%
}
%>
<h2>end of the JSP</h2>
</body>
</html>