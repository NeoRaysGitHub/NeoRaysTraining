<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h2>student information</h2>
	
	 <form:form method="POST" action="/springMvcExceptionHandling/addStudent" commandName="command">
	
	<form:label path="name">Name</form:label>
	<form:input path="name"/>
	<form:label path="age">Age</form:label>
	<form:input path="age"/>
	<form:label path="id">Id</form:label>
	<form:input path="id"/>
	
	<input type="submit" value="submit">
	</form:form>
</body>

</html>