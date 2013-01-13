

package telas.produtos;

import controle.Dao.ProdutoDao;
import controle.Ferramentas;
import java.awt.Color;
import java.sql.SQLException;
import modelo.Produto;

public class frmUpProduto extends javax.swing.JFrame {

    private ProdutoDao dao = new ProdutoDao();
    private Produto produtoInEdit;

    public frmUpProduto() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        Ferramentas.camposVisiveis(false,imgnome,imgestoque,imgpreco);
        txtnome.requestFocus();
    }

    public frmUpProduto(ProdutoDao dao, Produto produtoInEdit){
        this();
        this.dao = dao;
        this.produtoInEdit = produtoInEdit;
        initMyComponents();
    }
    private void initMyComponents(){
        txtnome.setText(produtoInEdit.getNome());
        txtestoque.setText(String.valueOf(produtoInEdit.getEstoque()));
        txtpreco.setText(String.valueOf(produtoInEdit.getPreco()));
        txtnome.requestFocus();
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
        jLabel4 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        txtestoque = new javax.swing.JTextField();
        imgnome = new javax.swing.JLabel();
        imgpreco = new javax.swing.JLabel();
        imgestoque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnok.setBackground(new java.awt.Color(51, 51, 51));
        btnok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-refresh.png"))); // NOI18N
        btnok.setText("Atualizar");
        btnok.setBorder(null);
        btnok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Quantidade em Estoque:");

        txtnome.setBackground(new java.awt.Color(102, 102, 102));
        txtnome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setBorder(null);

        txtpreco.setBackground(new java.awt.Color(102, 102, 102));
        txtpreco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpreco.setForeground(new java.awt.Color(255, 255, 255));
        txtpreco.setBorder(null);

        txtestoque.setBackground(new java.awt.Color(102, 102, 102));
        txtestoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtestoque.setForeground(new java.awt.Color(255, 255, 255));
        txtestoque.setBorder(null);

        imgnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        imgpreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        imgestoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/close24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgnome))
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpreco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtestoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(imgestoque))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgpreco)))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(240, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgestoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgpreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancel)
                    .addComponent(btnok))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed

        Ferramentas.camposVisiveis(false,imgnome,imgestoque,imgpreco);

        if(txtnome.getText().equals("")){
            Ferramentas.showErro("Entre com o nome.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgnome);
            return;
        }
        if(txtestoque.getText().equals("")){
            Ferramentas.showErro("Entre com a quantidade de estoque.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgestoque);
            return;
        }
        if(txtpreco.getText().equals("")){
            Ferramentas.showErro("Entre com o preço.","ERRO!!");
            Ferramentas.camposVisiveis(true,imgpreco);
            return;
        }

        produtoInEdit.setEstoque(Integer.parseInt(txtestoque.getText()));
        produtoInEdit.setNome(txtnome.getText());
        produtoInEdit.setPreco(Float.parseFloat(txtpreco.getText()));

        if(! Ferramentas.showPergunta("Realmente deseja alterar o registro?","Atenção") ) return;
        try {
            dao.updateProduto(produtoInEdit);
            Ferramentas.showMensagem("Operação realizada com sucesso.","Atenção");
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro, não foi possível alterar o produto.","ERRO!!");
        }
        txtnome.requestFocus();
    }//GEN-LAST:event_btnokActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel imgestoque;
    private javax.swing.JLabel imgnome;
    private javax.swing.JLabel imgpreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables

}
