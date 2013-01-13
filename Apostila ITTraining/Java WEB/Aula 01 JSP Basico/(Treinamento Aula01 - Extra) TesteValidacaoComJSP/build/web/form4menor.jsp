<%-- 
    Document   : form4proc
    Created on : 07/05/2011, 20:38:02
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>
        <jsp:include page="topo.html"/>
        <h3>${param.nome}</h3>
        <p>Você tem ${param.idade} anos
        e <b>NÃO PODE</b> acessar este conteúdo.</p>
        
      <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      <jsp:include page="footer.html"/>
    </body>
</html>