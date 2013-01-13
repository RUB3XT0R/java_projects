
package view.cadastro;

import controle.Dao.FornecedorDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controle.ferramentas.Ferramentas;
import controle.tipos.OperacaoTipo;
import java.awt.Color;
import modelo.Fornecedor;

public class FornecedoresGUI extends javax.swing.JFrame {

    private ListSelectionModel lsc;
    private List<Fornecedor> ltc;
    private OperacaoTipo op;
    private FornecedorDao dao= new FornecedorDao();

    public FornecedoresGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        pesquisar();
        habilitarCampos(false);
        op=OperacaoTipo.inativo;
        Ferramentas.changeStatus("Carregado", lblstatus,Color.white);
    }
    
    private void pesquisar(){
        try {
            ltc = dao.getFornecedor(txtpesquisa.getText());
            Ferramentas.montaJTable(jTable1, ltc, Fornecedor.class);
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ocorido ao pesquisar.","Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        }
    }
   
    private void limparCampos(){
        Ferramentas.limparCampos(txtid,txtnome,txtemail,txtcnpj,txtendereco,txttelefone);
        cbprodutos.removeAllItems();
    }
    private void habilitarCampos(boolean h){
        Ferramentas.habilitarCampos(h,txtid,txtnome,txtemail,txtcnpj,txtendereco,txttelefone);
    }
    private void getSelecionados(JTable t) {
        if (jTable1.getSelectedRow() == -1) {
            limparCampos();
            return;
        }
        txtcnpj.setText(String.valueOf(ltc.get(t.getSelectedRow()).getCnpj()));
        txtid.setText(String.valueOf(ltc.get(t.getSelectedRow()).getId()));
        txtnome.setText(ltc.get(t.getSelectedRow()).getNome());
        txtemail.setText(ltc.get(t.getSelectedRow()).getEmail());
        txtendereco.setText(ltc.get(t.getSelectedRow()).getEndereco());
        txttelefone.setText(ltc.get(t.getSelectedRow()).getTelefone());

        cbprodutos.removeAllItems();
        Ferramentas.montaComboBox(cbprodutos,(ltc.get(t.getSelectedRow())).getProdutos());
        
        op = OperacaoTipo.inativo;
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
        txtnome = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        cbprodutos = new javax.swing.JComboBox();
        txtcnpj = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnnovo = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JLabel();
        btnalterar = new javax.swing.JLabel();
        btnok = new javax.swing.JLabel();
        btncancel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel4.setText("Cadastro e Consulta - Fornecedores");

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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(331, 331, 331)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnmin)
                        .addComponent(btnclose))
                    .addComponent(jLabel5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Digite um nome:");

        txtpesquisa.setBackground(new java.awt.Color(204, 204, 204));

        btnpesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnpesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/pesquisar.png"))); // NOI18N
        btnpesquisa.setText("Procurar");
        btnpesquisa.setToolTipText("");
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
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsc = jTable1.getSelectionModel();
        lsc.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting())getSelecionados(jTable1);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(540, 153));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Endereço:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone:");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Produtos Fornecidos");

        txtnome.setBackground(new java.awt.Color(204, 204, 204));

        txttelefone.setBackground(new java.awt.Color(204, 204, 204));

        txtendereco.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email:");

        txtemail.setBackground(new java.awt.Color(204, 204, 204));

        txtcnpj.setBackground(new java.awt.Color(204, 204, 204));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CNPJ:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel18)
                    .addComponent(cbprodutos, 0, 545, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(15, 15, 15)
                        .addComponent(txtendereco, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbprodutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        btnnovo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.setToolTipText("");
        btnnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
        });

        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setToolTipText("");
        btnexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluirMouseClicked(evt);
            }
        });

        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.setToolTipText("");
        btnalterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalterarMouseClicked(evt);
            }
        });

        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/ok.png"))); // NOI18N
        btnok.setText("OK");
        btnok.setToolTipText("");
        btnok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnokMouseClicked(evt);
            }
        });

        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/cancelar.png"))); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.setToolTipText("");
        btncancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/home.png"))); // NOI18N
        jLabel14.setText("Home");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnovo)
            .addComponent(btnexcluir)
            .addComponent(btnalterar)
            .addComponent(btnok)
            .addComponent(btncancel)
            .addComponent(jLabel14)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, 0, 68, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        this.setVisible(false);
}//GEN-LAST:event_btncloseMouseClicked

    private void btnminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseClicked
        setExtendedState(ICONIFIED);
}//GEN-LAST:event_btnminMouseClicked

    private void btnpesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesquisaMouseClicked
        pesquisar();
}//GEN-LAST:event_btnpesquisaMouseClicked

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked
        //NOVO
        limparCampos();
        habilitarCampos(true);
        op=OperacaoTipo.novo;
        txtcnpj.requestFocus();
        Ferramentas.changeStatus("Adicionando novo",lblstatus,Color.blue);
    }//GEN-LAST:event_btnnovoMouseClicked

    private void btnokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokMouseClicked
        //OK
        if (op == OperacaoTipo.inativo || !Ferramentas.isCompleteFields(txtnome, txtemail, txtcnpj, txtendereco, txttelefone)) return;

        habilitarCampos(false);

        Fornecedor f = new Fornecedor();
        f.setId((!txtid.getText().equals("")) ? Integer.parseInt(txtid.getText()) : -1);
        f.setCnpj(txtcnpj.getText());
        f.setNome(txtnome.getText());
        f.setEmail(txtemail.getText());
        f.setEndereco(txtendereco.getText());
        f.setTelefone(txttelefone.getText());

        try {
            if (op == OperacaoTipo.novo) {
                dao.addFornecedor(f);
                limparCampos();
                Ferramentas.changeStatus("Adicionado", lblstatus,Color.GREEN);
            } else if (Ferramentas.showPergunta("Deseja Realmente alterar o registro?", "Atenção!!")) {
                dao.updateFornecedor(f);
                Ferramentas.changeStatus("Alterado", lblstatus, Color.GREEN);
            }
            pesquisar();
            op = OperacaoTipo.inativo;
        } catch (SQLException ex) {
            Ferramentas.showErro("Não foi possível efetuar a operação.", "Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        }

    }//GEN-LAST:event_btnokMouseClicked

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
        //EXCLUIR
        if (jTable1.getSelectedRow() == -1) {
            Ferramentas.showMensagem("Selecione um registro a ser excluido na lista.", "Erro!");
            Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
        } else if (Ferramentas.showPergunta("Deseja Realmente excluir esse registro?", "Atenção!!")) {
            try {
                dao.removeFornecedor( (int) (ltc.get(jTable1.getSelectedRow())).getId());
                Ferramentas.changeStatus("Excluido", lblstatus,Color.RED);
                pesquisar();
            } catch (SQLException ex) {
                Ferramentas.showErro("Erro ocorido ao excluir.", "Erro!");
                Ferramentas.changeStatus("Erro", lblstatus,Color.RED);
            }
        }
    }//GEN-LAST:event_btnexcluirMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        //CALCELAR
        if (!Ferramentas.showPergunta("Deseja Realmente cancelar a operação?", "Atenção!!")) return;
        habilitarCampos(false);
        limparCampos();
        pesquisar();
        op = OperacaoTipo.inativo;
        Ferramentas.changeStatus("Cancelada", lblstatus,Color.RED);
    }//GEN-LAST:event_btncancelMouseClicked

    private void btnalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarMouseClicked
        //ALTERAR
        if (jTable1.getSelectedRow() == -1) {
                Ferramentas.showErro("Selecione um registro a ser alterado na lista.", "Erro!");
                return;
        }
        habilitarCampos(true);
        op=OperacaoTipo.alterar;
        txtcnpj.requestFocus();
        Ferramentas.changeStatus("Alterando",lblstatus,Color.YELLOW);
    }//GEN-LAST:event_btnalterarMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setVisible(false);
}//GEN-LAST:event_jLabel14MouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedoresGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnalterar;
    private javax.swing.JLabel btncancel;
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnexcluir;
    private javax.swing.JLabel btnmin;
    private javax.swing.JLabel btnnovo;
    private javax.swing.JLabel btnok;
    private javax.swing.JLabel btnpesquisa;
    private javax.swing.JComboBox cbprodutos;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JTextField txtcnpj;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables

}
