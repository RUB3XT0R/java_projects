package serializacao;

import java.io.*;
import modelo.Imagem;

public class ArquivoReader {

    public Imagem obterSer(String nome) {
        Imagem img = new Imagem();
        try (ObjectInputStream in =  new ObjectInputStream(new FileInputStream(nome + ".imagem"));) {
            img = (Imagem) in.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            gravarSer(new Imagem(), nome);
        }
        return img;
    }

    public void gravarSer(Imagem c, String arquivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo + ".imagem"));) {
            out.writeObject(c);
            out.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
