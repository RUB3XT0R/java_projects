<%-- 
    Document   : upProduto
    Created on : 27/Nov/2011, 15:50:22
    Author     : Lucas Biason
--%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelo.Cliente"%>
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
         Cliente c = new ClienteDao().get(id);
      %>
      
      <h3>Alterando o Cliente</h3>
      <form name="cliente" method="post" action="controlCliente">
         <input type="hidden" name="operacao" value="altera"/>
         <input type="hidden" name="cod" value="<%= c.getCodigo() %>"/><br/>
         CPF: <input type="text" name="cpf" value="<%= c.getCpf() %>"/><br/>
         Nome: <input type="text" name="nome" value="<%= c.getNome() %>"/><br/>
         Telefone: <input type="text" name="telefone" value="<%= c.getTelefone() %>"/><br/>
         Endereço: <input type="text" name="endereco" value="<%= c.getEndereco() %>"/><br/>
         <input type="button" value="Enviar >>"
                onclick="validarCliente()"/>
      </form>
      
      <jsp:include page="footer.html"/>
   </body>
</html>

