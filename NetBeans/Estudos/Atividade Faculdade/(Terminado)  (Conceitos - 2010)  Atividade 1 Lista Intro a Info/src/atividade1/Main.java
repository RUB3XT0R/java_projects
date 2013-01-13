
package atividade1;

/****************************************
 * Nome: atividade1.java data:18/02/2010
 * Autor: Lucas Biason
 * Descrição: aplicativo contendo 17
 * exercícios.
 ****************************************/

import java.awt.Color;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Geral g=new Geral();
      g.setExtendedState(Geral.MAXIMIZED_BOTH);
      g.getContentPane().setBackground(Color.GRAY);
      g.setVisible(true);
        JOptionPane.showMessageDialog(null,"Seja bem Vindo!\n"+
                                         "Para navegar pelos exercícios\n"+
                                         "utilize o menu Programas\n","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);
      

    }
}
