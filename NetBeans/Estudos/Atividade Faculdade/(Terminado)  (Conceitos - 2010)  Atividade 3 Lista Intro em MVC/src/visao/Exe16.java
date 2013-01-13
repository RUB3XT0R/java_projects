
package visao;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Algoritmos;

public class Exe16 extends javax.swing.JFrame {

     Algoritmos al =new Algoritmos();
    private int op=0;
    public Exe16() {
        initComponents();
        jRadioButton1.setSelected(true);
        jRadioButton1.setForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercício 16");

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Exercício 16) Médias a sua escolha:");
        jLabel9.setBounds(10, 0, 330, 20);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entre com a média desejada:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Aritmética: (a+b+c)/3");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.setBounds(10, 20, 123, 21);
        jLayeredPane5.add(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Ponderada: (a*3 + b*3 + c*4)/10");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.setBounds(10, 40, 179, 21);
        jLayeredPane5.add(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton3.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Harmônica: 3/(1/a +1/b +1/c)");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.setBounds(10, 60, 161, 21);
        jLayeredPane5.add(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBounds(160, 20, 210, 100);
        jLayeredPane1.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entre com as notas:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField1.setText("0.0");
        jTextField1.setBounds(70, 20, 60, 19);
        jLayeredPane3.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField2.setText("0.0");
        jTextField2.setBounds(70, 40, 60, 19);
        jLayeredPane3.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField3.setText("0.0");
        jTextField3.setBounds(70, 60, 60, 19);
        jLayeredPane3.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nota 3:");
        jLabel5.setBounds(10, 60, 33, 13);
        jLayeredPane3.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nota 2:");
        jLabel6.setBounds(10, 40, 33, 13);
        jLayeredPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nota 1:");
        jLabel10.setBounds(10, 20, 33, 13);
        jLayeredPane3.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(10, 20, 150, 100);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField4.setEditable(false);
        jTextField4.setBounds(200, 20, 130, 20);
        jLayeredPane4.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/Untitled-3.png"))); // NOI18N
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jLabel11.setBounds(100, 20, 70, 23);
        jLayeredPane4.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/Untitled-1.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jLabel8.setBounds(10, 20, 70, 23);
        jLayeredPane4.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A média é:");
        jLabel2.setBounds(200, 0, 130, 13);
        jLayeredPane4.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(10, 120, 340, 50);
        jLayeredPane1.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fundo.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 370, 190);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 369, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        op=0;
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton1.setForeground(Color.BLACK);
        jRadioButton2.setForeground(Color.WHITE);
        jRadioButton3.setForeground(Color.WHITE);
}//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        op=1;
        jRadioButton2.setSelected(true);
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton2.setForeground(Color.BLACK);
        jRadioButton1.setForeground(Color.WHITE);
        jRadioButton3.setForeground(Color.WHITE);
}//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        op=2;
        jRadioButton3.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(false);
        jRadioButton3.setForeground(Color.BLACK);
        jRadioButton1.setForeground(Color.WHITE);
        jRadioButton2.setForeground(Color.WHITE);
}//GEN-LAST:event_jRadioButton3MouseClicked

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
        jLabel11.setIcon(new ImageIcon(getClass().getResource("Untitled-4.png")));
}//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        op=0;
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jTextField4.setText("");
        jTextField1.setText("0.0");
        jTextField2.setText("0.0");
        jTextField3.setText("0.0");
        jRadioButton3.setForeground(Color.WHITE);
        jRadioButton1.setForeground(Color.BLACK);
        jRadioButton2.setForeground(Color.WHITE);
}//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new ImageIcon(getClass().getResource("Untitled-3.png")));
}//GEN-LAST:event_jLabel11MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setIcon(new ImageIcon(getClass().getResource("Untitled-2.png")));
}//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try{
            float nota1=Float.parseFloat(jTextField1.getText());
            float nota2=Float.parseFloat(jTextField2.getText());
            float nota3=Float.parseFloat(jTextField3.getText());
            DecimalFormat df =new DecimalFormat("#,###.00");
            jTextField4.setText(String.valueOf(df.format(al.calculaExe16(nota1, nota2, nota3, op))));
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null,"Você esqueceu de entrar com um dos valores ou digitou um tipo errado.","Erro",JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(new ImageIcon(getClass().getResource("Untitled-1.png")));
}//GEN-LAST:event_jLabel8MouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exe16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
