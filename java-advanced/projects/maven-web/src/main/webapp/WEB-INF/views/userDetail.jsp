<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Detail</title>
</head>
<body>
    <h1>User Details</h1>
    <c:if test="${not empty user}">
        <p>ID: ${user.id}</p>
        <p>Name: ${user.name}</p>
        <p>Email: ${user.email}</p>
    </c:if>
    <c:if test="${empty user}">
        <p>User not found.</p>
    </c:if>
    <br/>
    <a href="/maven-web/users">Back to List</a> | <a href="/maven-web/home">Home</a>
</body>
</html>
