package OtimizadordeAutomatos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

//painel de visualiza__o que guarda os estados e suas transi__o graficamente
public class JPanelVisualizacao extends javax.swing.JPanel{

	    private AutomatoGUI janelaPrincipal; //referencia a janela principal 
	    
	    public JPanelVisualizacao( AutomatoGUI janelaPrincipal ) {
	        initComponents();
	        setBackground( Color.WHITE );
	        this.janelaPrincipal = janelaPrincipal;
	    }
        
	    private void initComponents() {
           addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
	            public void mousePressed(java.awt.event.MouseEvent evt) {
	                formMousePressed(evt);
	            }
	        });
	        setLayout(null);
	    }

	    //evento quando o painel for clicado
	    private void formMousePressed(java.awt.event.MouseEvent evt) {
	       janelaPrincipal.selecionaEstadoAtual(null); //nenhum estado _ selecionado
	       repaint();
	    }

    @Override
	    protected void paintComponent( Graphics g ) {
	        super.paintComponent( g );
	        Graphics2D g2d = ( Graphics2D ) g; //objeto grafico que desenha o painel
	        g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON ); // liga o antialiasing
	        g2d.setPaint( Color.BLACK ); //cor preta como padr_o para as linhas
	        FontMetrics fm = g2d.getFontMetrics(); //objeto usado para os caracteres escritos
	        g2d.draw( new Rectangle2D.Double( 0, 0, getWidth() - 1, getHeight() - 1 ) ); //desenha o fundo do painel
	        
	        
	        //desenha a sele__o, quando um estado for clicado ele fica com um efeito atr_s
            if ( janelaPrincipal.getEstadoAtual() != null ) { //apenas _ selecionado se n_o for nulo
	            g2d.setPaint( new Color( 255, 204, 204 ) );   //seleciona a cor da sele__o
	            //desenha a elipse que da o efeito ao estado selecionado
	            g2d.fill( new Ellipse2D.Double(  
	            		janelaPrincipal.getEstadoAtual().getXCentral() - 29, janelaPrincipal.getEstadoAtual().getYCentral() - 29, 58, 58 ) );
	        }
	        
	        g2d.setPaint( Color.BLACK ); //retorna a cor original
	        
	        //Desenha as transi__es entre estados para cada estado do automato
	        for ( Estado e : janelaPrincipal.a.getEstados()) {
	        	
                 //Dois tipos de transi__es possiveis: 
	        	 //Entre dois estados diferentes : ele desenha uma reta
	        	 //Para si proprio: Ele desenha um arco
	        	
	        	 for(Character c : e.transicoes.keySet()){
	                 Estado destino = e.transicoes.get(c).get(0);
	                
	                // se estado origem e destino s_o diferentes, tra_a a reta
	                if ( !destino.equals(e)) {
	                	// desenha a linha de liga__o
	                    g2d.draw( new Line2D.Double( e.getXCentral(), e.getYCentral(),  destino.getXCentral(),destino.getYCentral() ) );
	                    // desenha o s_mbolo da liga__o
	                    String simbolos = c+"";
	                    int meiaLargSimbolos = fm.stringWidth( simbolos ) / 2; // o simbolo _ posicionado no meio da reta
	                    g2d.drawString( simbolos,
	                            e.getXCentral() + ( ( destino.getXCentral() - e.getXCentral() ) / 2 ) - meiaLargSimbolos,
	                            e.getYCentral() + ( ( destino.getYCentral() - e.getYCentral() ) / 2 ) - 5 );
	                    // gera a hipotenusa
	                    double h = Utils.gerarHipotenusa( e.getXCentral(), e.getYCentral(), destino.getXCentral(),destino.getYCentral() );
	                    // gera o grau relativo entre os estados
	                    double gr = Utils.obtemGrauRelativoJava( e.getXCentral(), e.getYCentral(), destino.getXCentral(), destino.getYCentral() );
	                    // calcula o x e y do in_cio da flecha
	                    // sendo que h deve ser subtraido do raio do estado que no caso
	                    // _ 25, pois a flecha deve ser desenhada na borda do estado
	                    double x = ( h - 25 ) * Math.cos( Math.toRadians( gr ) );
	                    double y = ( h - 25 ) * Math.sin( Math.toRadians( gr ) );
	                    // desenha a flecha
	                    Graphics2D g2df = ( Graphics2D ) g2d.create(); // cria um novo Graphics a partir do original
	                    g2df.translate( x + e.getXCentral(), y + e.getYCentral()); // faz a transla__o para a coordenada que deve ser a origem
	                    g2df.rotate( Math.toRadians( gr ) ); // rotaciona usando o grau relativo
	                    // desenha a flecha
	                    g2df.draw( new Line2D.Double( 0, 0, -5, -5 ) );
	                    g2df.draw( new Line2D.Double( 0, 0, -5, 5 ) );
	                    // libera o graphics, n_o sendo necess_rio voltar a transla__o nem a rota__o
	                    g2df.dispose();
	                } else { 
	                	// caso contr_rio, desenha arco
	                    g2d.draw( new Ellipse2D.Double(  e.getXCentral(), e.getYCentral() - 40, 30, 30 ) );      
	                    // desenha a flecha
	                    g2d.draw( new Line2D.Double( e.getXCentral() + 21, e.getYCentral() - 11,   e.getXCentral() + 30, e.getYCentral() - 11 ) );
	                    g2d.draw( new Line2D.Double(  e.getXCentral() + 22, e.getYCentral() - 11,  e.getXCentral() + 21, e.getYCentral() - 20 ) );
	                    // desenha o s_mbolo da liga__o
	                    g2d.drawString( c+"",  e.getXCentral() + 15, e.getYCentral() - 45 );
	                }
	                
	            }
	            
	        }
	        
	    }
	    
	    

}
