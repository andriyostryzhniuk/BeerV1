<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSPTest</title>
</head>
<body>
    <jsp:useBean id="nullDog" type="andrii.model.Pet" scope="request" />
    <jsp:getProperty name="nullDog" property="name" />


    <jsp:useBean id="firstDog" class="andrii.model.Dog" scope="page" >
        <jsp:setProperty name="firstDog" property="name" value="Edra" />
    </jsp:useBean>
    <jsp:getProperty name="firstDog" property="name" />


    <jsp:useBean id="secondDog" type="andrii.model.Pet" class="andrii.model.Dog" scope="page" >
        <jsp:setProperty name="secondDog" property="name" value="Donna" />
    </jsp:useBean>
    <jsp:getProperty name="secondDog" property="name" />

    <br><br>
    <form action="/testJSP.do">
        id: <input type="text" name="empID">
        name: <input type="text" name="name">
        <input type="submit">
    </form>
    
    <jsp:useBean id="person" class="andrii.model.Employee" scope="request" >
        <jsp:setProperty name="person" property="*" />
    </jsp:useBean>
    name: <jsp:getProperty name="person" property="name"/>
    <br>id: <jsp:getProperty name="person" property="empID"/>

</body>
</html>
