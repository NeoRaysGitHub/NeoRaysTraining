<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
<body bgcolor="wheat">
<html:form action="/login" onsubmit="return validateloginForm(this)">
<html:javascript formName="loginForm"/>

<table>
<tr>
<td><bean:message key="employee.name"/></td>
<td><html:text property="name"/></td>
<td><html:errors property="name"/></td>
</tr>
<tr>
<td><bean:message key="employee.id"/></td>
<td><html:text property="id"/></td>
<td><html:errors property="id"/></td>
</tr>
</table>
<html:submit  value="enter"></html:submit>


</html:form>
</body>
</html:html>