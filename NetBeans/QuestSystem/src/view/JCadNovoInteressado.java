/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CursoDao;
import dao.InteressadoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Curso;
import model.Interessado;

/**
 *
 * @author Lucas
 */
public class JCadNovoInteressado extends javax.swing.JFrame {

    private InteressadoDao dao = new InteressadoDao();
    private List<Interessado> interessados = new ArrayList<>();
    private DefaultListModel<Curso> dlm = new DefaultListModel<>();
    private DefaultListModel<Curso> dlm2 = new DefaultListModel<>();
    private List<Curso> cursos = new ArrayList<>();
    private Interessado atual;
    private final JCadInteressado parente;
    private boolean op; //true=novo, false=alterar

    public JCadNovoInteressado(JCadInteressado parente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.parente = parente;
        interessados = parente.interessados;
        refresh();
        op = true; //novo
    }

    public JCadNovoInteressado(JCadInteressado parente, Interessado atual) {
        initComponents();
        this.parente = parente;
        this.atual = atual;
        interessados = parente.interessados;
        op = false; //false
        txtNome.setText(atual.getNome());
        txtEmail.setText(atual.getEmail());
        txtTelefoneC.setText(atual.getTelefoneC());
        txtTelefoneR.setText(atual.getTelefoneR());
        try {
            cursos = new CursoDao().getLista();
        } catch (SQLException ex) {
            Logger.getLogger(JCadNovoInteressado.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshList(dlm, cursos);
        refreshList(dlm2, atual.getCursos());
        for (Curso c : atual.getCursos()) {
            cursos.remove(c);
            refreshList(dlm, cursos);
        }
    }

    public void refresh() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefoneC.setText("");
        txtTelefoneR.setText("");
        listcursos1.getSelectedValuesList().clear();
        atual = new Interessado();
        try {
            cursos = new CursoDao().getLista();
        } catch (SQLException ex) {
            Logger.getLogger(JCadNovoInteressado.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshList(dlm, cursos);
        refreshList(dlm2, atual.getCursos());
        parente.refresh();
    }

    private void refreshList(DefaultListModel<Curso> dlm, List<Curso> cursos) {
        dlm.removeAllElements();
        for (Curso c : cursos) {
            dlm.addElement(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefoneR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefoneC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listcursos = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listcursos1 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();

        setTitle("Novo Interessado");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Curso"));

        jLabel2.setText("Nome:");

        jLabel3.setText("Email:");

        jLabel4.setText("Telefone Residencial:");

        jLabel5.setText("Telefone Comercial:");

        jLabel6.setText("Cursos:");

        listcursos.setModel(dlm);
        listcursos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listcursosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listcursos);

        jLabel7.setText("Escolha um ou mais cursos na lista.");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Para excluir o curso clique nele na lista.");

        listcursos1.setModel(dlm2);
        listcursos1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listcursos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listcursos1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listcursos1);

        jLabel9.setText("Selecionados:");

        jLabel10.setText("Celular:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtTelefoneR)
                            .addComponent(txtNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefoneC, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCelular)))
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefoneR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefoneC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Entre com o nome do interessado.", "Erro!", JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
            return;
        }
        if (op) {
            for (Interessado c : interessados) {
                if (txtNome.getText().equals(c.getNome())) {
                    JOptionPane.showMessageDialog(null, "Interessado já existe na base.", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        atual.setNome(txtNome.getText());
        atual.setEmail(txtEmail.getText());
        atual.setTelefoneC(txtTelefoneC.getText());
        atual.setTelefoneR(txtTelefoneR.getText());
        
        int tam = listcursos1.getModel().getSize();
        for (int i = 0; i < tam; i++)  atual.getCursos().add( (Curso) listcursos1.getModel().getElementAt(i));
        
        
        atual.setCelular(txtCelular.getText());
        if (op ? dao.adiciona(atual, !atual.getCursos().isEmpty()) : dao.altera(atual)) {
            JOptionPane.showMessageDialog(null, "Interessado " + (op ? "cadastrado" : "alterado") + " com sucesso.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            refresh();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao " + (op ? "cadastrar" : "alterar") + "", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcursosMouseClicked
        if (listcursos.getSelectedIndex() != -1) {
            int i = listcursos.getSelectedIndex();
            Curso c = cursos.get(i);
            atual.getCursos().add(c);
            cursos.remove(i);
            refreshList(dlm, cursos);
            refreshList(dlm2, atual.getCursos());
            if(!op){
                try {
                    dao.addCurso(c,atual.getCod_Interessado());
                } catch (SQLException ex) {
                    Logger.getLogger(JCadNovoInteressado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_listcursosMouseClicked

    private void listcursos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcursos1MouseClicked
        if (listcursos1.getSelectedIndex() != -1) {
            int i = listcursos1.getSelectedIndex();
            Curso c = atual.getCursos().get(i);
            cursos.add(c);
            atual.getCursos().remove(c);
            refreshList(dlm, cursos);
            refreshList(dlm2, atual.getCursos());
            if(!op){
                try {
                    dao.delCurso(c,atual.getCod_Interessado());
                } catch (SQLException ex) {
                    Logger.getLogger(JCadNovoInteressado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_listcursos1MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listcursos;
    private javax.swing.JList listcursos1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefoneC;
    private javax.swing.JTextField txtTelefoneR;
    // End of variables declaration//GEN-END:variables
}
