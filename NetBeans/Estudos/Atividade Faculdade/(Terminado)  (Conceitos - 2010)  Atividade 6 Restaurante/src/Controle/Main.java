
package Controle;

import Visao.MesaGUI;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Seja Bem Vindo ao Sistema \"Restaurante do Lucas\"","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);
        MesaGUI m = new MesaGUI();
        m.setVisible(true);
    }

}
