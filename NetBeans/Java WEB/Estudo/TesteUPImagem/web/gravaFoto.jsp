<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.Image"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileUploadException"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.DiskFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileUpload"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body bgcolor="#FFFFFF">
        <%
            Image imagem = ImageIO.read(new File(request.getParameter("arquivo")));
            //OBTEM A IMAGEM E TRANSFORMA EM BYTES[]
            ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
            ImageIO.write((BufferedImage)imagem, "jpg", bytesImg);//seta a imagem para bytesImg
            bytesImg.flush();//limpa a variável
            byte[] byteArray = bytesImg.toByteArray();//Converte ByteArrayOutputStream para byte[]
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojsp", "root", "cdf2525");
                    // onde tem “?”, será substituído por valores posteriormente.
                    PreparedStatement pstm = con.prepareStatement("INSERT INTO foto(comentario, foto) VALUES(?, ?)");
                    pstm.setObject(1,request.getParameter("texto"));
                    pstm.setObject(2,byteArray);
                    pstm.executeUpdate();



        %>
        <h2>Fonto inserida com sucesso no banco de dados!</h2>
    </body>
</html>