/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import model.Email;
import view.JMaill;

/**
 *
 * @author Lucas
 */
public class Control {
    
    private Arquivo arq = new Arquivo();
    private Envio e;
    private Thread t;
    private JMaill aThis;
            
    public String[] readContatos(String path) throws IOException{
        Scanner sc = arq.readFile(path);
        String contato="";
        while(sc.hasNext()) contato+=sc.next();
        String [] emails = contato.split(";");
        System.out.println(emails.toString());
        return emails;
    }

    public String readBody(String path){
        Scanner sc = arq.readFile(path);
        String html="";
        while(sc.hasNext()) html+=sc.next()+" ";
        System.out.println(html); 
        return html;
    }
    
    public void Enviar(JMaill aThis){
        this.aThis = aThis;
        final Email email = aThis.email;
        Properties p = new Properties();  
        p.put("mail.smtp.host", email.getSmtp());
        p.put("mail.smtp.auth", "true");
        Authenticator auth = new Authenticator() {
                     @Override
                     public PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(email.getRemetente(),email.getSenha());
                     }
        };
        Session session = Session.getInstance(p, auth);  
        e = new Envio(session,aThis);
        t = new Thread(e);
        t.start();
        
    }
    
    public void Interromper(){
        t.stop();
        aThis.upLog("-- Envio cancelado --");
    }
    
    
}
