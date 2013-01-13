<%-- 
    Document   : index
    Created on : 18/Nov/2011, 14:09:15
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Fazendo Upload de Arquivos</title>
    </head>
    <body>
        <jsp:useBean id="upl" scope="page" class="file.UploadBean"/>
        <jsp:setProperty name="upl" property="diretorio" 
         value="../testeUpload/build/web/arquivos/"/>
        <jsp:setProperty name="upl" property="size" value="5"/>
        <jsp:setProperty name="upl" property="extensoesPermitidas" value="pdf,doc,docx"/>
        
        <%
            if(upl.doFilePost(request,application)){
                out.print(upl.getFilename()+"\n"+upl.getDiretorio());
            }else{
                if(upl.getErro()!=null) out.println(upl.getErro());
            }
        %>
        
        <form method="post" action="index.jsp" enctype="multipart/form-data">
            Arquivos: <input type="file" name="file" /><br/>
            <input type="submit" name="submit" value="Enviar >>"/>
        </form>
        
    </body>
</html>
