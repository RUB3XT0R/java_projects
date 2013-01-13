/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Email;
import view.JMaill;

/**
 *
 * @author Lucas
 */
public class Envio implements Runnable{
    MimeMessage msg;
    Email email;
    JMaill aThis;
    Session session;
    
    
    public Envio(Session session,JMaill aThis) {
        this.email = aThis.email;
        this.aThis = aThis;
        this.session = session;
    }
    
    @Override
    public void run(){
        
        Arquivo arq = new Arquivo();
        arq.openFile("log.txt");
        for(String contato : email.getContatos()){
            if(!contato.matches("[A-Z|a-z|0-9|_|-|.]+@([A-Z|a-z|0-9|_|-]+)(\\.[A-Z|a-z|0-9|_|-]+){1,}")){
              aThis.upLog("- "+contato+" Inválido ");
              arq.getOutput().format("- "+contato+" Inválido \n");
              continue;
            }
            try {
                msg = new MimeMessage(session); 
                msg.setFrom(new InternetAddress(email.getRemetente(),email.getNomeRemetente()));
                msg.setSubject(email.getAssunto());
                msg.setContent(email.getHtml(), "text/html");
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(contato));
                Transport.send(msg);
                aThis.upLog( "Mail to: "+contato+" em "+ new Date() );
                arq.getOutput().format("Mail to: "+contato+" em "+ new Date()+"\n");
            }catch(Exception ex){
                arq.getOutput().format("Fail to send: "+contato+" : "+ ex +"\n");
                aThis.upLog( "Fail to send: "+contato+" : "+ ex.getMessage() + ", "+ ex.getCause());
            }
            try {
                Thread.sleep(email.getAtraso()*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Envio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
           
        aThis.upLog("-- Término do envio -- Ao todo "+email.getContatos().length+" contatos enviados" );
        arq.getOutput().format("-- Término do envio -- Ao todo "+email.getContatos().length+" contatos enviados\n");
        arq.closeFile();
        try {
            msg = new MimeMessage(session); 
            msg.setFrom(new InternetAddress(email.getRemetente(),email.getNomeRemetente()));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getUtilizador()));
            msg.setSubject("Término de Envio");
            msg.setContent("<html><head><meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1' /></head>"
                    + "<body><p>Disparo terminado ás " + new Date().toString() + "</p>"+
                        "<p>Nº de contatos:</p>" + email.getContatos().length +
                        "<p>Visualização do email:</p>" + email.getHtml()
                , "text/html");
            Transport.send(msg);
        } catch (IOException | MessagingException ex) {
            Logger.getLogger(Envio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
