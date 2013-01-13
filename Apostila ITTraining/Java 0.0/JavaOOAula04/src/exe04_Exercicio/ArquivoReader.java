package exe04_Exercicio;

import java.io.*;

public class ArquivoReader {
		
	public Agenda obterSer(String nome) {

        ObjectInputStream in;
        Agenda agenda = new Agenda();
        try {
            in = new ObjectInputStream(new FileInputStream(nome+".agenda"));
            agenda = (Agenda) in.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch(IOException e){
            gravarSer(new Agenda(),nome);
        }
        return agenda;
    }

    public void gravarSer(Agenda c,String arquivo){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo+".agenda"));
            out.writeObject(c);
            out.flush();
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
