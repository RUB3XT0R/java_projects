


import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public final class AutomatoGUI extends JFrame {

    public Automato a;
    private Estado atual = new Estado("");
    boolean criarInicial; // flag para verificar se _ possivel criar um inicial, ou se j_ existe um
    //componentes gr_ficos
    private JPanel contentPane;
    private JTable tblTrans;
    private JComboBox cbAlfabeto;
    private JCheckBox isfinal;
    private JComboBox cbEstadosDestinos;
    private JCheckBox cbisFinal;
    private JButton btnExcluir;
    private JButton btnNovo;
    private JTable tblEstados;
    private JPanel panel_3;
    private JButton btnNova;
    private JButton btnRemover;
    private JPanel panel_4;
    private JLabel lblModeloDoAutomato;
    private JTextArea textArea;
    private JPanelVisualizacao painelView;
    private JLabel lblNewLabel;

    public AutomatoGUI() {
        this.a = new Automato();
        initComponents();
        refresh();
        //caso o automato n_o seja criado antes dessa tela, o variavel criarInicial d_ permissoa a cria__o de um estado inicial
        criarInicial = true;
    }

    public AutomatoGUI(Automato a) {
        this.a = a;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        refresh();
        //caso o automatoj_ venha pr_ estabelecido, n_o permite a cria__o de um estdo inicial
        criarInicial = false;
        refreshEstados();
    }

    protected void refreshEstados() {
        //adiciona os estados na visualiza__o
        painelView.removeAll();
        for (Estado e : a.getEstados()) {
            //um objeto painelestado _ criado, ele _ um circulo  que representa um estado, ao final, todos eles s_o colocados em um painelVisualiza__o
            JPanelEstado p = new JPanelEstado(e, this); //cria a visualiza__o gr_fica
            //colocam o visualizador no painel
            painelView.add(p);
            painelView.repaint();
        }
    }

    //atualiza os dados gerias do automato
    protected void refresh() {
        //modelo de combobox para os estados existentes
        DefaultComboBoxModel<Estado> modelcb = new DefaultComboBoxModel<>();
        //modelo para a tabela de estados
        Object[][] o = new Object[a.getEstados().size()][2];
        int i = 0; //variavel para indicar a posi__o da linha na matriz
        for (Estado e : a.getEstados()) {
            modelcb.addElement(e);
            // se for incinicial aparece ->, se for final aparece (F), se for ambos, (F)->
            o[i][0] = (e.isFinal() ? "(f)" : "") + "" + (e.equals(a.getInicial()) ? "->" : "");
            o[i][1] = e.getNome();
            i++;
        }
        cbEstadosDestinos.setModel(modelcb);
        tblEstados.setModel(new DefaultTableModel(o, new String[]{"", ""}));

        //modelo para combox de simbolos do alfabeto
        DefaultComboBoxModel modelsim = new DefaultComboBoxModel();
        modelsim.addElement('E');
        for (char c : a.getAlfabeto()) {
            modelsim.addElement(c);
        }
        cbAlfabeto.setModel(modelsim);

        //atualiza o modelo texto do automato
        textArea.setText(a.toString());
        //atualiza o modelo gr_fico do automato
        painelView.repaint();
    }

    //atualiza os dados das transi__es do estado selecionado
    protected void refreshTrans() {
        if (atual == null) {
            return;  //n_o executa se o estado atual for nulo
        }
        Object[][] o = new Object[atual.transicoes.size()][2];
        int i = 0;
        for (char c : atual.getTransicoes().keySet()) {
            o[i][0] = c;
            o[i][1] = atual.getTransicoes().get(c);
            i++;
        }
        tblTrans.setModel(new DefaultTableModel(o, new String[]{"Simbolo", "Estado(s) Destino(s)"}));
        //atualiza o modelo texto do automato
        textArea.setText(a.toString());
        //atualiza o modelo gr_fico do automato
        painelView.repaint();
    }

    //chamado no evento do bot_o novo
    private void novoEstado() {
        Estado novo = new Estado(isfinal.isSelected(), ("q" + a.getEstados().size()));
        a.getEstados().add(novo);
        if (criarInicial) {  //seta como inicial se for inicial
            a.setInicial(novo.getNome());
            criarInicial = false; //n_o deixa mais criar estados iniciais
        }
        JPanelEstado p = new JPanelEstado(novo, this); //cria a visualiza__o gr_fica
        //colocam o visualizador no painel
        painelView.add(p);
        painelView.repaint();
        refresh();
    }

    public void selecionaEstadoAtual(Estado e) {
        if (e == null) {
            return; //n_o executa se o novo estado for nulo
        }
        atual = e; //atualiza o estado atual
        lblNewLabel.setText("Detalhes de : " + atual.getNome()); //atualiza o seu nome
        cbisFinal.setSelected(atual.isFinal()); //atualiza se _ inicial
        refreshTrans();
    }

    public Estado getEstadoAtual() {
        return atual;
    }

    private void turnFinal() {
        if (atual == null) {
            return;  //n_o executa se o estado atual for nulo
        }
        atual.setFinal(cbisFinal.isSelected()); //torna final o estado atual
        refresh();
    }

    private void excluirEstado() {
        if (a.getInicial().equals(atual)) {
            return; //n_o deixa excluir se for inicial
        }
        a.deletarEstado(atual.getNome());  //deleta estado atual
        refreshEstados();
        refresh();
        refreshTrans();
    }

    private void novaTransicao() {
        if (atual == null) {
            return;  //n_o executa se o estado atual for nulo
        }
        Character c = (Character) cbAlfabeto.getSelectedItem(); //pega o simbolo a ser usado
        String estadoDestino = ((Estado) cbEstadosDestinos.getSelectedItem()).getNome(); //pega o nome do estado a ser usado
        if(a.newTransicao(atual.getNome(), c + "", estadoDestino)){ //cria a nova transi__o
            refresh();
            refreshTrans();
        }
    }

    private void removerTransicao() {
        if (atual == null) {
            return;  //n_o executa se o estado atual for nulo
        }
        if (tblTrans.getSelectedRow() == -1) {
            return; //se n_o houve uma sele__o efetiva, n_o executa
        }		// deleta a transi__o
        atual.getTransicoes().remove((Character) atual.getTransicoes().keySet().toArray()[tblTrans.getSelectedRow()]);
        // pega o simbolo-chave do array de chaves conforme o indice da linha selecionada da tabela

        refreshTrans();
    }

    private void minimizarAutomato() {
        a.minimizar(); //minimiza
        //atualiza a tela
        atual = a.getInicial();
        refreshEstados();
        refresh();
        refreshTrans();
    }

    public void initComponents() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 902, 597);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel_4 = new JPanel();
        panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Geral", TitledBorder.LEFT, TitledBorder.TOP, null, null));
        panel_4.setBounds(10, 11, 426, 236);
        contentPane.add(panel_4);
        panel_4.setLayout(null);

        lblModeloDoAutomato = new JLabel("Defini\u00E7\u00E3o do Automato:");
        lblModeloDoAutomato.setBounds(10, 47, 125, 14);
        panel_4.add(lblModeloDoAutomato);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane_2.setBounds(10, 72, 406, 124);
        panel_4.add(scrollPane_2);

        textArea = new JTextArea();
        textArea.setColumns(100);
        scrollPane_2.setColumnHeaderView(textArea);
        textArea.setAutoscrolls(true);
        textArea.setRows(9);

        JButton btnMinimizar = new JButton("Minimizar");
        btnMinimizar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                minimizarAutomato();
            }
        });
        btnMinimizar.setBounds(10, 207, 104, 23);
        panel_4.add(btnMinimizar);

        JPanel panel = new JPanel();
        panel.setBounds(10, 15, 250, 25);
        panel_4.add(panel);
        panel.setBorder(null);
        panel.setLayout(null);

        JLabel lblNome = new JLabel("Criar estado:");
        lblNome.setBounds(10, 5, 82, 14);
        panel.add(lblNome);
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);

        isfinal = new JCheckBox("Final");
        isfinal.setBounds(98, 1, 56, 23);
        panel.add(isfinal);

        btnNovo = new JButton("Novo");
        btnNovo.setBounds(160, 1, 73, 23);
        panel.add(btnNovo);
        btnNovo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novoEstado();
            }
        });

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Visualiza\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_5.setBounds(10, 258, 1310, 390);
        contentPane.add(panel_5);
        panel_5.setLayout(null);

        painelView = new JPanelVisualizacao(this);
        painelView.setBounds(10, 22, 1290, 357);
        panel_5.add(painelView);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(558, 11, 314, 251);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        lblNewLabel = new JLabel("Detalhes de ");
        lblNewLabel.setBounds(10, 11, 152, 14);
        panel_2.add(lblNewLabel);

        cbisFinal = new JCheckBox("Final");
        cbisFinal.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                turnFinal();
            }
        });
        cbisFinal.setBounds(168, 7, 60, 23);
        panel_2.add(cbisFinal);

        btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluirEstado();
            }
        });
        btnExcluir.setBounds(231, 7, 73, 23);
        panel_2.add(btnExcluir);

        panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Transi\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(10, 36, 294, 204);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblSimbolo = new JLabel("Simbolo:");
        lblSimbolo.setBounds(10, 29, 96, 14);
        panel_3.add(lblSimbolo);

        cbAlfabeto = new JComboBox();
        cbAlfabeto.setBounds(122, 26, 49, 20);
        panel_3.add(cbAlfabeto);

        JLabel lblEstadosDestinos = new JLabel("Estados Destinos:");
        lblEstadosDestinos.setBounds(10, 57, 96, 14);
        panel_3.add(lblEstadosDestinos);

        cbEstadosDestinos = new JComboBox();
        cbEstadosDestinos.setBounds(122, 54, 49, 20);
        panel_3.add(cbEstadosDestinos);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 82, 274, 111);
        panel_3.add(scrollPane_1);

        tblTrans = new JTable();
        scrollPane_1.setViewportView(tblTrans);

        btnNova = new JButton("Nova");
        btnNova.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novaTransicao();
            }
        });
        btnNova.setBounds(181, 25, 89, 23);
        panel_3.add(btnNova);

        btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                removerTransicao();
            }
        });
        btnRemover.setBounds(181, 53, 89, 23);
        panel_3.add(btnRemover);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Estados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBounds(446, 11, 102, 236);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 26, 82, 199);
        panel_1.add(scrollPane);

        tblEstados = new JTable();
        scrollPane.setViewportView(tblEstados);
        tblEstados.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                selecionaEstadoAtual(a.getEstados().get(tblEstados.getSelectedRow()));
            }
        });
        tblEstados.setAutoscrolls(true);
        tblEstados.add(new Scrollbar());
    }
}
