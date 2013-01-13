/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.InteressadoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Curso;
import model.Interessado;

/**
 *
 * @author Lucas
 */
public class JAltEmail extends javax.swing.JFrame {

    private InteressadoDao dao = new InteressadoDao();
    private List<Interessado> interessados = new ArrayList<>();
    private Interessado atual;
    private final JCadInteressado parente;
    

    JAltEmail(JCadInteressado aThis, Interessado atual) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.parente = aThis;
        interessados = parente.interessados;
        this.atual = atual;
        txtEmail.setText(atual.getEmail());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Email");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Email"));

        jLabel3.setText("Email:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Entre com o nome do interessado.", "Erro!", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
       for (Interessado c : interessados) {
                if (txtEmail.getText().equals(c.getEmail())) {
                    JOptionPane.showMessageDialog(null, "Interessado já existe na base.", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        }
        
        atual.setEmail(txtEmail.getText());
        if (dao.alteraEmail(atual)) {
            JOptionPane.showMessageDialog(null, "Interessado alterado com sucesso.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            parente.refresh();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
