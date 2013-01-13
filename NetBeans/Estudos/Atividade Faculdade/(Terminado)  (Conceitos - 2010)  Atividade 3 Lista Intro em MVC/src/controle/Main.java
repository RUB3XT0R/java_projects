
package controle;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Menu mn = new Menu();
        mn.setExtendedState(Menu.MAXIMIZED_BOTH);
        mn.getContentPane().setBackground(Color.darkGray);
        mn.setVisible(true);
    }

}
