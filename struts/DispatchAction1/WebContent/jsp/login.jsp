<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html>
	<body bgcolor="#922B21">
		<html:form action="/login"> 
			<table>
				<tr>
					<td><bean:message key="login.number1"/></td>
					<td><html:text property="number1"/></td>
				</tr>
				<tr>
					<td><bean:message key="login.number2"/></td>
					<td><html:text property="number2"/><br></td>
				</tr>
			</table>
			<html:submit property="method">add</html:submit>
			<html:submit property="method">multiply</html:submit>
			<html:submit property="method">subtract</html:submit>
		</html:form>
	</body>
</html:html>