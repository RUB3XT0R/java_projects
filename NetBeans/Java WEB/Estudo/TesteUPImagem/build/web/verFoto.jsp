<%@page import="java.sql.*"%>
<%@ page language="java" import="java.lang.*" %>

<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileUploadException"%>
<%@page import="org.apache.tomcat.util.http.fileupload.DiskFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileUpload"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
            try {
// criando a conexao com o banco de dados
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojsp", "root", "cdf2525");

                Statement stm = con.createStatement();
                int codigo;
// pegando o codigo da foto a ser exibida
                if (request.getParameter("numero") == null) {
                    codigo = 1;
                } else {
                    codigo = Integer.parseInt(request.getParameter("numero"));
                }
// procurando pela foto na tabela
                ResultSet rs = stm.executeQuery("SELECT * FROM foto WHERE codigo = " + codigo);
                if (rs.next()) {
// pegando o conteudo do campo foto (BLOB, binario)
                    Blob blob = rs.getBlob("foto");
// Codificando para JPG e enviando para o browser, através do Output do servlet
                    //JPEGManager.encodeJPG(response.getOutputStream(), blob.getBytes(1, (int) blob.length()));

                }
            } catch (Exception e) {
// erro
%>Erro encontrado<%            }
%>
