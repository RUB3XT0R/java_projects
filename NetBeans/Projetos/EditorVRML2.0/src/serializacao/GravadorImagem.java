package serializacao;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import modelo.FiguraGeometrica;
import modelo.Imagem;

public class GravadorImagem {

    ArquivoReader a = new ArquivoReader();

    public void gravarVRML(Imagem i) {
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome do arquivo imagem a ser gravado.");
        try (
                FileWriter writer = new FileWriter(nome + ".wrl", false);
                PrintWriter saida = new PrintWriter(writer);) {
            saida.println("#VRML V2.0 utf8 ");
            saida.println("Group{ ");
            saida.println(" children [");
            for (FiguraGeometrica f : i.getFiguras().values()) 
                 saida.println("    "+f.MakeVRML());
            saida.println(" ]}");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void gravarImagem(Imagem i) {
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome do arquivo imagem a ser gravado.");
        a.gravarSer(i, nome);
    }

    public Imagem lerImagem() {
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome do arquivo imagem a ser aberto.");
        return a.obterSer(nome);
    }
}
