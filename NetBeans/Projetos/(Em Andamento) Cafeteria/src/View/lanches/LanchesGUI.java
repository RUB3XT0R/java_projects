

package View.lanches;

import Controle.Ferramentas;
import Dao.LancheDao;
import Modelo.Lanche;
import Modelo.LancheItens;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class LanchesGUI extends javax.swing.JFrame {

    LancheDao dao;
    List<Lanche> lanches = new LinkedList<Lanche>();
    private ListSelectionModel lsc;
    
    public LanchesGUI() {
        initComponents();
        dao = new LancheDao();
        this.setLocationRelativeTo(null);
        loadInitialData();
    }

    public void loadInitialData() {
        try {
            lanches = dao.getAllLanches();
            Ferramentas.montaJTable(tableLanche,lanches,Lanche.class);
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar dados.", "Erro interno.");
        }

    }

    private void getSelecionados(JTable t){
        if (tableLanche.getSelectedRow() != -1)
        Ferramentas.montaJTable(tableingredientes,lanches.get(t.getSelectedRow()).getIngredientes(),LancheItens.class);
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
        tableIngredientes = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLanche = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableingredientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        btnfiltrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lanches");
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
        jLabel3.setText("Lanches");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
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
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvoltarMouseClicked(evt);
            }
        });

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

        tableIngredientes.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        tableLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableLanche.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsc = tableLanche.getSelectionModel();
        lsc.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting())getSelecionados(tableLanche);
            }
        });
        jScrollPane1.setViewportView(tableLanche);

        tableIngredientes.addTab("Lanches", jScrollPane1);

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        tableingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableingredientes);

        tableIngredientes.addTab("Ingredientes", jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquisar nome:");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnfiltrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfiltrar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableIngredientes, 0, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tableIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnfiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfiltrarMouseClicked
        String st = txtdescricao.getText();
        try {
            lanches = dao.getLanches(st);
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao filtrar os dados","Erro interno.");
        }
        Ferramentas.montaJTable(tableLanche,lanches,Lanche.class);
        
}//GEN-LAST:event_btnfiltrarMouseClicked

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked
        new EditLanchesGUI(this,dao).setVisible(true);
    }//GEN-LAST:event_btnnovoMouseClicked

    private void btnalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarMouseClicked
        if(tableLanche.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um lanche para poder alterar.", null);
            return;
        }
        if(!Ferramentas.showPergunta("Deseja realmente alterar esse lanche?","Atenção!")) return;
        new EditLanchesGUI(this,dao,lanches.get(tableLanche.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_btnalterarMouseClicked

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
        if (tableLanche.getSelectedRow() == -1) {
            Ferramentas.showErro("Selecione um lanche para poder excluir.", null);
            return;
        }
        if (!Ferramentas.showPergunta("Deseja realmente excluir esse lanche?", "Atenção!")) return;
        try {
            dao.removeLanche(lanches.get(tableLanche.getSelectedRow()).getId());
            loadInitialData();
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao excluir o lanche.","Erro interno.");
        }
    }//GEN-LAST:event_btnexcluirMouseClicked

    private void btnvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnvoltarMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanchesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnalterar;
    private javax.swing.JLabel btnexcluir;
    private javax.swing.JLabel btnfiltrar;
    private javax.swing.JLabel btnnovo;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tableIngredientes;
    private javax.swing.JTable tableLanche;
    private javax.swing.JTable tableingredientes;
    private javax.swing.JTextField txtdescricao;
    // End of variables declaration//GEN-END:variables

}
