

package telas.usuarios;

import controle.Dao.UsuarioDao;
import controle.Ferramentas;
import java.awt.Color;
import java.sql.SQLException;
import modelo.Usuario;

public class frmAddUsuarios extends javax.swing.JFrame {

    public UsuarioDao dao;

    public frmAddUsuarios() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        Ferramentas.camposVisiveis(false,imgnome,imglogin,imgsenha,imgconfirme);
        txtnome.requestFocus();
    }
    public frmAddUsuarios(UsuarioDao dao) {
        this();
        this.dao=dao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnok = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtlogin = new javax.swing.JTextField();
        imgnome = new javax.swing.JLabel();
        imgsenha = new javax.swing.JLabel();
        imglogin = new javax.swing.JLabel();
        imgconfirme = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        txtconfirme = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Novo Usuario");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnok.setBackground(new java.awt.Color(51, 51, 51));
        btnok.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-check.png"))); // NOI18N
        btnok.setText("Ok");
        btnok.setBorder(null);
        btnok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 11));
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-alert.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setBorder(null);
        btncancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Confirme:");

        txtnome.setBackground(new java.awt.Color(102, 102, 102));
        txtnome.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setBorder(null);

        txtlogin.setBackground(new java.awt.Color(102, 102, 102));
        txtlogin.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtlogin.setForeground(new java.awt.Color(255, 255, 255));
        txtlogin.setBorder(null);

        imgnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        imgsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        imglogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        imgconfirme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        txtsenha.setBackground(new java.awt.Color(102, 102, 102));
        txtsenha.setBorder(null);

        txtconfirme.setBackground(new java.awt.Color(102, 102, 102));
        txtconfirme.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtlogin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(txtsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(txtconfirme))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imgsenha)
                                        .addComponent(imgconfirme)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imglogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgnome, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgconfirme)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(imgnome)
                                .addGap(15, 15, 15)
                                .addComponent(imglogin))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imgsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(txtconfirme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnok)
                    .addComponent(btncancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed

        Ferramentas.camposVisiveis(false,imgnome,imglogin,imgsenha,imgconfirme);

        if(txtnome.getText().equals("")){
            Ferramentas.showErro("Entre com o nome.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgnome);
            return;
        }
        if(txtlogin.getText().equals("")){
            Ferramentas.showErro("Entre com o login.","ERRO!!");
            Ferramentas.camposVisiveis(true,imglogin);
            return;
        }
        if(txtsenha.getText().equals("")){
            Ferramentas.showErro("Entre coma senha.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgsenha);
            return;
        }
        if(txtconfirme.getText().equals("")){
            Ferramentas.showErro("Confirme a senha.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgconfirme);
            return;
        }
         if(! txtsenha.getText().equals(txtconfirme.getText())){
            Ferramentas.showErro("Os campos das senhas não são iguais.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgsenha,imgconfirme);
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setLogin(txtlogin.getText());
        usuario.setNome(txtnome.getText());
        usuario.setPassword(txtsenha.getText());

        try {
            dao.addUsuario(usuario);
            Ferramentas.showMensagem("Operação realizada com sucesso.","Atenção");
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro, não foi possível adicionar o usuário..","ERRO!!");
        }

        Ferramentas.limparCampos(txtnome,txtlogin,txtsenha,txtconfirme);
        txtnome.requestFocus();
    }//GEN-LAST:event_btnokActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel imgconfirme;
    private javax.swing.JLabel imglogin;
    private javax.swing.JLabel imgnome;
    private javax.swing.JLabel imgsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtconfirme;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables

}
