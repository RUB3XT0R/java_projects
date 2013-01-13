<%-- 
    Document   : add
    Created on : 12/01/2011, 13:20:03
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean  class="examples.MyClass" id="myBean" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link href="styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h2><img src="styles/draw.png" width="30" heigth="30">Adicionado o usuario:</h2>
        <%
            out.print("<br>Nome: "+myBean.getMember().getName() + "<br>Idade: "+ myBean.getMember().getAge());
            out.print("<br>"+myBean.toString());
            out.print("<br>Nome: "+ request.getParameter("name") + "<br>Idade: "+ request.getParameter("age"));
            myBean.getMember().setName(request.getParameter("name"));
            myBean.getMember().setAge(Integer.parseInt(request.getParameter("age")));
            out.print("<br>"+myBean.toString());
        %>
    </body>
</html>
