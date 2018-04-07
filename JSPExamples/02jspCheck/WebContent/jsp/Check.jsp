<html>
<body bgcolor="wheat">
<%
String strName= request.getParameter("nme");
String strPassword= request.getParameter("pwd");
if((strName.equals("ashu")) && (strPassword.equalsIgnoreCase("ash")))
{
	
%>
<p><font size="3 color="blue"> hi <%= strName %> you are welcome</font></p>
<%} else { %>
<p> <font size="3" color="red">hello<%=strName %>you are not a valid user</font></p>
<%} %>

</body>
</html>