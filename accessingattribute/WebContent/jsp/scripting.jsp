<html>
<body  bgcolor="wheat">
<h1>without el</h1>
<%
    String a = (String)request.getAttribute("FNAME");
    String b = (String)session.getAttribute("LNAME");
    String c = (String)application.getAttribute("PH");
%>
First Name:<%=a %><br>
Last Name:<%=b %><br>
Phone:<%=c %><br>


</body>

</html>