<%-- 
    Document   : index
    Created on : 13/05/2011, 17:06:14
    Author     : Lucas Biason
--%>

<%@page import="modelo.Destaque"%>
<%@page import="java.util.List"%>
<%@page import="banco.DestaquesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <link href="css/tudo.css" rel="StyleSheet" type="Text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="topo.jsp"/>
        <jsp:include page="topoSlide.jsp"/>
        <div id="corpo"></div>
        <jsp:include page="sobre.jsp"/>


    </body>
</html>
