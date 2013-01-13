
package visao;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Algoritmos;

public class Exe17 extends javax.swing.JFrame {

    Algoritmos al =new Algoritmos();
    public Exe17() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercício 17");
        setResizable(false);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entre com Três valores:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextField3.setText("0.0");
        jTextField3.setBounds(70, 80, 80, 20);
        jLayeredPane3.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setText("0.0");
        jTextField1.setBounds(70, 20, 80, 20);
        jLayeredPane3.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField2.setText("0.0");
        jTextField2.setBounds(70, 50, 80, 20);
        jLayeredPane3.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor 1:");
        jLabel7.setBounds(10, 20, 37, 14);
        jLayeredPane3.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor 2:");
        jLabel6.setBounds(10, 50, 37, 14);
        jLayeredPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor 3:");
        jLabel5.setBounds(10, 80, 37, 14);
        jLayeredPane3.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(20, 30, 170, 120);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Exercício 17) Triângulo ou não:");
        jLabel9.setBounds(10, 0, 330, 20);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setBounds(71, 80, 120, 20);
        jLayeredPane5.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Área:");
        jLabel4.setBounds(20, 80, 50, 14);
        jLayeredPane5.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jLabel3.setBounds(20, 50, 50, 14);
        jLayeredPane5.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField5.setEditable(false);
        jTextField5.setBounds(71, 50, 120, 20);
        jLayeredPane5.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField4.setEditable(false);
        jTextField4.setBounds(21, 20, 170, 20);
        jLayeredPane5.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/defaul.png"))); // NOI18N
        jLabel2.setText("     ");
        jLabel2.setBounds(50, 110, 90, 80);
        jLayeredPane5.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBounds(200, 30, 210, 210);
        jLayeredPane1.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/Untitled-3.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jLabel10.setBounds(10, 40, 70, 20);
        jLayeredPane4.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        jLabel8.setBounds(10, 10, 70, 20);
        jLayeredPane4.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(60, 160, 90, 70);
        jLayeredPane1.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fundo1.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 420, 250);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 417, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setIcon(new ImageIcon(getClass().getResource("Untitled-4.png")));
}//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jTextField1.setText("0.0");
        jTextField2.setText("0.0");
        jTextField3.setText("0.0");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jLabel2.setIcon(new ImageIcon(getClass().getResource("defaul.png")));
}//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new ImageIcon(getClass().getResource("Untitled-3.png")));
}//GEN-LAST:event_jLabel10MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setIcon(new ImageIcon(getClass().getResource("Untitled-2.png")));
}//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try{
            DecimalFormat df =new DecimalFormat("#,###.00");
            float a=Float.parseFloat(jTextField1.getText());
            float b=Float.parseFloat(jTextField2.getText());
            float c=Float.parseFloat(jTextField3.getText());
            String imagem="";
            String tipo="";
            if(al.verificaExe17(a, b, c)){
                jTextField4.setText("Formam um triângulo.");
                if( (a==b)&&(a==c) ){
                    tipo+="Equilátero ";
                    imagem="equilatero.png";
                }else{
                    if( (c*c)==( (a*a) + (b*b) ) ){
                        tipo+="Retângulo ";
                        imagem="retangulo.png";
                    }else{
                        if( (a!=b)&&(a!=c)&&(b!=c) ){
                            tipo+="Escaleno ";
                            imagem="escaleno.png";
                        }else{
                            if( ( (a==b)&&(a!=c) ) || ( (b==c)&&(b!=a) ) || ( (a==c)&&(a!=b) ) ){
                                tipo+="Isóceles ";
                                imagem="isoceles.png";
                            }
                        }
                    }
                }
                jTextField5.setText(tipo);
                jTextField6.setText(String.valueOf(df.format(al.calculaExe17(a, b, c))));
                jLabel2.setIcon(new ImageIcon(getClass().getResource(imagem)));
            }else{
                jTextField4.setText("Não formam um triângulo.");
                jTextField5.setText("Inexistente");
                jTextField6.setText("Vazia");
                jLabel2.setIcon(new ImageIcon(getClass().getResource("nao.png")));
            }
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
                new Exe17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
