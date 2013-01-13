<%-- 
    Document   : calendario
    Created on : 25/Out/2011, 16:11:46
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
                       
                        <table width="100%" border="0" align="center">
                            <tr>
                                <td align="center">
                                    Calendário de Outubro
                                </td>
                            </tr>

                            <tr>
                                <th bgcolor="#FF0000" style="color:#FFF">Horários: Semana - das 19:00 ás 23:00 Sábados e Domingos: das 8:00 ás 18:00 horas</th>
                            </tr>
                            
                        </table>
                        
                        <center>Cursos intesivos - sábados e domingos</center>
                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="2" id="TabCalendario" bgcolor="#CCCCCC">
                            <tr>
                                <th bgcolor="#0000CC" style="color:#FFF" colspan="6"><strong>Formação Sistema Sap</strong></th>
                            </tr>

                            <tr bgcolor="white">
                                <td align="center" valign="middle"><strong>Curso</strong></td>
                                <td align="center" valign="middle"><strong>Carga Horária</strong></td>
                                <td align="center" valign="middle"><strong>Unidade ABC</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                                <td align="center" valign="middle"><strong>Unidade Paulista</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" height="19" align="left">SAP Foundation</td>
                                <td width="103" align="center">20 horas</td>
                                <td width="180" bgcolor="#EBEBEB"></td>
                                <td width="108" bgcolor="#EBEBEB"></td>
                                <td width="231" align="center">30/10</td>
                                <td align="center">2 domingos</td>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" align="left"> SAP ABAP/4 Foundation</td>
                                <td width="103" align="center">20 horas</td>
                                <td width="180" bgcolor="#EBEBEB"></td>
                                <td width="108" bgcolor="#EBEBEB"></td>
                                <td width="231" align="center">30/10</td>
                                <td width="108" align="center">2 domingos</td>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" align="left">SAP ABAP/4 Foundation II</td>
                                <td width="103" align="center">40 horas</td>
                                <td width="180" bgcolor="#EBEBEB"></td>
                                <td width="108" bgcolor="#EBEBEB"></td>
                                <td width="231" align="center">30/11</td>
                                <td width="108" align="center">4 domingos</td>
                            </tr>

                            <tr bgcolor="white">
                                <td height="19" align="left">SAP ABAP Expert</td>
                                <td align="center">40 horas</td>
                                <td bgcolor="#EBEBEB"></td>
                                <td bgcolor="#EBEBEB"></td>
                                <td align="center">A Marcar</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr bgcolor="white">
                                <td height="19" align="left">acote SAP ABAP (Completo)</td>
                                <td align="center">80 horas</td>
                                <td bgcolor="#EBEBEB"></td>
                                <td bgcolor="#EBEBEB"></td>
                                <td align="center">30/11</td>
                                <td align="center" bgcolor="white">8 domingos</td>
                            </tr>
                        </table>

                        <br />

                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="2" id="TabCalendario" bgcolor="#CCCCCC">
                            <tr>
                                <th bgcolor="#006600" style="color:#FFF" colspan="6"><strong>Formação Desenvolvimento de Sistemas</strong></th>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" align="center" valign="middle"><strong>Curso</strong></td>
                                <td width="103" align="center" valign="middle"><strong>Carga Horária</strong></td>
                                <td width="180" align="center" valign="middle"><strong>Unidade ABC</strong></td>
                                <td width="108" align="center" valign="middle"><strong>Período</strong></td>
                                <td width="231" align="center" valign="middle"><strong>Unidade Paulista</strong></td>
                                <td width="108" align="center" valign="middle"><strong>Período</strong></td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Lógica de Programação</td>
                                <td align="center" bgcolor="white">16 horas</td>
                                <td align="center" bgcolor="white">31/10</td>
                                <td align="center" bgcolor="white">4 dias</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Java Orientação a Objetos</td>
                                <td align="center" bgcolor="white">20 horas</td>
                                <td align="center" bgcolor="white">23/10</td>
                                <td align="center" bgcolor="white">2 domingos</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Java Desenvolvimento Web</td>
                                <td align="center" bgcolor="white">40 horas</td>
                                <td align="center" bgcolor="white">06/11</td>
                                <td align="center" bgcolor="white">4 domingos</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Java Completo</td>
                                <td align="center" bgcolor="white">60 horas</td>
                                <td align="center" bgcolor="white">23/10</td>
                                <td align="center" bgcolor="white">6 domingos</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Cobol</td>
                                <td align="center" bgcolor="white">60 horas</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="white">31/10</td>
                                <td align="center" bgcolor="white">15 dias semana</td>
                            </tr>

                            <tr>
                                <td height="19" align="left" bgcolor="white">Visual C#</td>
                                <td align="center" bgcolor="white">60 horas</td>
                                <td align="center" bgcolor="white">22/10</td>
                                <td align="center" bgcolor="white">6 sábados</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>
                        </table>

                        <br />

                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="2" id="TabCalendario" bgcolor="#CCCCCC">
                            <tr><td colspan="6" align="center" valign="middle" bgcolor="#FFCC00" style="color:#FFF"><strong>Formação Gestão de Tecnologia da Informação</strong></td></tr>

                            <tr bgcolor="white">
                                <td align="center" valign="middle"><strong>Curso</strong></td>
                                <td align="center" valign="middle"><strong>Carga Horária</strong></td>
                                <td align="center" valign="middle"><strong>Unidade ABC</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                                <td align="center" valign="middle"><strong>Unidade Paulista</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" align="left">Gestão de Projetos</td>
                                <td width="103" align="center" bgcolor="white">16 horas</td>
                                <td width="180" align="center" bgcolor="#FFFFFF">31/10</td>
                                <td width="108" align="center" bgcolor="#FFFFFF">4 dias semana</td>
                                <td width="231" align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td width="108" align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">ITIL V3 Foundation</td>
                                <td align="center" bgcolor="white">20 horas</td>
                                <td align="center" bgcolor="white">23/10</td>
                                <td align="center" bgcolor="white">2 domingos</td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                            </tr>

                            <tr>
                                <td height="38" align="left" bgcolor="white"> Gestão de Segurança da Informação </td>
                                <td align="center" bgcolor="white"> 20 horas </td>
                                <td align="center" bgcolor="white"> 20/10</td>
                                <td align="center" bgcolor="white">  2 domingos </td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                            </tr>

                            <tr>
                                <td height="15" align="left" bgcolor="white">Gestão Ágil (SCRUM)</td>
                                <td align="center" bgcolor="white">20 horas</td>
                                <td align="center" bgcolor="#FFFFFF">30/10</td>
                                <td align="center" bgcolor="#FFFFFF">2 domingos</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td align="center" bgcolor="#EBEBEB">&nbsp;</td>
                            </tr>

                        </table>

                        <br/>

                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="2" id="TabCalendario" bgcolor="#CCCCCC">
                            <tr><td colspan="6" align="center" valign="middle" bgcolor="#FF0000" style="color:#FFF"><strong>Formação Oracle</strong></td></tr>

                            <tr bgcolor="white">
                                <td align="center" valign="middle"><strong>Curso</strong></td>
                                <td align="center" valign="middle"><strong>Carga Horária</strong></td>
                                <td align="center" valign="middle"><strong>Unidade ABC</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                                <td align="center" valign="middle"><strong>Unidade Paulista</strong></td>
                                <td align="center" valign="middle"><strong>Período</strong></td>
                            </tr>

                            <tr bgcolor="white">
                                <td width="200" height="17" align="left">SQL Foundation</td>
                                <td width="103" align="center">30horas</td>
                                <td width="180" align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td width="108" align="center" bgcolor="#EBEBEB">&nbsp;</td>
                                <td width="231" align="center">15/10<br/>19/10</td>
                                <td width="108" align="center">3 sábados<br/>7 dias semana</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">PL/SQL</td>
                                <td align="center" bgcolor="white">30 horas</td>
                                <td align="center" bgcolor="white">22/10</td>
                                <td align="center" bgcolor="white">3 sábados</td>
                                <td align="center" bgcolor="white">19/11<br/>31/10</td>
                                <td align="center" bgcolor="white">3 sábados<br/>7 dias semana</td>
                            </tr>

                            <tr>
                                <td height="19" align="left" bgcolor="white">DBA I</td>
                                <td align="center" bgcolor="white">25 horas</td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="white">29/10</td>
                                <td align="center" bgcolor="white">5 dias semana</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">DBA II</td>
                                <td align="center" bgcolor="white">25 horas</td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="white">26/11</td>
                                <td align="center" bgcolor="white">5 dias semana</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Reports</td>
                                <td align="center" bgcolor="white">20 horas</td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="white">12/12</td>
                                <td align="center" bgcolor="white">5 dias semana</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Forms</td>
                                <td align="center" bgcolor="white">30 horas</td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"> </td>
                                <td align="center" bgcolor="white">26/11</td>
                                <td align="center" bgcolor="white">3 sábados</td>
                            </tr>

                            <tr>
                                <td align="left" bgcolor="white">Pacote Oracle Database</td>
                                <td align="center" bgcolor="white">55 horas </td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="#EBEBEB"></td>
                                <td align="center" bgcolor="white">29/10 </td>
                                <td align="center" bgcolor="white">10 dias de semana</td>
                            </tr>
                        </table>	
                    </td>
                </tr>

            </table>

            <img src="img/footer.png" width="720" height="110"/>

        </div>


    </body>
</html>

