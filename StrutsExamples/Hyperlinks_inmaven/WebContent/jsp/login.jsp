<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<body bgcolor="green">
<a href="hai.jsp"> using html tag</a><br>
<html:link page="/jsp/hai.jsp">using struts tag</html:link><br>
<html:link forward="hello">using forward with global forward </html:link><br>
<html:link action="hello">using actionforward with forward </html:link><br>
</body>
</html:html>