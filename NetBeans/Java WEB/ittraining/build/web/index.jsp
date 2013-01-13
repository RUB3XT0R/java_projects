<%-- 
    Document   : index
    Created on : 21/Out/2011, 15:13:03
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

        <div class="corpo" id="corpo" align="center">
            <table border="0">
                <tr><jsp:include page="hMenu.jsp"/></tr>
                <tr><jsp:include page="destaques.jsp"/></tr>
                <tr>
                    <td rowspan="2" valign="top"><jsp:include page="menu.jsp"/></td>
                    <td>
                        <table class="tableform" width="200" border="0">
                            <tr>
                                <td><img src="img/dslogo.png" width="280" /></td>
                                <td><img src="img/gilogo.png" width="280"/></td>
                            </tr>
                            <tr>
                                <th><img src="img/formDScursos.jpg" alt="" width="172" height="170" /></th>
                                <th><img src="img/formTIcursos.jpg" alt="" width="180" height="153" /></th>
                            </tr>
                            <tr>
                                <td><img src="img/orlogo.png" width="280" /></td>
                                <td><img src="img/saplogo.png" width="280"h /></td>
                            </tr>
                            <tr>
                                <th><img src="img/formOrcursos.jpg" alt="" width="137" height="140" /></th>
                                <th><img src="img/formSApcursos.jpg" alt="" width="181" height="126" /></th>
                            </tr>

                        </table>
                    </td>
                </tr>

            </table>
                    
            <img src="img/footer.png" width="720" height="110"/>
            
        </div>


    </body>
</html>
