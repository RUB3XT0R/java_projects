/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Sobre.java
 *
 * Created on 18/03/2010, 22:01:06
 */

package visao;

/**
 *
 * @author Lucas Biason
 */
public class Sobre extends javax.swing.JFrame {

    /** Creates new form Sobre */
    public Sobre() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre...");
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Exercícios de Entrada e Saida");
        jLabel2.setBounds(70, 20, 250, 15);
        jLayeredPane3.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Versão 3.0 - feita em java para a matéria de ");
        jLabel3.setBounds(70, 40, 250, 14);
        jLayeredPane3.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Conceitos de Linguagem de programação.");
        jLabel4.setBounds(70, 60, 250, 14);
        jLayeredPane3.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/onion.gif"))); // NOI18N
        jLabel7.setBounds(10, 20, 60, 60);
        jLayeredPane3.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Profº: Sidney");
        jLabel6.setBounds(10, 80, 310, 14);
        jLayeredPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Autor: Lucas Biason  Ra: 5495-1");
        jLabel5.setBounds(10, 100, 310, 14);
        jLayeredPane3.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data: 18/03/2010");
        jLabel8.setBounds(10, 120, 310, 14);
        jLayeredPane3.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(20, 20, 330, 150);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fundo.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 370, 190);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 370, Short.MAX_VALUE)
            .add(0, 370, Short.MAX_VALUE)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 189, Short.MAX_VALUE)
            .add(0, 189, Short.MAX_VALUE)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    // End of variables declaration//GEN-END:variables

}
