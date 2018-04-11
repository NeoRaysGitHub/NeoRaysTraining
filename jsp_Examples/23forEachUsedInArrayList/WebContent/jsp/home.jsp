<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body  bgcolor="yellow">

<c:forEach var="str" items="${alo }">
<c:out value="${str}"></c:out>
</c:forEach>
</body>
</html>