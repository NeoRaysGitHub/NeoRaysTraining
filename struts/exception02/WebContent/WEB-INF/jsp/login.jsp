<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html:html>
<body bgcolor="wheat">
<html:form action="/login">

<bean:message key="login.studentname"></bean:message>
<html:text property="studentName"/>
<html:submit value="Enter"/>
</html:form>
</body>
</html:html>
