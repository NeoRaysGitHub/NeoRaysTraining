<html>
	<body bgcolor="wheat">
		<h1>Multiplied successfully</h1>
		<%
		String result = (String)request.getAttribute("Mul");
		System.out.println(result);
		%>
		Multiplied result is:<%=result %>
	</body>
</html>