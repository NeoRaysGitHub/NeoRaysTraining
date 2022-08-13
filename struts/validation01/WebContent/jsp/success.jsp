<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<body bgcolor="wheat">
<h1>

Name:  <%=request.getAttribute("a") %><br>
Email:  <%=request.getAttribute("b") %><br>
Phone: <%=request.getAttribute("c") %>
</h1>

</body>

</html:html>