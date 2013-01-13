

package View.ingredientes;

import Controle.*;
import Dao.IngredienteDao;
import Modelo.Ingrediente;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;


public class IngredientesGUI extends javax.swing.JFrame {

    IngredienteDao dao;
    List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();

    public IngredientesGUI() {
        initComponents();
        dao = new IngredienteDao();
        this.setLocationRelativeTo(null);
        loadInitialData();
    }

    public void loadInitialData() {
        try {
            ingredientes = dao.getIngredientes();
            Ferramentas.montaJTable(jTable1, ingredientes, Ingrediente.class);
            //jTable1.setModel(new MyTableModel(Produto.class,ingredientes,jTable1));
            cbTipoFiltro.setModel(new DefaultComboBoxModel(IngredienteTipo.values()));
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar dados.", "Erro interno.");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnnovo = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JLabel();
        btnalterar = new javax.swing.JLabel();
        btnvoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbTipoFiltro = new javax.swing.JComboBox();
        btnfiltrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chBtipo = new javax.swing.JCheckBox();
        chBdescricao = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingredientes");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(90, 103, 110));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/minimizar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingredientes");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        btnnovo.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnnovo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluirMouseClicked(evt);
            }
        });

        btnalterar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalterarMouseClicked(evt);
            }
        });

        btnvoltar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/home.png"))); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnovo)
            .addComponent(btnexcluir)
            .addComponent(btnalterar)
            .addComponent(btnvoltar)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvoltar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 193, 128), 2, true), "Opções de Filtragem:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(200, 193, 128))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setForeground(new java.awt.Color(200, 193, 128));
        jLabel6.setText("Tipo:");

        cbTipoFiltro.setBackground(new java.awt.Color(200, 193, 128));

        btnfiltrar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnfiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnfiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/pesquisar.png"))); // NOI18N
        btnfiltrar.setText("Filtrar");
        btnfiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfiltrarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setForeground(new java.awt.Color(200, 193, 128));
        jLabel7.setText("Parte da Descrição:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setForeground(new java.awt.Color(200, 193, 128));
        jLabel9.setText("Escolha a opção*:");

        chBtipo.setForeground(new java.awt.Color(200, 193, 128));
        chBtipo.setText("Tipo");
        chBtipo.setOpaque(false);

        chBdescricao.setForeground(new java.awt.Color(200, 193, 128));
        chBdescricao.setText("Descrição");
        chBdescricao.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel10.setForeground(new java.awt.Color(200, 193, 128));
        jLabel10.setText("*Pode escolher ambas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbTipoFiltro, 0, 151, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)
                        .addComponent(txtdescricao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chBtipo)
                            .addComponent(jLabel9)
                            .addComponent(chBdescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnfiltrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chBtipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chBdescricao))
                    .addComponent(btnfiltrar))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked
        new EditIngredienteGUI(this,dao).setVisible(true);
    }//GEN-LAST:event_btnnovoMouseClicked

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
        if (jTable1.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um ingrediente.","ERRO!");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja remover o registro?","Atenção")) return;
        int id = ingredientes.get(jTable1.getSelectedRow()).getId();
        try {
            dao.remove(id);
            Ferramentas.showMensagem("Excluido com sucesso","Informe");
            loadInitialData();
        } catch (SQLException ex) {
            Ferramentas.showErro("Não foi possivel a exclusão.","Erro interno");
        }

    }//GEN-LAST:event_btnexcluirMouseClicked

    private void btnalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarMouseClicked
        if (jTable1.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um ingrediente.","ERRO!");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja alterar o registro?","Atenção")) return;
        new EditIngredienteGUI(this,dao,ingredientes.get(jTable1.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_btnalterarMouseClicked

    private void btnfiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfiltrarMouseClicked
        IngredienteTipo it = (IngredienteTipo) cbTipoFiltro.getSelectedItem();
        String st = txtdescricao.getText();
         try {
            if (chBtipo.isSelected() && chBdescricao.isSelected())
                ingredientes = dao.getIngredientes(it, st);
            else if (chBtipo.isSelected())
                ingredientes = dao.getIngredientes(it);
            else if (chBdescricao.isSelected()) 
                ingredientes = dao.getIngredientes(st);
            else
                ingredientes = dao.getIngredientes();
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao filtrar os campos.","Erro interno.");
        }
        Ferramentas.montaJTable(jTable1, ingredientes,Ingrediente.class);
    }//GEN-LAST:event_btnfiltrarMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngredientesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnalterar;
    private javax.swing.JLabel btnexcluir;
    private javax.swing.JLabel btnfiltrar;
    private javax.swing.JLabel btnnovo;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JComboBox cbTipoFiltro;
    private javax.swing.JCheckBox chBdescricao;
    private javax.swing.JCheckBox chBtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdescricao;
    // End of variables declaration//GEN-END:variables

}
