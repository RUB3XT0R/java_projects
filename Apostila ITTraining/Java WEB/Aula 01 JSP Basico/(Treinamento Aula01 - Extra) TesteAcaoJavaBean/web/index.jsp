

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
   <title>Produtos</title>
</head>
<body>
   <jsp:include page="topo.html"/>
   <h3>Novo produto</h3>
   <form action="form6proc.jsp" method="post">
      <table>
         <tr bgcolor="#cfcfef">
            <td>Código</td>
            <td><input type="text" name="codigo"></td>
         </tr>
         <tr bgcolor="#dfdfdf">
            <td>Descrição</td>
            <td><input type="text" name="descricao"></td>
         </tr>
         <tr bgcolor="#cfcfef">
            <td>Preço</td>
            <td><input type="text" name="preco"></td>
         </tr>
         <tr bgcolor="#dfdfdf" align="center">
            <td colspan="2"><input type="submit" value="Salvar"></td>
         </tr>
      </table>
   </form>
   <jsp:include page="footer.html"/>
</body>
</html>