<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<body>
<h2>Spring mvc I18 Example</h2>

Language:<a href="?language=en">English</a>
		<a href="?language=zh_CN">Chinese</a>
		
		<h2>	
		welcome.springmvc:<spring:message code="welcome.springmvc" text="default text" />
		</h2>
		
		current Locale : ${pageContext.response.locale}
</body>
</html>