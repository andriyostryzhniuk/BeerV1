<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Advisor</title>
</head>
<body>
    <h1 align="center">Admin's email:</h1>
    <p><%
        out.print("<center>" + request.getAttribute("email") + "</center>");
    %>
</body>
</html>
