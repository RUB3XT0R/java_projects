/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Lucas Biason
 */
public class UploadBean {

    private DiskFileItemFactory fileUpload = new DiskFileItemFactory();
    private ServletFileUpload sfu = new ServletFileUpload(fileUpload);
    
    private static int KB = 1024;
    private static int MB = 1024*1024;
    private int size;
    private String extensoesPermitidas;
    
    private String diretorio;
    private String filename;

    private String erro=null;
    
    public boolean doFilePost(HttpServletRequest request, ServletContext context) {

        if(request.getContentType() == null){return false;}
        if(!request.getContentType().startsWith("multipart/form-data")){return false;}
        
        String path = context.getRealPath(getDiretorio());
        try {
            sfu.setSizeMax(getSize()*MB);
            List list = sfu.parseRequest(request);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if (!item.isFormField()) {
                    filename = item.getName();
                    if(! isPermission(filename)){ 
                        setErro("Extensão não suportada");
                        return false;
                    }
                    if ((filename != null) && (filename.equals(""))) {
                        // filename = (new File(filename)).getName();
                        File file = new File(filename);
                        item.write(file);
                        
                 
   
  
                    }
                }
            }
        } catch(FileUploadBase.SizeLimitExceededException slee){
            slee.printStackTrace();
            setErro("Tamanho excedido");
            return false;
        } catch (Exception ex) {
            setErro("Uma exceção ocorreu:"+ex.getMessage());      
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean isPermission(String fileName){
        String lowerCaseName = fileName.toLowerCase();
        StringTokenizer  st= new StringTokenizer(extensoesPermitidas,",");
        while(st.hasMoreTokens()){
            if(lowerCaseName.endsWith("."+st.nextToken())) return true;
        }
        return false;
    }
    

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public static int getKB() {
        return KB;
    }

    public static void setKB(int KB) {
        UploadBean.KB = KB;
    }

    public static int getMB() {
        return MB;
    }

    public static void setMB(int MB) {
        UploadBean.MB = MB;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getExtensoesPermitidas() {
        return extensoesPermitidas;
    }

    public void setExtensoesPermitidas(String extensoesPermitidas) {
        this.extensoesPermitidas = extensoesPermitidas;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
