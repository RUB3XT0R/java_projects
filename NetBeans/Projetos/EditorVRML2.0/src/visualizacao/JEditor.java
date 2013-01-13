/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao;

import editorvrml.ClassesDoPacote;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import modelo.FiguraGeometrica;
import modelo.Imagem;
import modelo.Ponto;
import serializacao.GravadorImagem;

/**
 *
 * @author Lucas
 */
public class JEditor extends javax.swing.JFrame {

    //modelo combo tipos
    private DefaultComboBoxModel<String> cmodel = new DefaultComboBoxModel<>();
    //modelo combo figs
    private DefaultListModel<FiguraGeometrica> listaFigs = new DefaultListModel<>();
    //lista de pontos
    private DefaultListModel<Ponto> listPonto = new DefaultListModel<>();
    private Imagem img;

    public JEditor() {
        initComponents();
        cmodel.addElement("---");
        for (Class c : new ClassesDoPacote().getClasses()) {
            cmodel.addElement(c.getSimpleName());
        }
        jPanel1.setSize(1000,1000);
        jPanel1.setBackground(Color.red);
        img = new Imagem(jPanel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        classesFigs = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        layers = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPontoCentral = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaponts = new javax.swing.JList();
        colorButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalvar = new javax.swing.JMenuItem();
        menuGravar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuTranslacao = new javax.swing.JMenuItem();
        menuEscala = new javax.swing.JMenuItem();
        menuRotacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Criar novo:");

        classesFigs.setModel(cmodel);
        classesFigs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesFigsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(classesFigs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classesFigs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Layers:");

        layers.setModel(listaFigs);
        layers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layersMouseClicked(evt);
            }
        });
        layers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                layersValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(layers);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Propriedades:");

        jLabel8.setText("Nome:");

        txtNome.setEditable(false);

        jLabel9.setText("Ponto Central:");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Pontos:");

        listaponts.setModel(listPonto);
        jScrollPane1.setViewportView(listaponts);

