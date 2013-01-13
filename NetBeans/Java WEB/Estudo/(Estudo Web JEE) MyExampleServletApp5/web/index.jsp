<%-- 
    Document   : index
    Created on : Mar 7, 2010, 3:59:45 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Data to Servlet</title>
    </head>
    <body>
        <h1>Data Servlet</h1>
        <form action="ReciveDataServlet">
            The Data:<br/>

            <textarea name="text"></textarea>
            <br/>
            <input type="submit"/>
        </form>
    </body>
</html>
