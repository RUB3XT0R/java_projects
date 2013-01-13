/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Control;
import control.fillTable;
import dao.CursoDao;
import dao.InteressadoDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Curso;
import model.Interessado;

/**
 *
 * @author Lucas
 */
public class JConsultaInteressado extends javax.swing.JFrame {

    public List<Interessado> interessadosASalvar = new ArrayList<>();
    private InteressadoDao dao = new InteressadoDao();
    public Set<Interessado> interessados = new HashSet<>();
    private DefaultListModel<Curso> dlm = new DefaultListModel<>();
    private Object[][] table;

    public JConsultaInteressado() {
        initComponents();
        this.setLocationRelativeTo(null);
        dlm.clear();
        try {
            for (Curso c : new CursoDao().getLista()) {
                dlm.addElement(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JConsultaInteressado.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
         * lblaviso.setText("Pesquisando contatos ..."); Thread t = new
         * Thread(new Runnable() {
         *
         * @Override public void run() { try { interessados = dao.getLista();
         * refresh(); lblaviso.setText("Contatos pesquisados:
         * "+interessados.size()); } catch (SQLException ex) {
         * Logger.getLogger(JCadInteressado.class.getName()).log(Level.SEVERE,
         * null, ex); } } });
        t.start();
         */
    }
    private Thread t;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listcursos = new javax.swing.JList();
        lblaviso = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Gerar Contatos");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções de Cursos"));

        listcursos.setModel(dlm);
        listcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listcursosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listcursos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Adicionar os Sem Curso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar a Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar Lista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Remover da Lista");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addComponent(lblaviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcursosMouseClicked
        
    }//GEN-LAST:event_listcursosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(null);
            new Control().gerarContatos(file.getSelectedFile().getAbsolutePath(),new ArrayList( interessados));
        } catch (IOException ex) {
            Logger.getLogger(JConsultaInteressado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (listcursos.getSelectedIndex() != -1) {
            if (t != null) {
                if (t.isAlive()) {
                    return;
                }
            }
            lblaviso.setText("Pesquisando contatos ...");
            //List<Curso> cs = listcursos.getSelectedValuesList();
            t = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        interessados.addAll(dao.getLista(listcursos.getSelectedValuesList()));
                        lblaviso.setText("Contatos ao todo: " + interessados.size());
                    } catch (SQLException ex) {
                        Logger.getLogger(JConsultaInteressado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            t.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (listcursos.getSelectedIndex() != -1) {
            if (t != null) {
                if (t.isAlive()) {
                    return;
                }
            }
            lblaviso.setText("Pesquisando contatos ...");
            t = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        interessados.addAll(dao.getListaSemCurso());
                        lblaviso.setText("Contatos ao todo: " + interessados.size());
                    } catch (SQLException ex) {
                        Logger.getLogger(JConsultaInteressado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            t.start();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (listcursos.getSelectedIndex() != -1) {
            if (t != null) {
                if (t.isAlive()) {
                    return;
                }
            }
            if(interessados.isEmpty())return;
            lblaviso.setText("Removendo contatos ...");
            t = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                         interessados.removeAll(dao.getLista(listcursos.getSelectedValuesList()));
                        lblaviso.setText("Contatos ao todo: " + interessados.size());
                    } catch (SQLException ex) {
                        Logger.getLogger(JConsultaInteressado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            t.start();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JConsultaInteressado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConsultaInteressado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConsultaInteressado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConsultaInteressado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JConsultaInteressado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblaviso;
    private javax.swing.JList listcursos;
    // End of variables declaration//GEN-END:variables
}
