/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matrizserializada;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Main main = new Main();
        //main.gravarSer();
        ClasseSerializada lida = main.obterSer();
        lida.monstraClasse();
      }      

      public ClasseSerializada obterSer() {

        ObjectInputStream in;
        ClasseSerializada ser=null;
        try {
            in = new ObjectInputStream(new FileInputStream("ClasseSer.bin"));
            ser = (ClasseSerializada) in.readObject();
        } catch(IOException e){
            System.out.println(e);
        } catch(ClassNotFoundException f){
            System.out.println(f);
        }
        return ser;
    }

    public void gravarSer(){

        ClasseSerializada ser = new ClasseSerializada();
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ClasseSer.bin"));
            out.writeObject(ser);
            out.flush();
            out.close();
        } catch(IOException e){
            System.out.println(e);
        } 
    }

}
