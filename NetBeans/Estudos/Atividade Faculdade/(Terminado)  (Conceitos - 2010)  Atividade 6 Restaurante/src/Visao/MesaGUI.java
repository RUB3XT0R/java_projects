
package Visao;

import Modelo.Mesa;
import Modelo.Produto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MesaGUI extends javax.swing.JFrame {
    public static List<Produto> menu= new ArrayList<Produto>();
    public static Mesa mesa = new Mesa(20);
    public DefaultListModel vagas = new DefaultListModel();
    public DefaultListModel ocupadas = new DefaultListModel();
    DefaultListModel consumo = new DefaultListModel();

    public MenuGUI mg = new MenuGUI();

    public MesaGUI() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);

        preencherMenuGUI();
        preencherMesas();
    }

   //método para preencher o menuGUI
   private void preencherMenuGUI(){
        //preenchendo as massas
        menu.add(new Produto(1,"Canelone Quatro queijos",12.90));
        menu.add(new Produto(1,"Canelone Carne a bolonhesa",15.90));
        menu.add(new Produto(1,"Canelone Frango com Molho Branco",13.90));
        menu.add(new Produto(1,"Pizza Brasileira (atum, palmito, ovos, cebola e mussarela)",18.90));
        menu.add(new Produto(1,"Pizza Atum (molho, mussarela e atum)",11.90));
        menu.add(new Produto(1,"Pizza Banana (banana, açúcar, canela e mussarela)",10.90));
        menu.add(new Produto(1,"Pizza Calabresa (molho, mussarela e calabresa)",12.90));
        menu.add(new Produto(1,"Pizza Milho Verde (molho, milho verde e mussarela)",12.90));
        menu.add(new Produto(1,"Pizza Mussarela (molho e mussarela)",12.90));
        menu.add(new Produto(1,"Pizza Presunto (molho, mussarela, tomate e presunto)",12.90));
        menu.add(new Produto(1,"Pizza Champion (champion, tomate e mussarela)",14.90));
        menu.add(new Produto(1,"Pizza Palmito (molho, mussarela e palmito)",12.90));
        menu.add(new Produto(1,"Pizza Siciliana (bacon, champion e mussarela)",13.90));
        menu.add(new Produto(1,"Pizza Camarão (mussarela e camarão ao molho)",16.90));
        menu.add(new Produto(1,"Lazanhas Bacalhau ao Catupiri",21.90));
        menu.add(new Produto(1,"Lazanhas Branca a Bolonhesa",15.90));
        menu.add(new Produto(1,"Lazanhas Frango ao Catupiri",17.90));
        menu.add(new Produto(1,"Lazanhas Verde a Bolonhesa",19.90));
        menu.add(new Produto(1,"Nhoc Ao Molho Bolonhesa ao Sugo",15.90));
        menu.add(new Produto(1,"Nhoc Ao Molho Misto a Parmegiana",15.90));
        menu.add(new Produto(1,"Nhoc Verde de Espinafre ao Molho",12.90));
        //preenchendo as saladas
        menu.add(new Produto(1,"Salada de Palmito",9.90));
        menu.add(new Produto(1,"Salada de frango a Folhas Especiais",15.90));
        menu.add(new Produto(1,"Salada de Ceazar",10.90));
        menu.add(new Produto(1,"Carpaccio",18.90));
        menu.add(new Produto(1,"Salada de massa Integral",17.90));
        menu.add(new Produto(1,"Salada Tropical",10.90));
        menu.add(new Produto(1,"Salpicão de Frango",8.90));
        menu.add(new Produto(1,"Salada Mista",5.90));
        menu.add(new Produto(1,"Salada Italiana",6.90));
        menu.add(new Produto(1,"Salada Romanesca",7.90));
        menu.add(new Produto(1,"Vinagrete",4.90));
        menu.add(new Produto(1,"Salada Angélica",12.90));
        menu.add(new Produto(1,"Salada de Beringela",18.90));
        //preenchendo os principais
        menu.add(new Produto(1,"Arroz Piamontese + carne",12.90));
        menu.add(new Produto(1,"Risoto Tradicional + carne",10.90));
        menu.add(new Produto(1,"Risoto Funghi Secci + carne",16.90));
        menu.add(new Produto(1,"Polpetone de Carne com recheio de Mozzarella",18.90));
        menu.add(new Produto(1,"Polpetone de Frango com recheio de Mozzarella",17.90));
        menu.add(new Produto(1,"Polpetone de Peito de Peru com recheio de Mozzarella",13.90));
        menu.add(new Produto(1,"Galeto",14.90));
        menu.add(new Produto(1,"Picanha",44.90));
        menu.add(new Produto(1,"Maminha na Manteiga",29.90));
        menu.add(new Produto(1,"Costela Bovina",24.90));
        menu.add(new Produto(1,"Fraldão Nobre",25.90));
        menu.add(new Produto(1,"Contra Filé",25.90));
        menu.add(new Produto(1,"Costela Suina",21.90));
        menu.add(new Produto(1,"Medalhão de Frango Grelhado",21.90));
        menu.add(new Produto(1,"Baby Beef á Fiorentina",29.90));
        menu.add(new Produto(1,"Coração de Frango",20.90));
        menu.add(new Produto(1,"Cupim",24.90));
        menu.add(new Produto(1,"Linguiça Caseira",18.90));
        menu.add(new Produto(1,"Frango(Filé da coxa dessossado)",17.90));
        menu.add(new Produto(1,"Paleta de Cordeiro",39.90));
         //preenchendo as sobremesas
        menu.add(new Produto(1,"Fatias Frutas da Estação (Mamão, Melão e Abacaxi)",12.90));
        menu.add(new Produto(1,"Caçarola Italiana",10.90));
        menu.add(new Produto(1,"Pudim de Leite",3.90));
        menu.add(new Produto(1,"Banana Split",7.90));
        menu.add(new Produto(1,"Bolo Spumone",20.90));
        menu.add(new Produto(1,"Bolo Nevado",24.90));
        menu.add(new Produto(1,"Bolo Sonho de Maracujá",28.90));
        menu.add(new Produto(1,"Bolo Floresta Silvestre",27.90));
        menu.add(new Produto(1,"Bolo Crocante de Nozes",39.90));
        menu.add(new Produto(1,"Pavê de Chocolate",12.90));
        menu.add(new Produto(1,"Pavê de Nozes",10.90));
        menu.add(new Produto(1,"Pavê Sonho de Valsa",16.90));
        menu.add(new Produto(1,"Torta Mousse de Maracujá",18.90));
        menu.add(new Produto(1,"Torta de Mousse Chocolate",17.90));
        menu.add(new Produto(1,"Torta de Limão",13.90));
        menu.add(new Produto(1,"Torta de Morango",14.90));
        menu.add(new Produto(1,"Torta de Côco",44.90));
        menu.add(new Produto(1,"Torta Papaia com Cassis",29.90));
        menu.add(new Produto(1,"Torta Holandesa gde.",24.90));
        menu.add(new Produto(1,"Torta Holandesa pe.",15.90));
        menu.add(new Produto(1,"Profiterólis grande",25.90));
         //preenchendo as bebidas quentes
        menu.add(new Produto(1,"Café pequeno",2.90));
        menu.add(new Produto(1,"Café médio",3.90));
        menu.add(new Produto(1,"Capuccino pequeno",3.90));
        menu.add(new Produto(1,"Capuccino médio",7.90));
        menu.add(new Produto(1,"Chá",2.90));
        menu.add(new Produto(1,"Ballantimes",29.90));
        menu.add(new Produto(1,"Black Label",42.90));
        menu.add(new Produto(1,"Chivas",44.90));
        menu.add(new Produto(1,"Dimple",29.90));
        //preenchendo as bebidas frias
        menu.add(new Produto(1,"Água",1.90));
        menu.add(new Produto(1,"Cerveja",3.90));
        menu.add(new Produto(1,"Refrigerantes",5.90));
        menu.add(new Produto(1,"Sucos",7.90));
        menu.add(new Produto(1,"Amarula",5.90));
        menu.add(new Produto(1,"Licores",3.90));
        menu.add(new Produto(1,"Vinhos Nacionais",14.90));
        DefaultListModel menus = new DefaultListModel();
        Iterator<Produto> i = menu.iterator();
        while(i.hasNext()){
            menus.addElement(i.next().toString());
        }
        mg.preencherList(menus);
    }
   private void preencherMesas(){
        for(int i = 0; i<20; i++)
            {vagas.addElement(i);}
        jList1.setModel(vagas);
        jList2.setModel(ocupadas);
        jList4.setModel(consumo);
   }
   private void atualizar(){
        Iterator<Produto> i =(mesa.getElement(Integer.parseInt(jTextField3.getText()))).iterator();
         consumo.clear();
         while(i.hasNext()){consumo.addElement(i.next().toString());}
        jList4.setModel(consumo);
        jTextField1.setText(jTextField3.getText());
        jTextField2.setText(
                String.valueOf(
                    mesa.totalLista(Integer.parseInt(jTextField3.getText()))
                )
        );
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atividade restaurante - Lucas Biason");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disposição de mesas:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 31767));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mesas Disponíveis:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mesas Ativas:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane2.setViewportView(jList2);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecionar mesa:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/7876_32x32.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/7837_64x64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consumo por mesa:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 31767));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conta:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total a Pagar:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mesa:");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/6960_64x64.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/4026_32x32.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pagar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(109, 109, 109))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/7411_64x64.png"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/7695_32x32.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/images/7688_32x32.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        //pega a mesa selecionada e transfere para a lista de ocupados
        int oc = Integer.parseInt(jList1.getSelectedValue().toString());
        vagas.removeElement(oc);
        ocupadas.addElement(oc);
        jList1.setModel(vagas);
        jList2.setModel(ocupadas);
        
        mg.setMesaAtual(oc);
        mg.setVisible(true);
    }//GEN-LAST:event_jList1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try{
            atualizar();
        }catch(IndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(null,"Selecione uma mesa válida.","ERRO!",JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Entrada inválida. Digite o número da mesa.","ERRO!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try{
            MesaGUI.mesa.withdraw(Integer.parseInt(jTextField3.getText()),jList4.getSelectedIndex());
            atualizar();
        }catch(IndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(null,"Para excluir um item é preciso selecioná-lo da lista","ERRO!",JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Para excluir um item é preciso, primeiro, selecionar uma mesa.","ERRO!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        mg.setMesaAtual(Integer.parseInt(jTextField3.getText())); 
        mg.setVisible(true);
        consumo.clear();
        jList4.setModel(consumo);

        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        int ob = Integer.parseInt(jTextField3.getText());
        Paga p = new Paga(MesaGUI.mesa.getTotalMesa(ob),MesaGUI.mesa.totalLista(ob));
        p.setVisible(true);


        MesaGUI.mesa.clearTable(ob);
        ocupadas.removeElement(ob);
        vagas.addElement(ob);
        jList1.setModel(vagas);
        jList2.setModel(ocupadas);
        consumo.clear();
        jList4.setModel(consumo);
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jLabel7MousePressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
