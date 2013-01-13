

package controle;
import javax.swing.JOptionPane;
import interfaceGUI.FuncaoGUI;
import java.awt.Color;
public class Menu {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Seja bem vindo!","Saudações",JOptionPane.INFORMATION_MESSAGE);
        FuncaoGUI fgui = new FuncaoGUI();
        fgui.setLocationRelativeTo(null);
        fgui.getContentPane().setBackground(Color.DARK_GRAY);
        fgui.setVisible(true);
    }

}
