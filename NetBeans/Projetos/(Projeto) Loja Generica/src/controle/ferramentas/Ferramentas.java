
package controle.ferramentas;

import java.awt.Color;
import java.util.List;
import javax.swing.*;

public class Ferramentas {

    public static boolean isCompleteFields(JTextField... textBoxes) {
        if(textBoxes == null || textBoxes.length == 0) return false;
        changeColorTextFields(Color.gray,textBoxes);
        for (JTextField atual : textBoxes) {
            if (atual.getText().equals("")) {
                showErro("Um ou mais dos campos obrigatórios não foram preenchidos.","Erro!");
                changeColorTextFields(Color.ORANGE,atual);
                return false;
            }
        }
        return true;
    }

    public static void changeColorTextFields(Color cor, JTextField... textBoxes){
        if(textBoxes == null || textBoxes.length == 0 || cor == null) return;
        for (JTextField atual : textBoxes)
            atual.setBackground(cor);
    }

    public static void limparCampos(JTextField... textBoxes){
        if(textBoxes == null || textBoxes.length == 0) return;
        for (JTextField atual : textBoxes)
            atual.setText(null);
    }

    public static void habilitarCampos(boolean h, JTextField...o){
        if(o == null || o.length == 0) return;
        for (JTextField atual : o){
            atual.setEditable(h);
            atual.setForeground(Color.BLACK);
        }
    }

    public static <T extends javax.swing.JComponent> void habilitarComponentes(boolean h, T...o){
        if(o == null || o.length == 0) return;
        for (T atual : o)
            atual.setEnabled(h);
    }

    public static <T extends java.awt.Component> void camposVisiveis(boolean h, T... o){
        if(o == null || o.length == 0) return;
        for (T atual : o)
            atual.setVisible(h);
    }

    public static void changeStatus(String status,JLabel mostrador,Color... corLetra){
        mostrador.setText(status);
        if(corLetra!=null && corLetra.length >0)
            mostrador.setForeground(corLetra[0]);
    }

    public static <T> void montaComboBox(JComboBox combobox, List<T> conteudo){
        if(conteudo == null || conteudo.isEmpty()) return;
        combobox.removeAllItems();
        for (T c : conteudo) combobox.addItem(c);
    }

    public static <T> void montaJList(JList lista, List<T> conteudo){
        if(conteudo == null || conteudo.isEmpty()) return;
        DefaultListModel dlm = new DefaultListModel();
        for (T c : conteudo)
            dlm.addElement(c);
        lista.setModel(dlm);
    }

    public static <T> void montaJTable(JTable tabela, List<T> conteudo,Class tipo){
        tabela.setModel(new MyTableModel(tipo,conteudo,tabela));
    }
    
    public static void showMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showErro(String erro, String titulo){
        JOptionPane.showMessageDialog(null,erro,titulo,JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean showPergunta(String pergunta, String titulo){
        return JOptionPane.showConfirmDialog(null,pergunta,titulo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION;
    }
}
