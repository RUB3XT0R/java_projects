<%-- 
    Document   : delProduto
    Created on : 27/Nov/2011, 16:09:50
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
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <% 
         int id= Integer.parseInt(request.getParameter("cod"));
         Produto p = new ProdutoDao().get(id);
      %>
      
      <h3>Deseja realmente deletar o produto a seguir?</h3>
      <form name="produto" method="post" action="controlProduto">
         <input type="hidden" name="operacao" value="deleta"/>
         <input type="hidden" name="cod" value="<%= p.getCodigo() %>"/><br/>
         Nome:&nbsp;<%= p.getNome() %><br/>
         Valor:&nbsp;<%= p.getValor() %><br/>
         <input type="button" value="Voltar"
                onclick="history.go(-1)"/> |
         <input type="submit" value="Deletar >>"/>
      </form>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
