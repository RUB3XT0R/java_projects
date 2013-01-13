package view.cadastro;

import controle.Dao.FornecedorDao;
import controle.Dao.ProdutoDao;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controle.ferramentas.Ferramentas;
import controle.tipos.OperacaoTipo;
import java.awt.Color;
import modelo.Fornecedor;
import modelo.Produto;

public class ProdutosGUI extends javax.swing.JFrame {

    private ListSelectionModel lsc;
    private List<Produto> ltc;
    private ProdutoDao dao = new ProdutoDao();
    private OperacaoTipo op;
    private FornecedorDao daoFornecedor = new FornecedorDao();
    private List<Fornecedor> ltf;

    public ProdutosGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        pesquisar();
        habilitarCampos(false);
        op = OperacaoTipo.inativo;
        Ferramentas.changeStatus("Carregado", lblstatus,Color.white);
    }

    private void pesquisar() {
        try {
            ltc = dao.getProduto(txtpesquisa.getText());
            Ferramentas.montaJTable(jTable1, ltc, Produto.class);
            atualizaFornecedores();
        } catch (SQLException ex) {
            ltf = new LinkedList();
            ltc = new LinkedList();
            Ferramentas.showErro("Erro ocorido ao pesquisar.","Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        }
    }

    private void atualizaFornecedores() throws SQLException{
        ltf = daoFornecedor.getAllFornecedores();
        Ferramentas.montaComboBox(cbfornecedor,ltf);
    }

    private void limparCampos() {
        Ferramentas.limparCampos(txtdescricao,txtid, txtprecoinicial,txtprecoinicial, txtqtde, txtpreco);
        cbfornecedor.setSelectedIndex(-1);
        putImage("");
    }

    private void habilitarCampos(boolean h) {
        Ferramentas.habilitarCampos(h,txtdescricao,txtid,txtprecoinicial,txtprecoinicial,txtqtde, txtpreco, txtimagem);
        Ferramentas.habilitarComponentes(h, cbfornecedor);
    }

    private void getSelecionados(JTable t) {
        if (jTable1.getSelectedRow() == -1) {
            limparCampos();
            return;
        }
        txtid.setText(String.valueOf(ltc.get(t.getSelectedRow()).getId()));
        txtdescricao.setText(ltc.get(t.getSelectedRow()).getNome());
        txtprecoinicial.setText(String.valueOf(ltc.get(t.getSelectedRow()).getPreco_inicial()));
        txtpreco.setText(String.valueOf(ltc.get(t.getSelectedRow()).getPreco_venda()));
        txtqtde.setText(String.valueOf(ltc.get(t.getSelectedRow()).getQtdeEstoque()));
        cbfornecedor.setSelectedItem(ltc.get(t.getSelectedRow()).getFornecedor());

        txtimagem.setText(ltc.get(t.getSelectedRow()).getFoto());
        putImage(txtimagem.getText());

        op = OperacaoTipo.inativo;
    }

    private void putImage(String foto) {
        imgfoto.setIcon(new ImageIcon(getClass().getResource("")));
        try {
            imgfoto.setIcon(new ImageIcon(getClass().getResource(foto)));
        } catch (NullPointerException e) {
            imgfoto.setIcon(new ImageIcon(getClass().getResource("")));
        } finally {
            imgfoto.setBounds(imgfoto.getX(), imgfoto.getX(), 189, 176);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnclose = new javax.swing.JLabel();
        btnmin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        txtprecoinicial = new javax.swing.JTextField();
        txtqtde = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtimagem = new javax.swing.JTextField();
        cbfornecedor = new javax.swing.JComboBox();
        btnnewFornecedor = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnnewFornecedor1 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        btncancel = new javax.swing.JLabel();
        btnok = new javax.swing.JLabel();
        btnalterar = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JLabel();
        btnnovo = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        imgfoto = new javax.swing.JLabel();

        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(567, 467));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cadastro e Consulta - Produtos");

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/close.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });

        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/minimizar.png"))); // NOI18N
        btnmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Status:");

        lblstatus.setBackground(new java.awt.Color(255, 153, 0));
        lblstatus.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnmin)
                        .addComponent(btnclose))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Digite uma descrição:");

        txtpesquisa.setBackground(new java.awt.Color(204, 204, 204));

        btnpesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnpesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/pesquisar.png"))); // NOI18N
        btnpesquisa.setText("Pesquisar");
        btnpesquisa.setFocusable(false);
        btnpesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesquisaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnpesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsc = jTable1.getSelectionModel();
        lsc.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting())getSelecionados(jTable1);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(540, 153));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Qtde em Estoque:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Descrição:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Preço Inicial:       R$");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fornecedor:");

        txtdescricao.setBackground(new java.awt.Color(204, 204, 204));

        txtprecoinicial.setBackground(new java.awt.Color(204, 204, 204));

        txtqtde.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Preço de Venda: R$");

        txtpreco.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Imagem:");

        txtimagem.setBackground(new java.awt.Color(204, 204, 204));

        btnnewFornecedor.setText("Novo");
        btnnewFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewFornecedorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Id:");

        txtid.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        btnnewFornecedor1.setText("Atualizar");
        btnnewFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewFornecedor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpreco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprecoinicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtqtde, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtimagem))))
                            .addComponent(txtdescricao)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(12, 12, 12)
                        .addComponent(cbfornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnewFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnewFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtprecoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtqtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtimagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnnewFornecedor1)
                        .addComponent(btnnewFornecedor)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/cancelar.png"))); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.setToolTipText("");
        btncancel.setFocusable(false);
        btncancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/ok.png"))); // NOI18N
        btnok.setText("OK");
        btnok.setToolTipText("");
        btnok.setFocusable(false);
        btnok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnokMouseClicked(evt);
            }
        });

        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.setToolTipText("");
        btnalterar.setFocusable(false);
        btnalterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalterarMouseClicked(evt);
            }
        });

        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setToolTipText("");
        btnexcluir.setFocusable(false);
        btnexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluirMouseClicked(evt);
            }
        });

        btnnovo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.setToolTipText("");
        btnnovo.setFocusable(false);
        btnnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
        });

        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/home.png"))); // NOI18N
        btnhome.setText("Voltar");
        btnhome.setToolTipText("");
        btnhome.setFocusable(false);
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnhome)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnnovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnalterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnok)
                    .addComponent(btncancel)
                    .addComponent(btnhome))
                .addContainerGap())
        );

        imgfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgfoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        this.setVisible(false);
}//GEN-LAST:event_btncloseMouseClicked

    private void btnminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseClicked
        //minimizar
        setExtendedState(ICONIFIED);
}//GEN-LAST:event_btnminMouseClicked

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked
        //NOVO
        limparCampos();
        habilitarCampos(true);
        op = OperacaoTipo.novo;
        txtdescricao.requestFocus();
        Ferramentas.changeStatus("Adicionando novo",lblstatus,Color.blue);
}//GEN-LAST:event_btnnovoMouseClicked

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
        //EXCLUIR
        if (jTable1.getSelectedRow() == -1) {
            Ferramentas.showMensagem("Selecione um registro a ser excluido na lista.", "Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        } else if (Ferramentas.showPergunta("Deseja Realmente excluir esse registro?", "Atenção!!")) {
            try {
                dao.removeProduto((int) (ltc.get(jTable1.getSelectedRow())).getId());
                Ferramentas.changeStatus("Excluido", lblstatus,Color.RED);
                pesquisar();
            } catch (SQLException ex) {
                Ferramentas.showErro("Erro ocorido ao excluir.", "Erro!");
                Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
            }
        }
}//GEN-LAST:event_btnexcluirMouseClicked

    private void btnalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarMouseClicked
        //ALTERAR
        if (jTable1.getSelectedRow() == -1) {
                Ferramentas.showErro("Selecione um registro a ser alterado na lista.", "Erro!");
                return;
        }
        habilitarCampos(true);
        op=OperacaoTipo.alterar;
        txtdescricao.requestFocus();
        Ferramentas.changeStatus("Alterando",lblstatus,Color.YELLOW);
    }//GEN-LAST:event_btnalterarMouseClicked

    private void btnokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokMouseClicked
        //OK
        if (op == OperacaoTipo.inativo || !(Ferramentas.isCompleteFields(txtdescricao, txtprecoinicial, txtprecoinicial, txtqtde, txtpreco) && cbfornecedor.getSelectedIndex() != -1)) return;

        habilitarCampos(false);

        Produto p = new Produto();
        p.setId((!txtid.getText().equals(""))? Integer.parseInt(txtid.getText()) : -1);
        p.setNome(txtdescricao.getText());
        p.setPreco_inicial(Float.parseFloat(txtprecoinicial.getText()));
        p.setPreco_venda(Float.parseFloat(txtpreco.getText()));
        p.setQtdeEstoque(Integer.parseInt(txtqtde.getText()));
        p.setFoto(txtimagem.getText());
        p.setFornecedor(ltf.get(ltf.indexOf(cbfornecedor.getSelectedItem())));

        try {
            if (op == OperacaoTipo.novo) {
                dao.addProduto(p);
                limparCampos();
                Ferramentas.changeStatus("Adicionado", lblstatus,Color.GREEN);
            } else if (Ferramentas.showPergunta("Deseja Realmente alterar o registro?", "Atenção!!")) {
                dao.updateProduto(p);
                Ferramentas.changeStatus("Alterado", lblstatus, Color.GREEN);
            }
            pesquisar();
            op = OperacaoTipo.inativo;
        } catch (SQLException ex) {
            Ferramentas.showErro("Não foi possível efetuar a operação.", "Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        }
    }//GEN-LAST:event_btnokMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        //CALCELAR
        if (!Ferramentas.showPergunta("Deseja Realmente cancelar a operação?", "Atenção!!")) return;
        habilitarCampos(false);
        limparCampos();
        pesquisar();
        op = OperacaoTipo.inativo;
        Ferramentas.changeStatus("Cancelada", lblstatus,Color.RED);
}//GEN-LAST:event_btncancelMouseClicked

    private void btnpesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesquisaMouseClicked
        pesquisar();
}//GEN-LAST:event_btnpesquisaMouseClicked

    private void btnnewFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewFornecedorActionPerformed
        new FornecedoresGUI().setVisible(true);
    }//GEN-LAST:event_btnnewFornecedorActionPerformed

    private void btnnewFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewFornecedor1ActionPerformed
        try {
            atualizaFornecedores();
            Ferramentas.changeStatus("Atualizado", lblstatus,Color.WHITE);
        } catch (SQLException ex) {
            ltf = new LinkedList();
        }
    }//GEN-LAST:event_btnnewFornecedor1ActionPerformed

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnhomeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProdutosGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnalterar;
    private javax.swing.JLabel btncancel;
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnexcluir;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnmin;
    private javax.swing.JToggleButton btnnewFornecedor;
    private javax.swing.JToggleButton btnnewFornecedor1;
    private javax.swing.JLabel btnnovo;
    private javax.swing.JLabel btnok;
    private javax.swing.JLabel btnpesquisa;
    private javax.swing.JComboBox cbfornecedor;
    private javax.swing.JLabel imgfoto;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimagem;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtprecoinicial;
    private javax.swing.JTextField txtqtde;
    // End of variables declaration//GEN-END:variables
}
