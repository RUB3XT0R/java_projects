<%-- 
    Document   : form6proc
    Created on : 10/05/2011, 17:34:40
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="produto" class="classes.Produto" scope="session"/>
<jsp:setProperty name="produto" property="*"/>
<jsp:forward page="form6data.jsp"/>