

package view.venda;

import controle.Dao.ProdutoDao;
import controle.Dao.VendasDao;
import controle.ferramentas.Ferramentas;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import modelo.Produto;
import modelo.Venda;
import modelo.VendaItem;


public class AddItemVendaGUI extends javax.swing.JFrame {

    private VendasDao dao;
    private Venda thisvenda;
    private ProdutoDao prodDao;
    private List<VendaItem> itens;
    private NovaVendaGUI control;

    public AddItemVendaGUI() {
        initComponents();
    }

    public AddItemVendaGUI(VendasDao dao, Venda thisvenda,List<VendaItem> itens, NovaVendaGUI control) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dao = dao;
        this.thisvenda=thisvenda;
        this.control=control;
        this.itens =itens;
        this.prodDao = new ProdutoDao();
        System.out.println(dao +"\n"+ thisvenda +"\n"+ control +"\n"+ itens);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnclose = new javax.swing.JLabel();
        btnmin = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnadd = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtestoque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbprodutos = new javax.swing.JComboBox();
        txtvalorunitario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqtde = new javax.swing.JTextField();
        imgfoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(567, 467));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Adicionar Itens");

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/close.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });

        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/minimizar.png"))); // NOI18N
        btnmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminMouseClicked(evt);
            }
        });

        lblstatus.setBackground(new java.awt.Color(255, 153, 0));
        lblstatus.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Status:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnmin)
                .addComponent(btnclose))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/novo.png"))); // NOI18N
        btnadd.setText("Novo");
        btnadd.setToolTipText("");
        btnadd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnadd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });

        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/home.png"))); // NOI18N
        btnhome.setText("Voltar");
        btnhome.setToolTipText("");
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });

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

        imgfoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhome))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imgfoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        this.setVisible(false);
}//GEN-LAST:event_btncloseMouseClicked

    private void btnminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseClicked
        setExtendedState(ICONIFIED);
}//GEN-LAST:event_btnminMouseClicked

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
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
        Ferramentas.changeStatus("Adicionado",lblstatus,Color.blue);
}//GEN-LAST:event_btnaddMouseClicked

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        this.setVisible(false);
}//GEN-LAST:event_btnhomeMouseClicked

    private void cbprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprodutosActionPerformed
        Produto produtoSelecionado = (Produto)cbprodutos.getSelectedItem();
        txtvalorunitario.setText(String.valueOf(produtoSelecionado.getPreco_venda()));
        txtestoque.setText(String.valueOf(produtoSelecionado.getQtdeEstoque()));
        putImage(produtoSelecionado.getFoto());
}//GEN-LAST:event_cbprodutosActionPerformed
    private void putImage(String foto) {
        imgfoto.setIcon(new ImageIcon(getClass().getResource("")));
        try {
            imgfoto.setIcon(new ImageIcon(getClass().getResource(foto)));
        } catch (NullPointerException e) {
            imgfoto.setIcon(new ImageIcon(getClass().getResource("")));
        } finally {
            imgfoto.setBounds(imgfoto.getX(), imgfoto.getX(), 189, 176);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemVendaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnadd;
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnmin;
    private javax.swing.JComboBox cbprodutos;
    private javax.swing.JLabel imgfoto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtqtde;
    private javax.swing.JTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables


}
