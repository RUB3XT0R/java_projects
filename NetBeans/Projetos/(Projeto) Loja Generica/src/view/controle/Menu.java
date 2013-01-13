
package view.controle;

import view.cadastro.ProdutosGUI;
import view.cadastro.LoginsGUI;
import view.cadastro.FuncionarioGUI;
import view.cadastro.FornecedoresGUI;
import view.cadastro.ClientesGUI;
import view.venda.VendasGUI;
import java.awt.Color;
import modelo.Login;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
    }
    private Login user = new Login();
    private LoginGUI ll = new LoginGUI();

    public void getUser(Login lo,LoginGUI ll){
        user =lo;
        this.ll = ll;
        txtuser.setText(user.getLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnmin = new javax.swing.JLabel();
        btnsair = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnclientes = new javax.swing.JLabel();
        btnprodutos = new javax.swing.JLabel();
        btnfuncionarios = new javax.swing.JLabel();
        btnfornecedores = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnvendas = new javax.swing.JLabel();
        btnlogoff = new javax.swing.JLabel();
        btnlogins = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(232, 186, 106));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Sistem Lucky Bussiness");

        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/minimizar.png"))); // NOI18N
        btnmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminMouseClicked(evt);
            }
        });

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/close.png"))); // NOI18N
        btnsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnsair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsair)
            .addComponent(btnmin)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        btnclientes.setForeground(new java.awt.Color(255, 255, 255));
        btnclientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/onebit_17 (2).png"))); // NOI18N
        btnclientes.setText("Clientes");
        btnclientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnclientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclientesMouseClicked(evt);
            }
        });

        btnprodutos.setForeground(new java.awt.Color(255, 255, 255));
        btnprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/onebit_07.png"))); // NOI18N
        btnprodutos.setText("Produtos");
        btnprodutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnprodutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprodutosMouseClicked(evt);
            }
        });

        btnfuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnfuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/funcionarios.png"))); // NOI18N
        btnfuncionarios.setText("Funcionários");
        btnfuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfuncionariosMouseClicked(evt);
            }
        });

        btnfornecedores.setForeground(new java.awt.Color(255, 255, 255));
        btnfornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/box_64.png"))); // NOI18N
        btnfornecedores.setText("Fornecedores");
        btnfornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfornecedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfornecedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnprodutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfornecedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnprodutos, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnfuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnclientes, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        btnvendas.setForeground(new java.awt.Color(255, 255, 255));
        btnvendas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/vendas.png"))); // NOI18N
        btnvendas.setText("Vendas");
        btnvendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnvendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvendasMouseClicked(evt);
            }
        });

        btnlogoff.setForeground(new java.awt.Color(255, 255, 255));
        btnlogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logoff.png"))); // NOI18N
        btnlogoff.setText("LogOff");
        btnlogoff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogoff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoffMouseClicked(evt);
            }
        });

        btnlogins.setForeground(new java.awt.Color(255, 255, 255));
        btnlogins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logins.png"))); // NOI18N
        btnlogins.setText("Logins");
        btnlogins.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogins.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlogins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvendas)
                .addGap(18, 18, 18)
                .addComponent(btnlogins)
                .addGap(18, 18, 18)
                .addComponent(btnlogoff)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvendas)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnlogoff, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(btnlogins, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(232, 186, 106));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Person-black.png"))); // NOI18N
        jLabel3.setText("Usuário Logado:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtuser.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseClicked
        this.setVisible(false);
        ll.setVisible(true);
    }//GEN-LAST:event_btnsairMouseClicked

    private void btnminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseClicked
       setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminMouseClicked

    private void btnclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclientesMouseClicked
        new ClientesGUI().setVisible(true);
    }//GEN-LAST:event_btnclientesMouseClicked

    private void btnprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprodutosMouseClicked
        new ProdutosGUI().setVisible(true);
    }//GEN-LAST:event_btnprodutosMouseClicked

    private void btnfuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfuncionariosMouseClicked
        new FuncionarioGUI().setVisible(true);
    }//GEN-LAST:event_btnfuncionariosMouseClicked

    private void btnfornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfornecedoresMouseClicked
        new FornecedoresGUI().setVisible(true);
    }//GEN-LAST:event_btnfornecedoresMouseClicked

    private void btnvendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvendasMouseClicked
        new VendasGUI().setVisible(true);
    }//GEN-LAST:event_btnvendasMouseClicked

    private void btnlogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoffMouseClicked
        this.setVisible(false);
        ll.setVisible(true);
    }//GEN-LAST:event_btnlogoffMouseClicked

    private void btnloginsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginsMouseClicked
        new LoginsGUI().setVisible(true);
    }//GEN-LAST:event_btnloginsMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnclientes;
    private javax.swing.JLabel btnfornecedores;
    private javax.swing.JLabel btnfuncionarios;
    private javax.swing.JLabel btnlogins;
    private javax.swing.JLabel btnlogoff;
    private javax.swing.JLabel btnmin;
    private javax.swing.JLabel btnprodutos;
    private javax.swing.JLabel btnsair;
    private javax.swing.JLabel btnvendas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

}
