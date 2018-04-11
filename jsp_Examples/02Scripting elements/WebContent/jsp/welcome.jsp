<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! int a=3; %>
<%! int b=3; %>
<%! int sum=0; %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
sum=a+b;
out.println("sum :"+sum);

%><br>
<% 
if(sum==6)
{
	out.println("sum :"+sum+"how are you");

%> <br>
how are you <%=sum %>
<%
}

else
{
	out.println("sum :"+sum+"how are you <br>");

%>
<br>

haiiiii

<%
}
%>

</body>
</html>