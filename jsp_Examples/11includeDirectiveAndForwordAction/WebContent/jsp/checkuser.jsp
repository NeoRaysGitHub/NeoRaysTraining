
<%
String strNme=request.getParameter("nme");
String strPwd=request.getParameter("pwd");

if ((strNme.equalsIgnoreCase("sachin")) && (strPwd.equalsIgnoreCase("pre"))  )
{
%>
<jsp:forward page="success.jsp"/>

<% 
}
else
{
%>
	
	<%@include file="../html/login.html" %>
	
<% 
}
%>
