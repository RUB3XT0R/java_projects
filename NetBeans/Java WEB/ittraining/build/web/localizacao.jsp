<%-- 
    Document   : localizacao
    Created on : 25/Out/2011, 16:09:39
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>IT Training :: Quem Somos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery.js"></script>
    </head>


    <body>
        <div class="corpo" id="corpo">
            <table border="0">
                <tr><jsp:include page="hMenu.jsp"/></tr>
                <tr><jsp:include page="destaques.jsp"/></tr>
                <tr>
                    <td rowspan="2" valign="top"><jsp:include page="menu.jsp"/></td>
                    <td align="justify" width="570px" >
                        <br/><br/>
                        <font size="4" color="0F446C">Unidade Paulista - Rua Vergueiro, 2.045 ,cj. 806/807 - São Paulo - SP</font>              
                        <br/><small>Clique na imagem para abrir o google maps</small>
                        <br/><br/>
                        <a href="http://maps.google.com.br/maps/place?ftid=0x94ce5984e305e52f:0x6ad0a717ed08d165&q=Rua+Vergueiro,+2.045+,cj.+806/807+-+S%C3%A3o+Paulo+-+SP&hl=pt-BR&ved=0CA4Q-gswAA&sa=X&ei=JbmcTvOcC6XIywSCmbjPBA&sig2=UUs5JFJbnDnLxzp9tXBB_Q">
                            <img src="img/mapa_it_UP.png" alt="" width="570">
                        </a>
                        <br/><br/>
                        <font size= "4" color="0F446C">Unidade ABC - Rua Amazonas, 521 ,cj. 56/58 - São Caetano do Sul - SP</font>						<br/><small>Clique na imagem para abrir o google maps</small>
                        <br/><br/>
                        <a href="http://maps.google.com.br/maps/place?ftid=0x94ce5cec1d738209:0x44b576c6eaf1c07&q=Rua+Amazonas,+521+,cj.+56/58+-+S%C3%A3o+Caetano+do+Sul+-+SP&hl=pt-BR&ved=0CA4Q-gswAA&sa=X&ei=5bicTvuELYe4yASr4LQV&sig2=YPhnywObStDsVExVfA1o4g">
                            <img src="img/mapa_it_cptm.jpg" alt="" width="570" align="absmiddle"/>
                        </a>
                        <br/><br/>	
                    </td>
                </tr>

            </table>

            <img src="img/footer.png" width="720" height="110"/>

        </div>


    </body>
</html>

