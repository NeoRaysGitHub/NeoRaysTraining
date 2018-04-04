<html>
<body bgcolor="pink">
<h1>
First Name :${requestScope.FNAME} or ${FNAME} or ${requestScope["FNAME"]}<br>
Last Name :${sessionScope.LNAME} or ${LNAME}  or ${sessionScope["LNAME"]}<br>
Phone :${applicationScope.PH} or ${PH}  or ${applicationScope["PH"]}
</h1>
</body>
</html>