<%-- 
    Document   : index
    Created on : Mar 7, 2010, 2:33:59 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib version="2.4" prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="myBean" scope="session"  class="devmedia.MyExampleBean" >
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Hello World!</h1
        <c:out value="The Test"/>
        <br/>
        <c:choose>

            <c:when test="${param.id eq '1'}">
                The param is good !
            </c:when>
            <c:when test="${param.id eq '2'}">
                The param is bad !
            </c:when>
        </c:choose>
        <c:if test="${param.id is empty}">
            Please , send the param id !!!
        </c:if>

        <c:forEach begin="1" end="10" var="item">
            <br/>
            <c:out value="${item}"/>
        </c:forEach>


        <table border="1">
            <tr>
                <td>Name</td>
                <td>Age</td>
            </tr>

            <c:forEach items="${myBean.names}" var="item">
                <tr>
                    <td><c:out value="${item.name}"/></td>
                <td><c:out value="${item.age}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
