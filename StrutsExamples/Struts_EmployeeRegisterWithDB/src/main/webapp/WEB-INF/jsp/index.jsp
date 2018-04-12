<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html:form action="/register">
	<table border="2" align="center">
		<tr>
		<td><bean:message key="id"/></td><td><html:text property="employee_id"></html:text></td>
		</tr>
		<tr>
		<td><bean:message key="name"/></td><td><html:text property="employee_name"></html:text></td>
		</tr>
		<tr>
		<td><bean:message key="job"/></td><td><html:text property="job"></html:text></td>
		</tr>
		<tr>
		<td><bean:message key="salary"/></td><td><html:text property="salary"></html:text></td>
		</tr>
		<tr>
		<td><bean:message key="phone"/></td><td><html:text property="phone"></html:text></td>
		</tr>
		<tr>
		<td colspan="2" align="center"><html:submit value="Register"></html:submit></td>
		</tr>		
	</table>
	 <html:link action="/select.do">Get Employees</html:link>	
</html:form>
