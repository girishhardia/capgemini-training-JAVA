<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h1>Add New User</h1>
    <form action="/maven-web/addUser" method="post">
        Name: <input type="text" name="name" /><br/>
        Email: <input type="text" name="email" /><br/>
        <input type="submit" value="Register" />
    </form>
    <br/>
    <a href="/maven-web/users">Back to List</a> | <a href="/maven-web/home">Home</a>
</body>
</html>
