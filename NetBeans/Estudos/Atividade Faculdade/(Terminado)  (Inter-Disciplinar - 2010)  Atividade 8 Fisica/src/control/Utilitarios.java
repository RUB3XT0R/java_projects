package control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Utilitarios {


    public static boolean isFull(JTextField... a) {
        for (JTextField i : a) {
            if (i.getText().equals("") || i.getText() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos de:"
                        + "\nComprimento de A;"
                        + "\nVariações de S;"
                        + "\nCargas do Sistema.", "Atenção!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public static boolean isValidoIntervalo(JTextField a, JTextField b) {
        try {
            if (Double.parseDouble(a.getText()) >= Double.parseDouble(b.getText())) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isNotZeroOrLess(JTextField... a) {
        for (JTextField i : a) {
            try {
                if (Double.parseDouble(i.getText()) <= 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumberFields(JTextField... a) {
        for (JTextField i : a) {
            try {
                double n = Double.parseDouble(i.getText());
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void clearFields(JTextField... a) {
        for (JTextField i : a)
          i.setText("");
    }

}
