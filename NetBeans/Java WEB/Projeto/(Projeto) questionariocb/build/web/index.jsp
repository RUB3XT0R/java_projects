
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Question�rio Engenharia - Login</title>
        <script language="JavaScript" src="js/validacoes.js"></script>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

            <div id="topo">
                <h3>Pesquisa de Engenharia</h3>
            </div>

            <div id="formulario">
                <form name="principal" action="logar" method="post" onsubmit="validarLogin()">
                        <table border="0" align="center">
                            <caption>Login</caption>
                            <tr><td colspan="2"><hr></td></tr>

                            <tr>
                                <td valign="top">RA:</td>
                                <td>
                                    <input type="text" size="20" name="ra"/>
                                    <input type="hidden" value="" name="raerro" style="border: none; color: darkred; background-color: transparent;">
                                </td>
                            </tr>

                            <tr>
                                <td  valign="top">CPF:</td>
                                <td>
                                    <input type="text" size="20" name="cpf"/><br/>
                                    <span style="font-size: x-small">(sem tra�o, nem ponto, apenas n�meros)</span>
                                    <input type="hidden" value="" name="cpferro" style="border: none; color: darkred; background-color: transparent;">
                                </td>
                            </tr>

                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="OK" />
                                </td>
                            </tr>

                            <tr><td colspan="2"><hr></td></tr>
                        </table>
                </form>
            </div>

            <div id="info">
                <p>Essa � uma pesquisa realizada pela coordena��o do Ciclo B�sico para fins informativos.</p>
                <p>Apresente sua op��o de engenharia pretendida. Isso � muito importante para n�s.</p>
                <p>Lembrando que o aluno n�o ser� matriculado automaticamente na modalidade escolhida. Isto � apenas uma pesquisa.</p>
            </div>

            <div id="logo">
                <a href="http://www.fsa.br/"><img src="img/logofsa2.png" width="330" height="150"></a>
            </div>
    </body>
</html>
