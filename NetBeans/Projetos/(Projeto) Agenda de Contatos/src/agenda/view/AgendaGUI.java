package agenda.view;

import agenda.dao.ContatoDao;
import agenda.model.Contato;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class AgendaGUI extends javax.swing.JFrame {

    //para mandar para a tbela de consulta
    DefaultTableModel tmc = new DefaultTableModel(null, new String[]{"ID", "Nome", "Endereço", "Telefone"});
    List<Contato> c;
    ListSelectionModel lsc;
    int autorizado=1;

    public AgendaGUI() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        try {
            listarContatos();
        } catch (SQLException ex) {
            Logger.getLogger(AgendaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTsexo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLnovo = new javax.swing.JLabel();
        jLalterar = new javax.swing.JLabel();
        jLexcluir = new javax.swing.JLabel();
        jLsalvar = new javax.swing.JLabel();
        jLsair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), " Contatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jTid.setEditable(false);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        jTtelefone.setEditable(false);

        jTendereco.setEditable(false);

        jTnome.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        jTemail.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        jTsexo.setEditable(false);

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jTtelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTemail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .add(jTendereco, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(jTnome, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTsexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTnome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTsexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jTendereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTtelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome a ser");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/ok.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("pesquisado:");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel8)
                            .add(jLabel7)))
                    .add(jLabel9))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .add(11, 11, 11))
        );

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(tmc);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsc = jTable1.getSelectionModel();
        lsc.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting())getRegistroSelecionado(jTable1);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/novo.png"))); // NOI18N
        jLnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLnovoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLnovoMouseExited(evt);
            }
        });
        jLnovo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLnovoMouseMoved(evt);
            }
        });

        jLalterar.setBackground(new java.awt.Color(153, 153, 153));
        jLalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/altera.png"))); // NOI18N
        jLalterar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLalterarMouseMoved(evt);
            }
        });
        jLalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLalterarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLalterarMouseExited(evt);
            }
        });

        jLexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/excluir.png"))); // NOI18N
        jLexcluir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLexcluirMouseMoved(evt);
            }
        });
        jLexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLexcluirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLexcluirMouseExited(evt);
            }
        });

        jLsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/salvar.png"))); // NOI18N
        jLsalvar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLsalvarMouseMoved(evt);
            }
        });
        jLsalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsalvarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLsalvarMouseExited(evt);
            }
        });

        jLsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/view/sair.png"))); // NOI18N
        jLsair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLsairMouseMoved(evt);
            }
        });
        jLsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLsairMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLalterar)
                    .add(jLexcluir)
                    .add(jLnovo)
                    .add(jLsalvar)
                    .add(jLsair))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jLnovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLalterar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLexcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLsalvar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLsair)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setIcon(new ImageIcon(getClass().getResource("ok2.png")));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new ImageIcon(getClass().getResource("ok.png")));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLnovoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLnovoMouseMoved
        jLnovo.setIcon(new ImageIcon(getClass().getResource("novo1.png")));
    }//GEN-LAST:event_jLnovoMouseMoved

    private void jLnovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLnovoMouseExited
        jLnovo.setIcon(new ImageIcon(getClass().getResource("novo.png")));
    }//GEN-LAST:event_jLnovoMouseExited

    private void jLalterarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLalterarMouseMoved
        jLalterar.setIcon(new ImageIcon(getClass().getResource("altera1.png")));
    }//GEN-LAST:event_jLalterarMouseMoved

    private void jLalterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLalterarMouseExited
        jLalterar.setIcon(new ImageIcon(getClass().getResource("altera.png")));
    }//GEN-LAST:event_jLalterarMouseExited

    private void jLexcluirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseMoved
        jLexcluir.setIcon(new ImageIcon(getClass().getResource("excluir1.png")));
    }//GEN-LAST:event_jLexcluirMouseMoved

    private void jLexcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseExited
        jLexcluir.setIcon(new ImageIcon(getClass().getResource("excluir.png")));
    }//GEN-LAST:event_jLexcluirMouseExited

    private void jLsalvarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalvarMouseMoved
        jLsalvar.setIcon(new ImageIcon(getClass().getResource("salvar1.png")));
    }//GEN-LAST:event_jLsalvarMouseMoved

    private void jLsalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalvarMouseExited
        jLsalvar.setIcon(new ImageIcon(getClass().getResource("salvar.png")));
    }//GEN-LAST:event_jLsalvarMouseExited

    private void jLsairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsairMouseMoved
        jLsair.setIcon(new ImageIcon(getClass().getResource("sair1.png")));
    }//GEN-LAST:event_jLsairMouseMoved

    private void jLsairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsairMouseExited
        jLsair.setIcon(new ImageIcon(getClass().getResource("sair.png")));
    }//GEN-LAST:event_jLsairMouseExited

    private void jLnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLnovoMouseClicked
        limparCampos();
        habilitarCampos(true);
        autorizado=0;
    }//GEN-LAST:event_jLnovoMouseClicked

    private void jLsalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalvarMouseClicked
        //cria um novo contato e o adiciona no banco de dados.
        if(autorizado == 1)return;
        if (verificaDados()) {
            try {
                Contato c1 = new Contato(
                        jTnome.getText(),
                        jTendereco.getText(),
                        jTtelefone.getText(),
                        jTemail.getText(),
                        jTsexo.getText());//criando o contato
                ContatoDao cd = new ContatoDao();
                cd.add(c1);
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso.");
                listarContatos();
                habilitarCampos(false);
                autorizado=1;
            } catch (SQLException ex) {
                Logger.getLogger(AgendaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//cadastra apenas se os dados estuverem tds escritos.

    }//GEN-LAST:event_jLsalvarMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            listarContatos();
            jTextField1.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(AgendaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseClicked
        if (jTable1.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(this, "deseja realmente excluir este contato?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_NO_OPTION) {
                try {
                    ContatoDao d = new ContatoDao();
                    d.remove(c.get(jTable1.getSelectedRow()));
                    listarContatos();
                } catch (SQLException ex) {
                    Logger.getLogger(AgendaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
                JOptionPane.showMessageDialog(null, "Selecione um contato a ser excluido na lista.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLexcluirMouseClicked

    private void jLsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsairMouseClicked
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
           JOptionPane.showMessageDialog(this, "Obrigado por usar o nosso programa.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
           dispose();
        }
    }//GEN-LAST:event_jLsairMouseClicked

    private void jLalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLalterarMouseClicked
        if (jTable1.getSelectedRow() != -1) {
            try {
                if(verificaDados()){
                    Contato c = new Contato();
                    ContatoDao d = new ContatoDao();
                    c.setId(Long.valueOf(jTid.getText()));
                    c.setNome(jTnome.getText());
                    c.setEmail(jTemail.getText());
                    c.setEndereco(jTendereco.getText());
                    c.setSexo(jTsexo.getText());
                    c.setTelefone(jTtelefone.getText());
                    d.altera(c);
                    JOptionPane.showMessageDialog(this, "atualizado com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    listarContatos();
                    habilitarCampos(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AgendaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jLalterarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AgendaGUI().setVisible(true);
            }
        });
    }

    //métodos criados
    private void limparCampos() {
        //Limpando os campos
        jTnome.setText("");
        jTemail.setText("");
        jTtelefone.setText("");
        jTid.setText("");
        jTendereco.setText("");
        jTsexo.setText("");
    }
    private void habilitarCampos(boolean b) {
        jTnome.setEditable(b);
        jTendereco.setEditable(b);
        jTtelefone.setEditable(b);
        jTemail.setEditable(b);
        jTsexo.setEditable(b);
    }
    private void mostrarPesquisa(List<Contato> contatos){
        while(tmc.getRowCount()>0) tmc.removeRow(0);
        if(contatos.size()==0){
            JOptionPane.showMessageDialog(null,"Nenhum registro encontrado.");
        }else{
            String[] linha = new String[]{null,null,null,null};
            for (int i = 0; i < contatos.size(); i++) {
                tmc.addRow(linha);
                tmc.setValueAt(contatos.get(i).getId(),i,0);
                tmc.setValueAt(contatos.get(i).getNome(),i,1);
                tmc.setValueAt(contatos.get(i).getEndereco(),i,2);
                tmc.setValueAt(contatos.get(i).getTelefone(),i,3);
            }
        }
    }
    private void listarContatos() throws SQLException{
        ContatoDao dao = new ContatoDao();
        c = dao.getLista("%"+jTextField1.getText()+"%");
        mostrarPesquisa(c);
    }
    private boolean verificaDados() {
        if (!jTnome.getText().equals("") && !jTendereco.getText().equals("") && !jTtelefone.getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Um ou mais dos campos obrigatórios não foram preenchidos.\n" +
                                                "Favor preencher nome, endereço e telefone corretamente.",
                                                "Erro!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private void getRegistroSelecionado(JTable t){
        if (jTable1.getSelectedRow() != -1) {
            habilitarCampos(true);
            jTid.setText(String.valueOf(c.get(t.getSelectedRow()).getId()));
            jTnome.setText(c.get(t.getSelectedRow()).getNome());
            jTendereco.setText(c.get(t.getSelectedRow()).getEndereco());
            jTemail.setText(c.get(t.getSelectedRow()).getEmail());
            jTsexo.setText(c.get(t.getSelectedRow()).getSexo());
            jTtelefone.setText(c.get(t.getSelectedRow()).getTelefone());
        } else limparCampos();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLalterar;
    private javax.swing.JLabel jLexcluir;
    private javax.swing.JLabel jLnovo;
    private javax.swing.JLabel jLsair;
    private javax.swing.JLabel jLsalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTsexo;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
