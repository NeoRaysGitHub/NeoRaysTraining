<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><spring:message code="welcome.heading" text="default text"/></h1>
<spring:message code="welcome.lan" text="default text"/> <a href="?language=en">English</a>|
<a href="?language=te"><spring:message code="welcome.archorheading" text="default text"/></a>
<h3>
  <spring:message code="welcome.springmvc" text="default text"/>
</h3>
Current Locale : ${pageContext.response.locale}

</body>
</html>