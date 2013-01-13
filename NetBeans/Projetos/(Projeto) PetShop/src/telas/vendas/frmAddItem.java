

package telas.vendas;

import controle.Dao.ProdutoDao;
import controle.Dao.VendasDao;
import controle.Ferramentas;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Venda;
import java.util.List;
import modelo.Produto;
import modelo.VendaItem;


public class frmAddItem extends javax.swing.JFrame {

    private ProdutoDao prodDao;
    private VendasDao dao;
    private Venda thisvenda;
    private List<VendaItem> itens;
    private frmAddVenda2 control;

    public frmAddItem() {
        initComponents();
    }
    public frmAddItem(VendasDao dao,Venda thisvenda,List<VendaItem> itens,frmAddVenda2 control) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dao=dao;
        this.prodDao = new ProdutoDao();
        this.itens = itens;
        this.control = control;
        this.thisvenda = thisvenda;
        initialLoadData();
    }

    private void initialLoadData() {
        try {
           Ferramentas.montaComboBox(cbprodutos, prodDao.getAllProdutosOrdened("nome"));
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar os dados.","Erro!");
        }
    }
    private void refreshItensVendidos(){
        control.refreshItensVendidos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtestoque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbprodutos = new javax.swing.JComboBox();
        txtvalorunitario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqtde = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnok1 = new javax.swing.JButton();
        btnok2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Itens:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Produtos oferecidos:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Quantidade em estoque:");

        txtestoque.setBackground(new java.awt.Color(102, 102, 102));
        txtestoque.setEditable(false);
        txtestoque.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtestoque.setForeground(new java.awt.Color(255, 255, 255));
        txtestoque.setText("0");
        txtestoque.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Preço Unitário:");

        cbprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprodutosActionPerformed(evt);
            }
        });

        txtvalorunitario.setBackground(new java.awt.Color(102, 102, 102));
        txtvalorunitario.setEditable(false);
        txtvalorunitario.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtvalorunitario.setForeground(new java.awt.Color(255, 255, 255));
        txtvalorunitario.setText("R$ 0");
        txtvalorunitario.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantidade a ser comprada:");

        txtqtde.setBackground(new java.awt.Color(102, 102, 102));
        txtqtde.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtqtde.setForeground(new java.awt.Color(255, 255, 255));
        txtqtde.setText("0");
        txtqtde.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbprodutos, 0, 258, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtqtde, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbprodutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtqtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel6.setOpaque(false);

        btnok1.setBackground(new java.awt.Color(0, 0, 0));
        btnok1.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnok1.setForeground(new java.awt.Color(255, 255, 255));
        btnok1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-plus.png"))); // NOI18N
        btnok1.setText("Adicionar");
        btnok1.setBorder(null);
        btnok1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnok1.setOpaque(false);
        btnok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnok1ActionPerformed(evt);
            }
        });

        btnok2.setBackground(new java.awt.Color(0, 0, 0));
        btnok2.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnok2.setForeground(new java.awt.Color(255, 255, 255));
        btnok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/circle-delete.png"))); // NOI18N
        btnok2.setText("Sair");
        btnok2.setBorder(null);
        btnok2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnok2.setOpaque(false);
        btnok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnok2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnok1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnok2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnok2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void cbprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprodutosActionPerformed
        Produto produtoSelecionado = (Produto)cbprodutos.getSelectedItem();
        txtvalorunitario.setText(String.valueOf(produtoSelecionado.getPreco()));
        txtestoque.setText(String.valueOf(produtoSelecionado.getEstoque()));
}//GEN-LAST:event_cbprodutosActionPerformed

    private void btnok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnok1ActionPerformed
        if(txtqtde.getText().equals("")){
            Ferramentas.showErro("Entre com a quantidade a ser comprada","Erro!");
            return;
        }
        int qtde = Integer.parseInt(txtqtde.getText());
        if(qtde <=0){
            Ferramentas.showErro("A quantidade deve ser pelo menos 1 (uma)","Erro!");
            return;
        }
        if(qtde > Integer.parseInt(txtestoque.getText())){
            Ferramentas.showErro("A quantidade excede o total em estoque.","Erro!");
            return;
        }

        Produto prod = (Produto)cbprodutos.getSelectedItem();
        VendaItem item = new VendaItem();
        item.setProduto(prod);
        item.setQnt(qtde);
        item.setVendas(thisvenda);

        if(itens.contains(item)){
            for(VendaItem p : itens)
                if( p.getProduto() == item.getProduto()) p.setQnt(qtde);
        }else{
            itens.add(item);
        }

        refreshItensVendidos();

        Ferramentas.limparCampos(txtqtde,txtestoque,txtvalorunitario);
        cbprodutos.setSelectedIndex(0);
}//GEN-LAST:event_btnok1ActionPerformed

    private void btnok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnok2ActionPerformed
        dispose();
}//GEN-LAST:event_btnok2ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok1;
    private javax.swing.JButton btnok2;
    private javax.swing.JComboBox cbprodutos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtqtde;
    private javax.swing.JTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables

}
