<html>
<body bgcolor="pink">
<h1> Without EL and using Javacode </h1><br>

<%
  String strcountry = application.getInitParameter("country");
%>
Country Name:<%= strcountry %>
</body>
</html>