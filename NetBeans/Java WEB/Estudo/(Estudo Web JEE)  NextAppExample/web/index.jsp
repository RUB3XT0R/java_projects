<%-- 
    Document   : index
    Created on : Mar 7, 2010, 1:36:57 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="example.MyClass" id="myBean" scope="application"/>
<jsp:setProperty name="myBean.member" property="*"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP Page</h1>
        <%= myBean.toString() %>
        <% myBean.doProcessParam(request.getParameter("theParam")); %>

        <form action="add.jsp">
            Enter the name <input size="30" id="name"/><br/>
            Enter the age <input size="10" id="age"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
