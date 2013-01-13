<%-- 
    Document   : index
    Created on : 25/Nov/2011, 12:53:00
    Author     : Lucas Biason
--%>

<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <%
         ProdutoDao dao = new ProdutoDao();
         /*
         Produto p = new Produto();
         p.setNome("bolacha");
         p.setValor(2.34f);
         dao.adiciona(p);
         
         Produto p1 = new Produto();
         p1.setNome("bola");
         p1.setValor(3.50f);
         dao.adiciona(p1);
         */
         out.println("</br>---Lista de produtos----</br>");
         for(Produto atual : dao.getLista()){
            out.println(atual+"<br/>");
         }
         out.println("</br>---Produto 1----</br>");
         Produto p1 = dao.get(1);
         out.println(p1);
         out.println("</br>---Produto 2----</br>");
         Produto p2 = dao.get(2);
         out.println(p2);
      %>
   </body>
</html>