        colorButton.setText("Modificar Cor");
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPontoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(colorButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPontoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorButton)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        menuSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSalvar.setBackground(new java.awt.Color(255, 255, 255));
        menuSalvar.setText("Salvar");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalvar);

        menuGravar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuGravar.setBackground(new java.awt.Color(255, 255, 255));
        menuGravar.setText("Gerar VRML");
        menuGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGravarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGravar);

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Desfazer");
        jMenu2.add(jMenuItem4);

        menuExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuExcluir.setBackground(new java.awt.Color(255, 255, 255));
        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(menuExcluir);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.add(jSeparator1);

        menuTranslacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuTranslacao.setBackground(new java.awt.Color(255, 255, 255));
        menuTranslacao.setText("Translação");
        menuTranslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTranslacaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuTranslacao);

        menuEscala.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEscala.setBackground(new java.awt.Color(255, 255, 255));
        menuEscala.setText("Escala");
        menuEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEscalaActionPerformed(evt);
            }
        });
        jMenu2.add(menuEscala);

        menuRotacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuRotacao.setBackground(new java.awt.Color(255, 255, 255));
        menuRotacao.setText("Rotação");
        menuRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRotacaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuRotacao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classesFigsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesFigsActionPerformed
        String classe = classesFigs.getSelectedItem().toString();
        if ("---".equals(classe)) {
            return;
        }
        img.add(classe);
        listaFigs.addElement(img.getAtual());

    }//GEN-LAST:event_classesFigsActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        if (getImg().getAtual() == null) {
            return;
        }
        listaFigs.removeElement(getImg().getAtual());
        img.remove();
        limpar();
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuTranslacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTranslacaoActionPerformed
        if (getImg().getAtual() == null) {
            return;
        }
        new JTranslacao(this).setVisible(true);
    }//GEN-LAST:event_menuTranslacaoActionPerformed

    private void layersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_layersValueChanged
        //img.setAtual((FiguraGeometrica) layers.getSelectedValue());
        //atualizaObjeto();
    }//GEN-LAST:event_layersValueChanged

    private void menuEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEscalaActionPerformed
        if (getImg().getAtual() == null) {
            return;
        }
        new JEscala(this).setVisible(true);
    }//GEN-LAST:event_menuEscalaActionPerformed

    private void menuRotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRotacaoActionPerformed
        if (getImg().getAtual() == null) {
            return;
        }
        new JRotacao(this).setVisible(true);
    }//GEN-LAST:event_menuRotacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] pts = txtPontoCentral.getText().split(";");
        img.getAtual().getPontoCentral().setX(Integer.parseInt(pts[0]));
        img.getAtual().getPontoCentral().setY(Integer.parseInt(pts[1]));
        img.getAtual().calculaPontos();
        img.draw();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGravarActionPerformed
        new GravadorImagem().gravarVRML(img);
    }//GEN-LAST:event_menuGravarActionPerformed

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        new GravadorImagem().gravarImagem(img);
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja abrir outro arquivo?\n"
                + "As alterações no atual não serão salvos.",
                "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == 1) {
            return;
        }
        limpar();
        listaFigs.removeAllElements();
        img = new GravadorImagem().lerImagem();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void layersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layersMouseClicked
        if (layers.getSelectedIndex() != -1) {
            img.setAtual((FiguraGeometrica) layers.getSelectedValue());
            atualizaObjeto();
        }
    }//GEN-LAST:event_layersMouseClicked

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        Color c = JColorChooser.showDialog(
                        JEditor.this, "Modifique a cor...", getBackground());
                if (c != null) {
                    img.getAtual().setColor(c);
                }
                img.draw();
    }//GEN-LAST:event_colorButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox classesFigs;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JList layers;
    private javax.swing.JList listaponts;
    private javax.swing.JMenuItem menuEscala;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuGravar;
    private javax.swing.JMenuItem menuRotacao;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JMenuItem menuTranslacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontoCentral;
    // End of variables declaration//GEN-END:variables

    //private JButton colorButton = new JButton("Choose a color...");
    
    
    public void atualizaObjeto() {
        txtNome.setText(img.getAtual().getNome());
        txtPontoCentral.setText(img.getAtual().getPontoCentral().getX() + ";" + img.getAtual().getPontoCentral().getY());
        listPonto.clear();
        for (Ponto p : img.getAtual().getPontos()) {
            listPonto.addElement(p);
        }

    }

    private void limpar() {
        txtNome.setText("");
        txtPontoCentral.setText("");
        listPonto.clear();
    }

    
    protected void createUI() {
        setSize(400, 400);
        setLocation(100, 100);
        getContentPane().setLayout(new GridBagLayout());
        getContentPane().add(colorButton);
        colorButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Color c = JColorChooser.showDialog(
                        JEditor.this, "Modifique a cor...", getBackground());
                if (c != null) {
                    img.getAtual().setColor(c);
                }
                img.draw();
            }
        });
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    
    
    
    public DefaultComboBoxModel<String> getCmodel() {
        return cmodel;
    }

    public void setCmodel(DefaultComboBoxModel<String> cmodel) {
        this.cmodel = cmodel;
    }

    public Imagem getImg() {
        return img;
    }

    public void setImg(Imagem img) {
        this.img = img;
    }

    public DefaultListModel<Ponto> getListPonto() {
        return listPonto;
    }

    public void setListPonto(DefaultListModel<Ponto> listPonto) {
        this.listPonto = listPonto;
    }

    public JList getListaponts() {
        return listaponts;
    }

    public void setListaponts(JList listaponts) {
        this.listaponts = listaponts;
    }

    public JList getLayers() {
        return layers;
    }

    public void setLayers(JList layers) {
        this.layers = layers;
    }

    public DefaultListModel<FiguraGeometrica> getListaFigs() {
        return listaFigs;
    }

    public void setListaFigs(DefaultListModel<FiguraGeometrica> listaFigs) {
        this.listaFigs = listaFigs;
    }
}
