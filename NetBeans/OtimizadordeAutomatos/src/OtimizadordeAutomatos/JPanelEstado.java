package OtimizadordeAutomatos;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

//representa o estado
public class JPanelEstado extends javax.swing.JPanel {

	private boolean isInicial;  //representa se o estado _ inicial
    private Estado estado;      //o proprio estado
    private int larguraFlecha;  //variavel auxiliar para a largura flecha que muda de acordo com o estado ser incial ou n_o.
    private boolean clicado;    // flag para indicar se o estado est_ selecionado
    private AutomatoGUI janelaPrincipal;
    
    public JPanelEstado( Estado estado, AutomatoGUI janelaPrincipal ) {
        this.isInicial= janelaPrincipal.a.getInicial().equals(estado);
        this.estado = estado;
        this.janelaPrincipal = janelaPrincipal;
        larguraFlecha = isInicial ? 20 : 0; //se o estado for inicial, a largura ser_ 10, sen_o 0
        setSize( new Dimension( 50 + larguraFlecha, 50 ) ); //a tamanho do painel _ dado pelo tamanho do circulo do estado mais o da flecha
        setBackground( new Color( 0, 0, 0, 0 ) );
        //setBackground(Color.white);
        initComponents();
    }

    private void initComponents() {
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) { formMousePressed(evt); }
            public void mouseReleased(java.awt.event.MouseEvent evt) {  formMouseReleased(evt);  }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) { formMouseDragged(evt);  }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGap(0, 400, Short.MAX_VALUE) );
        layout.setVerticalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGap(0, 300, Short.MAX_VALUE) );
    }

    //evento que move o estado ao ser arrastado pelo painel
    private void formMouseDragged(java.awt.event.MouseEvent evt) {
    if ( getParent() != null ) {
    	//seta a localiza__o do estado enquanto _ arrastado
        int x = ( int ) getParent().getMousePosition().getX() - getWidth() / 2;
        int y = ( int ) getParent().getMousePosition().getY() - getHeight() / 2;
       
        if ( getX() + getWidth() > getParent().getWidth() ) 
            x = getParent().getWidth() - getWidth() - 2;
        if ( getX() < 0 )  x = 0; // n_o permite que o estado fique fora da regi_o do painel
        
        if ( getY() + getHeight() > getParent().getHeight() )
            y = getParent().getHeight() - getHeight() - 2;
        if ( getY() < 0 )  y = 0; // n_o permite que o estado fique fora da regi_o do painel
        
        estado.setXCentral(x);
        estado.setYCentral(y);
        setLocation( x, y );

        // coordenadas para desenho das transi__es enquanto ele _ arrastado
        if ( isInicial ) {
            estado.setXCentral( x + ( larguraFlecha / 2 ) + ( getWidth() / 2 ) );
            estado.setYCentral( y + ( getHeight() / 2 ) );
        } else {
            estado.setXCentral( x + ( getWidth() / 2 ) );
            estado.setYCentral( y + ( getHeight() / 2 ) );
        }

        // repinta o container pai, fazendo com as transi__es sejam desenhadas
        getParent().repaint();
    
     }
    }

    //evento que seleciona o estado clicado
    private void formMousePressed(java.awt.event.MouseEvent evt) {
       janelaPrincipal.selecionaEstadoAtual(estado); //faz com que o estado clicado seja o atual na janela principal
       clicado = true; //mostra que ele esta sendo clicado
       repaint();
    }
    
    //evento que o estado _ solto
    private void formMouseReleased(java.awt.event.MouseEvent evt) {
       clicado = false; 
       repaint();
    }

    @Override
    protected void paintComponent( Graphics g ) {
        super.paintComponent( g );
        
        Graphics2D g2d = ( Graphics2D ) g;
        g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        
        //se estiver clicado, a cor do fundo do automato se altera
        g2d.setPaint( clicado ? new Color( 220, 245, 255 ) : Color.WHITE );
        //desenha o fundo
        g2d.fill( new Ellipse2D.Double( larguraFlecha, 0,   this.getWidth() - larguraFlecha, getHeight() ) );
        //se estiver clicado, a cor da borda do automato se altera
        g2d.setPaint( clicado ? new Color( 0, 102, 153 ) : Color.BLACK );
        //desenha a borda
        g2d.draw( new Ellipse2D.Double( larguraFlecha, 0, this.getWidth() - ( larguraFlecha + 1 ), getHeight() - 1  ) );
        
        //se for incial, haver_ um desenho, o da seta que represneta o estado incial
        if ( isInicial ) {
            g2d.draw( new Line2D.Double( 0, getHeight() / 2,  larguraFlecha, getHeight() / 2  ) );
            g2d.draw( new Line2D.Double( larguraFlecha - 5, ( getHeight() / 2 ) - 5, larguraFlecha, getHeight() / 2  ) );
            g2d.draw( new Line2D.Double( larguraFlecha - 5, ( getHeight() / 2 ) + 5, larguraFlecha, getHeight() / 2  ) );
        }
        
        //se for final, haver_ um outro circulo concentrico representando o estado final
        if ( estado.isFinal() ) {
            g2d.draw( new Ellipse2D.Double( larguraFlecha + 5, 5, this.getWidth() - ( larguraFlecha + 11 ), getHeight() - 11 ) );
        }
        //por ultimo o nome do estado
        FontMetrics fm = g2d.getFontMetrics();
        g2d.drawString( estado.toString(), 
        		larguraFlecha + ( 50 / 2 ) - ( fm.stringWidth( estado.getNome() ) / 2 ), ( getHeight() / 2 ) + ( fm.getHeight() / 3 ) );
        
    }
    
    

}
