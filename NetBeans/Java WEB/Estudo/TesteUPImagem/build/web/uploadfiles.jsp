
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@page import="org.apache.commons.fileupload.FileUpload"%>
<%
            boolean isMultipart = FileUpload.isMultipartContent(request);
            if (isMultipart) {
                // Create a new file upload handler
                DiskFileUpload upload = new DiskFileUpload();

                // Set upload parameters
                upload.setSizeMax(50 * 1024 * 1024); //50Mb
                upload.setRepositoryPath("G:/Lucky Biason Files/Trabalhos/Java/SistemaDestaque/web/img/");

                // Parse the request
                List items = upload.;

                Iterator it = items.iterator();
                while (it.hasNext()) {
                    FileItem fitem = (FileItem) it.next();
                    if (!fitem.isFormField()) {
%><%= fitem.getName()%> - <%= fitem.getSize()%> bytes
<%
                    }
                }
            }
%>
