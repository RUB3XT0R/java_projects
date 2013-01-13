<%-- 
    Document   : index
    Created on : 12/05/2011, 21:31:42
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Inclusao de Fotos</title>
    </head>
    <body bgcolor="#FFFFFF"><h2>Incluir foto no banco de dados</h2><br>
        <form action="gravaFoto.jsp" method="post" enctype="multipart/form-data">
<input type="hidden" name="oculto" value="1">
<input type="text" name="arquivo" >
<input type="text" name="texto">
<input type="submit" value="Enviar">
</form>
        <hr>
        <form method="POST" action="uploadfiles.jsp" enctype="multipart/form-data">
   <input type="file" name="arquivo">
   <input type="hidden" name="teste" value="blablabla">
   <input type="submit">
</form>
    </body>
</html>
