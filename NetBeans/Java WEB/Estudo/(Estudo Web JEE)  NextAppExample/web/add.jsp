<%-- 
    Document   : index
    Created on : Mar 7, 2010, 1:36:57 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="example.MyClass" id="myBean" scope="application"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

out.println("The name is "+myBean.getMember().getName()+" and the Age is "+myBean.getMember().getAge());

        %>
    </body>
</html>
