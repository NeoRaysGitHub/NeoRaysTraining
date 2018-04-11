<html>
<body bgcolor="wheat">
<h1>Without EL</h1>
<%
String a = (String) request.getAttribute("NAME");
String b = (String) session.getAttribute("NAME");
String c = (String) application.getAttribute("NAME");
%>

FirstName:<%=a %><br>
LastName:<%=b %><br>
Phone:<%=c %><br>


</body>
</html>