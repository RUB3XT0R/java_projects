package exe03_Stream;

import java.io.*;

public class ArquivoReader {
		
	public Contato obterSer(String nome) {

        ObjectInputStream in;
        Contato contato = new Contato();
        try {
            in = new ObjectInputStream(new FileInputStream(nome+".isdrufis"));
            contato = (Contato) in.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch(IOException e){
            gravarSer(new Contato(),nome);
        }
        return contato;
    }

    public void gravarSer(Contato c,String arquivo){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo+".isdrufis"));
            out.writeObject(c);
            out.flush();
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}