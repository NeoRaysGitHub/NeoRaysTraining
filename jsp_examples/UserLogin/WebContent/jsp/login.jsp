<html>
<body>
<center>
<%
String username=request.getParameter("name");
String password=request.getParameter("pwd");
if((username.equalsIgnoreCase("manju"))&&(password.equals("manju"))){
%>
<p> <font size="4" color="green">Hello  <%=username%>  welcome to Home Page</font></p> 
<%}else{%>
<p><font size="3" color="red"> Invalid userName/password</font></p>
<%}%>
</center>
</body>
</html>