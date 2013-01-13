

package telas.agenda;

import controle.Dao.AgendaDao;
import controle.Ferramentas;
import java.sql.SQLException;
import java.util.List;
import modelo.Agenda;
import controle.MyTableModel;

public class frmAgenda extends javax.swing.JFrame {

    private final AgendaDao dao = new AgendaDao();
    private List<Agenda> compromissos;

    public frmAgenda() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadInitialData();
    }

    private void loadInitialData(){
        try {
            compromissos = dao.getAgendas();
            jTable1.setModel( new MyTableModel(Agenda.class,compromissos,jTable1));
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar os dados.","Erro!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnup = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btndel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnadd.setBackground(new java.awt.Color(255, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-plus.png"))); // NOI18N
        btnadd.setText("Adicionar");
        btnadd.setBorder(null);
        btnadd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnadd.setOpaque(false);
        btnadd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnup.setBackground(new java.awt.Color(255, 255, 255));
        btnup.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnup.setForeground(new java.awt.Color(255, 255, 255));
        btnup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-refresh.png"))); // NOI18N
        btnup.setText("Atualizar");
        btnup.setBorder(null);
        btnup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnup.setOpaque(false);
        btnup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });

        btndel.setBackground(new java.awt.Color(255, 255, 255));
        btndel.setFont(new java.awt.Font("Tahoma", 1, 11));
        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-delete.png"))); // NOI18N
        btndel.setText("Remover");
        btndel.setBorder(null);
        btndel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndel.setOpaque(false);
        btndel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnhome.setBackground(new java.awt.Color(255, 255, 255));
        btnhome.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/home.png"))); // NOI18N
        btnhome.setText("Voltar");
        btnhome.setBorder(null);
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.setOpaque(false);
        btnhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        btndel1.setBackground(new java.awt.Color(255, 255, 255));
        btndel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndel1.setForeground(new java.awt.Color(255, 255, 255));
        btndel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/subscription_80x80.png"))); // NOI18N
        btndel1.setText("Refresh");
        btndel1.setBorder(null);
        btndel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndel1.setOpaque(false);
        btndel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, 0, 368, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        frmAddAgenda form = new frmAddAgenda(dao);
        form.setVisible(true);
}//GEN-LAST:event_btnaddActionPerformed

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        if(jTable1.getSelectedRow() ==-1){
            Ferramentas.showErro("Selecione um compromisso para poder alterar.","ERRO!!");
            return;
        }
        frmUpAgenda form = new frmUpAgenda(dao,compromissos.get(jTable1.getSelectedRow()));
        form.setVisible(true);
}//GEN-LAST:event_btnupActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        if(jTable1.getSelectedRow() ==-1){
            Ferramentas.showErro("Selecione um compromisso para poder remover.","ERRO!!");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja remover o registro?","Atenção")) return;
        try {
            dao.removeAgenda(compromissos.get(jTable1.getSelectedRow()).getId());
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao remover compromisso.","ERRO!!");
        }
        loadInitialData();
}//GEN-LAST:event_btndelActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnhomeActionPerformed

    private void btndel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndel1ActionPerformed
        loadInitialData();
}//GEN-LAST:event_btndel1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btndel1;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
