<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<body>
	<html:form action="/employee">
		<table border="1" align="center">
			<tr>
				<td><bean:message key="id" />:</td>
				<td><html:text property="employee_id"></html:text></td>
			</tr>
			<html:errors property="id" />
			<tr>
				<td><bean:message key="name" />:</td>
				<td><html:text property="employee_name"></html:text></td>
			</tr>
			<html:errors property="name" />
			<tr>
				<td><bean:message key="job" />:</td>
				<td><html:text property="job"></html:text></td>
			</tr>
			<html:errors property="job" />
			<tr>
				<td><bean:message key="salary" />:</td>
				<td><html:text property="salary"></html:text></td>
			</tr>
			<html:errors property="salary" />
			<tr>
				<td><bean:message key="phone" />:</td>
				<td><html:text property="phone"></html:text></td>
			</tr>
			<html:errors property="phone" />
			<tr>
				<td align="center"><html:submit property="submit">
						<bean:message key="save" />
					</html:submit></td>
				<td align="center"><html:submit property="submit">
						<bean:message key="update" />
					</html:submit></td>
			</tr>
		</table>
	</html:form>
</body>
</html>
