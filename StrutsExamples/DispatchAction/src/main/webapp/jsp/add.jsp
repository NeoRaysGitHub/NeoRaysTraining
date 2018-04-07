<html>
	<body bgcolor="wheat">
		<h1>Added successfully</h1>
		<%
		String result = (String)request.getAttribute("result");
		System.out.println(result);
		%>
		Result is:<%=result %>
	</body>
</html>