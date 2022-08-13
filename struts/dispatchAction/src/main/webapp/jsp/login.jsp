<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>

<html:html>
	<body bgcolor="458956">
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
			<html:submit property="method">sub</html:submit>
			<html:submit property="method">mul</html:submit>
		</html:form>
	</body>
</html:html>