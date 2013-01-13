<%-- 
    Document   : index
    Created on : Mar 7, 2010, 1:48:31 PM
    Author     : Administrador
--%>

<%@page import="devmedia.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="productBean" class="devmedia.MyProducts" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>The id of selected product is ${param.idOfProduct}</h2>
        <h2>The other id of selected product is <%= request.getParameter("idOfProduct") %></h2>
        <a href="index.jsp">
            Go Back !!!
        </a>
    </body>
</html>
