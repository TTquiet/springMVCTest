<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${msg}</h1>

<c:forEach begin="1" end="10" var="i">
    <h3>${i}</h3>
</c:forEach>

</body>
</html>
