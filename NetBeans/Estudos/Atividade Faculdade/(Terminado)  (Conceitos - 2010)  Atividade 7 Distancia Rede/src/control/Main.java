
package control;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import model.Nodo;
import view.PlanoGUI;

public class Main {


    public static void main(String[] args) {
        PlanoGUI p = new PlanoGUI();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        
        //DecimalFormat  df = new DecimalFormat("#0.00");
        //List<Nodo> lt = new LinkedList<Nodo>();
        //lt.add(new Nodo(1,2));
        //lt.add(new Nodo(2,5));
        //lt.add(new Nodo(2,4));
        //lt.add(new Nodo(4,5));
        //lt.add(new Nodo(5,6));
        //lt.add(new Nodo(5,7));
        //System.out.println(df.format(Calculos.distancias(lt)));
        //List<Nodo> la = Arquivos.criarLista("src/base/Entrada.txt");
        //for(Nodo aux : la){
          //  System.out.println("Ponto: "+ aux.toString());
        //}
        //Arquivos.gravarArquivo(lt,"src/base/Teste.txt");
    }
}
