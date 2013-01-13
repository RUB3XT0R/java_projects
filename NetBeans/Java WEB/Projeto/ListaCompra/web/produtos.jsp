<%-- 
    Document   : produtos
    Created on : 16/09/2011, 07:20:45
    Author     : lucasbiason
--%>

<%@page import="modelo.Produto"%>
<%@page import="java.util.*"%>
<%@page import="controle.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos/estiloLista.css" rel="stylesheet" type="text/css"/>
        <title>Sistema Lista de Compras</title>
    </head>
    <body>
    <center>
        <h1>Produtos</h1>
        <p>Produtos cadastrados</p>
       <hr color="gray">
        
       <div id="listaProduto">
           <table>
               <tr>
                   <th>Nome</th>
                   <th>Ações</th>
                   <th>Visualizar</th>
               </tr>
               <%
                   List<Produto> produtos = new ProdutoDao().getProdutos();
                   for (Produto p : produtos) {
               %>
               <tr>
                   <td><%= p.getNome()%></td>
                   <td>
                       <input type="button" value="Alterar" onclick="location='alterarP.jsp'">
                       <input type="button" value="Remover" onclick="location='removerP.jsp'">
                   </td>
                   <td></td>
               </tr>
               <% }%>
           </table>   
       </div>
        
        
        <div id="novoproduto">
            <form name="novoproduto" action="" method="post">
                Nome:<input type="text" name="nome"/>
                <input type="submit" value="Cadastrar"/>
            </form>
        </div>
    </center>
    </body>
</html>
