<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytaglib" uri="/WEB-INF/tlds/myTagLib.tld" %>
<%@taglib version="2.4" prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="The Value "/>
        <mytaglib:exampleTag/>
    </body>
</html>
