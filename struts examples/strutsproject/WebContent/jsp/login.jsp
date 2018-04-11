<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
<body bgcolor="wheat">
<html:form action="/login">
<table border="1">
<tr><td><bean:message key="login.empid"/></td>
<td><html:text property="empid"></html:text></td></tr>
<tr><td><bean:message key="login.password"/></td>
<td><html:password property="password"/></td></tr>
<tr ><td ><html:submit value="submit"></html:submit></td></tr>
</table>
</html:form>
<html:errors property="empid"/>
<html:errors property="password"/>

</body>
</html:html>