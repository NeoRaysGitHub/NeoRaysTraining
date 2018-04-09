<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<% 

String name=request.getParameter("uname");
String pass=request.getParameter("pwd");
 %>
<p><font color="blue" size=""> Hi Mr <%= name %> you are warm welcome</font></p>
</body>
</html>