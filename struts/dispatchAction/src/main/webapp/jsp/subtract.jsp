<html>
	<body bgcolor="wheat">
		<h1>Subtracted successfully</h1>
		<%
		String result = (String)request.getAttribute("Sub");
		System.out.println(result);
		%>
		Subtracted result is:<%=result %>
	</body>
</html>