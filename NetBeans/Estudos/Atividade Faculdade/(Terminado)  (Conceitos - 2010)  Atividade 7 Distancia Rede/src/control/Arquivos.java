
package control;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Nodo;

public class Arquivos {

    private static String lerArquivo(String nome) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader leitura = new FileReader(nome);
            int c;
            do {
                c = leitura.read();
                if (c != -1) sb.append((char) c);
            } while (c != -1);
            leitura.close();
            return sb.toString();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "O arquivo ainda não foi criado."
                    + "\nPara criar-lo basta inserir os manipular os dados "
                    + "normalmente, que ele será criado automaticamente.",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
    public static void gravarArquivo(List<Nodo> lt,String nomeArquivo){
        String sb ="";
        try{
        FileWriter escreve = new FileWriter(nomeArquivo);
        for(Nodo aux : lt)
            sb+=aux.toString()+";";
        escreve.write(sb);
        escreve.flush();
        escreve.close();
        JOptionPane.showMessageDialog(null,
                "Salvo com sucesso o arquivo : \""+nomeArquivo+"\"",
                "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException e)
            {e.printStackTrace();}
    }

    public static List<Nodo> criarLista(String arquivo){
        return criarLista1(arquivo);
    }
    public static List<Nodo> criarLista1(String arquivo) {
         try {
            int x, y;
            List<Nodo> lt = new LinkedList<Nodo>();
            StringTokenizer st = new StringTokenizer(lerArquivo(arquivo), ";");
            while (st.hasMoreTokens()) {
                 String tk = st.nextToken();
                 tk=tk.replace("(","");
                 tk=tk.replace(")","");
                 x=Integer.parseInt(tk.split(",")[0]);
                 y=Integer.parseInt(tk.split(",")[1]);
                 lt.add(new Nodo(x, y));
            }
            return lt;
        }catch(NullPointerException e){return new LinkedList<Nodo>();}
    }

    //não funciona...averiguar depois
    public static List<Nodo> criarLista2(String arquivo) {
         try {
            int x, y;
            List<Nodo> lt = new LinkedList<Nodo>();
            String[] pontos = arquivo.split(";");
            for (String ponto : pontos) {
                 Pattern p = Pattern.compile("\\("
                         + "([0-9]+)"
                         + ","
                         + "([0-9]+)"
                         + "\\)");
                 Matcher m = p.matcher(ponto);
                 if (m.find()) {
                     x = Integer.parseInt(m.group(1));
                     y = Integer.parseInt(m.group(2));
                     lt.add(new Nodo(x, y));
                 }
             }
             return lt;
        }catch(NullPointerException e){return new LinkedList<Nodo>();}
    }
}

