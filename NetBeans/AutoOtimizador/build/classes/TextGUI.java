

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextArea;
import java.awt.Font;

public class TextGUI extends JFrame {

    Automato a = new Automato();
    private AutomatoGUI aa;
    // Componentes Gr_ficos
    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtEstados;
    private JTextField txtAlfabeto;
    private JTextField txtEstadosFinais;
    private JTextField txtEstadoInicial;
    private JTextArea txtTransicoes;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    TextGUI frame = new TextGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TextGUI() {
        setTitle("Novo Automato - Modo Texto");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 524, 290);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEstados = new JLabel("Estados:");
        lblEstados.setBounds(10, 34, 96, 14);
        contentPane.add(lblEstados);

        JLabel lblAlfabeto = new JLabel("Alfabeto:");
        lblAlfabeto.setBounds(10, 62, 96, 14);
        contentPane.add(lblAlfabeto);

        JLabel lblTransies = new JLabel("Transi\u00E7\u00F5es:");
        lblTransies.setBounds(10, 148, 96, 14);
        contentPane.add(lblTransies);

        JLabel lblEstadosFinais = new JLabel("Estados Finais:");
        lblEstadosFinais.setBounds(10, 92, 96, 14);
        contentPane.add(lblEstadosFinais);

        JLabel lblEstadosIniciais = new JLabel("Estado Inicial:");
        lblEstadosIniciais.setBounds(10, 123, 96, 14);
        contentPane.add(lblEstadosIniciais);

        JLabel lblNomeDoAutomato = new JLabel("Nome do Automato:");
        lblNomeDoAutomato.setBounds(10, 10, 129, 14);
        contentPane.add(lblNomeDoAutomato);

        txtNome = new JTextField();

        txtNome.setBounds(141, 7, 36, 20);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        txtEstados = new JTextField();
        txtEstados.setColumns(10);
        txtEstados.setBounds(116, 31, 209, 20);
        contentPane.add(txtEstados);

        JLabel lblSeparadosPorVirgula = new JLabel("Separados por virgula");
        lblSeparadosPorVirgula.setBounds(334, 35, 164, 14);
        contentPane.add(lblSeparadosPorVirgula);

        txtAlfabeto = new JTextField();
        txtAlfabeto.setColumns(10);
        txtAlfabeto.setBounds(116, 59, 209, 20);
        contentPane.add(txtAlfabeto);

        JLabel label = new JLabel("Separados por virgula");
        label.setBounds(334, 62, 164, 14);
        contentPane.add(label);

        txtEstadosFinais = new JTextField();
        txtEstadosFinais.setColumns(10);
        txtEstadosFinais.setBounds(116, 89, 209, 20);
        contentPane.add(txtEstadosFinais);

        JLabel label_1 = new JLabel("Separados por virgula");
        label_1.setBounds(334, 92, 164, 14);
        contentPane.add(label_1);

        txtEstadoInicial = new JTextField();
        txtEstadoInicial.setColumns(10);
        txtEstadoInicial.setBounds(116, 120, 30, 20);
        contentPane.add(txtEstadoInicial);

        JLabel lblModeloestadosimboloestado = new JLabel("Modelo: (estado,simbolo)=estado ; ou (estado,simbolo)={estado1,estado2,...}  ;");
        lblModeloestadosimboloestado.setBounds(65, 194, 399, 14);
        contentPane.add(lblModeloestadosimboloestado);

        JButton btnCriarAutomato = new JButton("Criar Automato");
        btnCriarAutomato.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!validar()) {
                    return;
                }
                capturarDados();
                if (aa != null) {
                    if (aa.isVisible()) {
                        aa.dispose();
                    }
                }
                aa = new AutomatoGUI(a);
                aa.setVisible(true);
            }
        });
        btnCriarAutomato.setBounds(369, 225, 129, 23);
        contentPane.add(btnCriarAutomato);

        txtTransicoes = new JTextArea();
        txtTransicoes.setFont(new Font("Arial", Font.PLAIN, 11));
        txtTransicoes.setColumns(1);
        txtTransicoes.setRows(5);
        txtTransicoes.setBounds(10, 163, 488, 20);
        contentPane.add(txtTransicoes);

        //teste inicial
        txtNome.setText("M2");
        txtEstados.setText("q0,q1,q2,q3,q4");
        txtEstadosFinais.setText("q2,q3");
        txtAlfabeto.setText("a,b,c");
        txtEstadoInicial.setText("q0");
        txtTransicoes.setText("(q0,a)=q1 ; (q0,b)=q2 ; (q0,E)={q2,q3} ; (q2,c)={q3,q1} ; (q3,a)=q4;");
    }

    private boolean validar() {
        if ("".equals(txtNome.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com o Nome do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(txtEstados.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com os Estados do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(txtAlfabeto.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com o Alfabeto do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(txtEstadosFinais.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com os Estados Finais do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(txtEstadoInicial.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com o Estado inicial do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(txtTransicoes.getText())) {
            JOptionPane.showMessageDialog(null, "Entre com as transi__es do Automato:", "Aten__o!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }

    private void capturarDados() {
        //cria__o do nome
        a.setNome(txtNome.getText());

        //cria__o do alfabeto
        char[] alfabeto = txtAlfabeto.getText().replaceAll(",", "").toCharArray();
        a.setAlfabeto(alfabeto);

        //cria__o dos estados
        String[] estados = txtEstados.getText().split(",");
        for (String s : estados) {
            a.addEstado(s);
        }

        //setando estados finais
        estados = txtEstadosFinais.getText().split(",");
        for (String s : estados) {
            a.turnFinal(s);
        }

        //setando estado inicial
        Matcher m = Pattern.compile("q[0-9]").matcher(txtEstadoInicial.getText());
        while (m.find()) {
            a.setInicial(m.group());
        }


        //setando transi__es
        String transicoes = txtTransicoes.getText();
        String patt = "\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?"; //captura: (q0,b) = q2 ou (q0,E) = {q2,q3}
        m = Pattern.compile(patt).matcher(transicoes);
        String estadoOrigem = "", simbolo = "", transicao = "";
        String[] estadosDestinos = estados;
        Matcher subm;
        while (m.find()) {
            transicao = m.group(); //(qu,a)={qv,qn,qm,...}
            subm = Pattern.compile("\\(q[0-9],").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadoOrigem = subm.group().replaceAll("\\(|,", "");
            }
            subm = Pattern.compile("([a-z]|E)\\)").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                simbolo = subm.group().replaceAll("\\)", "");
            }
            subm = Pattern.compile("=\\{?(q[0-9]|,){1,}\\}?").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadosDestinos = subm.group().replaceAll("\\)|=|\\{|\\}", "").split(",");
            }
            a.newTransicao(estadoOrigem, simbolo, estadosDestinos);
        }


        System.out.println(a);
    }
}
