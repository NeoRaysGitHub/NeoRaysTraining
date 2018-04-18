<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor ="red">

<%String strName=request.getParameter("nme");
String strPassword=request.getParameter("pwd");

if(strName==null && strName==null){
	strName="bharath";
	strPassword="bharath@143";
}
if((strName.equalsIgnoreCase("bharath"))&& (strPassword.equalsIgnoreCase("bharath@143"))){
%>
<p><font size="3" color="blue">Hello<%=strName %>you are welocme</font>
<% }%>

</body>
</html>