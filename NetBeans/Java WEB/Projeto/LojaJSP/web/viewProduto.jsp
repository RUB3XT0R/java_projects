<%-- 
    Document   : viewProduto
    Created on : 26/07/2011, 15:39:49
    Author     : lucas biason
--%>

<%@page import="controle.ProdutoControle"%>
<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            long codigo = Long.parseLong(request.getParameter("cod"));
            Produto p = (new ProdutoControle()).getProduto(codigo); 
        %>
        <h1>Produto <%= p %></h1>
        Descrição:<input type="text" name="descricao" value="<%= p.getDescricao() %>" style="border: 0px;color: darkolivegreen"/><br/>
        Quantidade:<input type="text" name="qtde" value="<%= p.getQtde() %>" style="border: 0px;color: darkolivegreen"/><br/>
        Valor:<input type="text" name="valor" value="<%= p.getValor() %>" style="border: 0px;color: darkolivegreen"/><br/>
        Quantidade Mínima:<input type="text" name="qtdeMin" value="<%= p.getQtdeMin() %>" style="border: 0px;color: darkolivegreen"/><br/>
        Quantidade Máxima por compra:<input type="text" name="qtdeMax" value="<%= p.getQtdeMaxCompra() %>" style="border: 0px;color: darkolivegreen"/><br/>
        Fornecedor:<input type="text" name="Fornecedor" value="<%= p.getFornecedor() %>" style="border: 0px;color: darkolivegreen"/><br/>
        <input type="submit" value="Adicionar"/>
    </body>
</html>
