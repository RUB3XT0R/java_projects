<%-- 
    Document   : validar
    Created on : 04/05/2011, 17:05:07
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%--
   String nome = request.getParameter("nome");
   String telefone = request.getParameter("telefone");

   if (nome == null || nome.equals("")) {
      response.sendRedirect("index.jsp");
   } else {
      response.sendRedirect("ProcessarAcesso.jsp");
   }
--%>


<%
    String nome = request.getParameter("nome");
    String telefone = request.getParameter("telefone");

    if(nome == null || nome.equals("") || telefone == null || telefone.equals("")){
        response.sendRedirect("index.jsp");
    }else{
        application.setAttribute("nome",nome);
        application.setAttribute("telefone",telefone);
        response.sendRedirect("ProcessarAcesso.jsp");
    }

%>