package autootimizadorv3;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Teste extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    Teste frame = new Teste();
                    frame.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    private void importar() {
        JFileChooser arquivo = new JFileChooser();
        arquivo.showOpenDialog(null);
        String path = arquivo.getSelectedFile().getAbsolutePath();
        Scanner sc = new Arquivo().readFile(path);
        String automato = "";
        while (sc.hasNext()) {
            automato += sc.next();
        }
        String iscompleta = "[m|M][1-9]=\\(\\{(q[0-9]*|,)*\\},"
                + "\\{([a-z]|,)*\\},"
                + "\\{(\\(q[0-9]*,([a-z]|E)\\)=\\{?(q[0-9]*|,){1,}\\}?|\\s;\\s|;)*\\}," + //{(q0,a) = q1 ; (q0,b) = q2 ; (q0,E) = {q2,q3} },
                "\\{(q[0-9]*)*\\},"
                + "\\{(q[0-9]*|,)*\\}\\)";
        if (!automato.matches(iscompleta)) {
            JOptionPane.showMessageDialog(null,
                    "Automato de entrada não confere com o padrão.\nDeve seguir o modelo:\n "
                    + "M1=(Estados,Alfabeto,Transições,Estado Inicial,Estados Finais)\n "
                    + "M1=({q0,q1,q2,q3,...},\n"
                    + "{a,b,...},\n"
                    + "{(q0,a)=q1 ; (q0,E)={q2,q3,...} ...},\n"
                    + "{q0},\n"
                    + "{q2,...})\n(Tudo junto, sem quebras de linha.)",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Automato: " + automato);
        new AutomatoGUI(new Automato(automato)).setVisible(true);
    }

    /**
     * Create the frame.
     */
    public Teste() {
        setTitle("Optimizador de Automatos - Vers\u00E3o 3.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 601, 471);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnArquivo = new JMenu("Arquivo");
        menuBar.add(mnArquivo);

        //JMenuItem mntmNovomodoGrfico = new JMenuItem("Novo (Modo Gr\u00E1fico)");
        //mntmNovomodoGrfico.addActionListener(new ActionListener() {
        //  @Override
        //public void actionPerformed(ActionEvent arg0) {
        //  new AutomatoGUI().setVisible(true);
        //}
        //});
        //mnArquivo.add(mntmNovomodoGrfico);

        JMenuItem mntmNovomodoTexto = new JMenuItem("Novo (Modo Texto)");
        mntmNovomodoTexto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                new TextGUI().setVisible(true);
            }
        });
        mnArquivo.add(mntmNovomodoTexto);

        JSeparator separator = new JSeparator();
        mnArquivo.add(separator);

        JMenuItem mntmImportarArquivo = new JMenuItem("Importar Arquivo");
        mntmImportarArquivo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                importar();
            }
        });
        mnArquivo.add(mntmImportarArquivo);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(100, 149, 237));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
}
