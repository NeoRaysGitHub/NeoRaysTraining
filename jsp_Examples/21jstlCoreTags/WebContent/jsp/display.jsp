<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="neorays" %>

<html>
<body bgcolor="yellow">




<neorays:set var="colour" value="${param.nme }"></neorays:set>
<neorays:choose>
<neorays:when test="${colour==red }">
it is red
</neorays:when>
<neorays:when test="${colour==yellow }">
it is red
</neorays:when>

<neorays:otherwise > unkown </neorays:otherwise>


</neorays:choose>

</body>
 
</html>