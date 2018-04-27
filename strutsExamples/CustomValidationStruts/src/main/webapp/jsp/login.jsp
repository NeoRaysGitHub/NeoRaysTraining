<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html:html>
	<body bgcolor="orange">
		<html:form action="/log">
			<table>
				<tr>
					<td><bean:message key="login.sid"/></td>
					<td><html:text property="sid"></html:text></td>
					<td><html:submit value="Enter"></html:submit></td>
					<td><html:errors property="sid"/></td>
				</tr>
			</table>
		</html:form>
	</body>
</html:html>