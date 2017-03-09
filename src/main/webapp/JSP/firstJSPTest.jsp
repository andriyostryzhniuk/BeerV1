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
        id: <input type="text" name="id">
        name: <input type="text" name="name">
        breed: <input type="text" name="breed">
        <input type="submit">
    </form>
    
    <jsp:useBean id="inputDog" class="andrii.model.Dog" scope="request" >
        <jsp:setProperty name="inputDog" property="*" />
    </jsp:useBean>
    id: <jsp:getProperty name="inputDog" property="id"/>
    <br>name: <jsp:getProperty name="inputDog" property="name"/>
    <br>breed: <jsp:getProperty name="inputDog" property="breed"/>

</body>
</html>
