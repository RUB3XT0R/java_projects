<%-- 
    Document   : Compras
    Created on : 02/05/2011, 21:43:57
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <script language="JavaScript" src="http://localhost:8080/LivroJSPEStudo/scripts/validacao.js"></script>
        <link href="http://localhost:8080/LivroJSPEStudo/styles/estilo.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <form name="principal" action="index.jsp">

            <fieldset align="center">
                <legend><b>Bem-Vindo á página Pedido de Item!</b></legend>
                <table border="0" align="center">
                    <tr class="trPar">
                        <td></td>
                        <td>Código</td>
                        <td>Nome</td>
                        <td>Preço</td>
                        <td>Quantidade</td>
                    </tr>

                    <tr class="trImpar">
                        <td><input type="checkbox" name="item1" onclick="selectedCheckQtde(this,qtde1)"></td>
                        <td>101</td>
                        <td>Caneta</td>
                        <td>$2.00</td>
                        <td><input type="text" name="qtde1"></td>
                    </tr>

                    <tr class="trPar">
                        <td><input type="checkbox" name="item2" onclick="selectedCheckQtde(this,qtde2)"></td>
                        <td>102</td>
                        <td>Lápis</td>
                        <td>$1.00</td>
                        <td><input type="text" name="qtde2"></td>
                    </tr>

                    <tr class="trImpar">
                        <td><input type="checkbox" name="item3" onclick="selectedCheckQtde(this,qtde3)"></td>
                        <td>103</td>
                        <td>Borracha</td>
                        <td>$0.50</td>
                        <td><input type="text" name="qtde3"></td>
                    </tr>

                    <tr><td  colspan="5"><input type="hidden" name="informe" class="campoErro" disabled></td></tr>
                    <tr class="trPar">
                        <td colspan="5" align="center">
                            <input type="button" value="Enviar" onclick="validarCompras()">
                        </td>
                    </tr>

                </table>

            </fieldset>
        </form>
    </body>
</html>
