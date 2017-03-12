<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="DiceFunctions" %>
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
    
    <jsp:useBean id="inputPerson" class="andrii.model.Employee" scope="request" >
        <jsp:setProperty name="inputPerson" property="*" />
    </jsp:useBean>
    name: <jsp:getProperty name="inputPerson" property="name"/>
    <br>id: <jsp:getProperty name="inputPerson" property="empID"/>


    <br><br>
    Person's dog's name: ${person.dog.name}

    <br><br>
    The first element of list: ${myList[0]}
    <br>Whole list: ${myList}

    <br><br>
    Map's value: ${musicMap[Genere]}
    <br>
    Map's value: ${musicMap["Ambient"]}
    <br>
    Map's value: ${musicMap.Ambient}

    <br><br>
    <form action="/testJSP.do">
        Name: <input type="text" name="name2">
        ID#: <input type="text" name="empID2">
        First food: <input type="text" name="food">
        Second food: <input type="text" name="food">
        <input type="submit">
    </form>
    <br>
    Request param name is: ${param.name2}<br>
    Request param empID is: ${param.empID2}<br>
    Request param food is: ${param.food}<br>
    First food request param: ${paramValues.food[0]}<br>
    Second food request param: ${paramValues.food[1]}<br>
    Request param name: ${paramValues.name2[0]}


    <br><br>
    Host is: ${header.host}<br>
    HTTP method is: ${pageContext.request.method}<br>
    Username cookie: ${cookie.userName.value}<br>
    Context init parameter, breed: ${initParam.breed}

    <br><br>
    Roll dice: ${mine:rollIt()}

</body>
</html>
