<%--
    Document   : index
    Created on : 02/05/2011, 20:11:50
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <script language="JavaScript" src="scripts/validacao.js"></script>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <form name="principal" action="Compras.jsp" method="post" >
            <fieldset align="center">
                <legend>Login</legend>
                <table align="center">
                    <tr class="trPar">
                        <td>Nome de usuário:</td>
                        <td><input type="text" name="nome"></td>
                    </tr>
                    <tr class="trPar"><td  colspan="2"><input type="hidden" name="nomeerro" class="campoErro" disabled></td></tr>
                    <tr class="trImpar">
                        <td>Senha:</td>
                        <td><input type="text" name="senha"></td>
                    </tr>
                    <tr class="trImpar"><td  colspan="2"><input type="hidden" name="senhaerro" class="campoErro" disabled></td></tr>
                    <tr class="trPar">
                        <td colspan="2" align="center">
                            <input type="button" value="Enviar" onclick="validar()">
                        </td>
                    </tr>

                </table>

            </fieldset>
        </form>
    </body>
</html>