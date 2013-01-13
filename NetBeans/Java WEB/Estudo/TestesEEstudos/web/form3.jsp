<%-- 
    Document   : form3.jsp
    Created on : 06/05/2011, 16:44:37
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>
        <form action="form3resp.jsp" method="get">
            <table border="0">
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome" value=""</td>
                </tr>
                <tr>
                    <td>E-mail::</td>
                    <td><input type="text" name="mail" value=""</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" value="Enviar"</td>
                </tr>
            </table>
                    <p>Nome: ${param["nome"]}<br/>E-mail: ${param["mail"]}</p>
        </form>
    </body>
</html>
