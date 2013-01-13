<%-- 
    Document   : upProduto
    Created on : 27/Nov/2011, 15:50:22
    Author     : Lucas Biason
--%>
<%@page import="dao.ProdutoDao"%>
<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
      <script type="text/javascript" src="validacao.js"></script>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <% 
         int id= Integer.parseInt(request.getParameter("cod"));
         Produto p = new ProdutoDao().get(id);
      %>
      
      <h3>Alterando o Produto</h3>
      <form name="produto" method="post" action="controlProduto">
         <input type="hidden" name="operacao" value="altera"/>
         <input type="hidden" name="cod" value="<%= p.getCodigo() %>"/><br/>
         Nome: <input type="text" name="nome" value="<%= p.getNome() %>"/><br/>
         Valor: <input type="text" name="valor" value="<%= p.getValor() %>"/><br/>
         <input type="button" value="Enviar >>"
                onclick="validarProduto()"/>
      </form>
      
      <jsp:include page="footer.html"/>
   </body>
</html>

