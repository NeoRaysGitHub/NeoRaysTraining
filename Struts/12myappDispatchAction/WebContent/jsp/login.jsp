<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>


<html:html>
<html:form action="/login" >
<table>
<tr>
<td>	<bean:message key="login.message1"></bean:message> </td>
	<td><html:text property="number1"></html:text> </td>
	
	</tr>
<tr>
<td><bean:message key="login.message2"></bean:message></td>
	<td><html:text property="number2"></html:text></td>
</tr>

</table>
<html:submit property="method">add</html:submit>
<html:submit property="method">sub</html:submit>
<html:submit property="method">multiply</html:submit>
</html:form>
</html:html>

