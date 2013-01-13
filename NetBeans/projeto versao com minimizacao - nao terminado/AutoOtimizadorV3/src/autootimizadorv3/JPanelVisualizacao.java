package autootimizadorv3;


import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

//painel de visualiza__o que guarda os estados EstOrigem suas transi__o graficamente
public class JPanelVisualizacao extends javax.swing.JPanel {

    private AutomatoGUI janelaPrincipal; //referencia a janela principal 

    public JPanelVisualizacao(AutomatoGUI janelaPrincipal) {
        initComponents();
        setBackground(Color.WHITE);
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
        janelaPrincipal.selecionaEstadoAtual(null); //nenhum estado é selecionado
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; //objeto grafico que desenha o painel
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // liga o antialiasing
        g2d.setPaint(Color.BLACK); //cor preta como padrão para as linhas
        FontMetrics fm = g2d.getFontMetrics(); //objeto usado para os caracteres escritos
        g2d.draw(new Rectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1)); //desenha o fundo do painel


        //desenha a seleção, quando um estado for clicado ele fica com um efeito atrás
        if (janelaPrincipal.getEstadoAtual() != null) { //apenas é selecionado se não for nulo
            g2d.setPaint(new Color(255, 204, 204));   //seleciona a cor da seleção
            //desenha a elipse que da o efeito ao estado selecionado
            double decr = janelaPrincipal.a.isInicial(janelaPrincipal.getEstadoAtual())?  19 : 29;
            g2d.fill(new Ellipse2D.Double(
                    janelaPrincipal.getEstadoAtual().getXCentral() - decr, 
                    janelaPrincipal.getEstadoAtual().getYCentral() - 29, 
                    58, 58));
        }

        g2d.setPaint(Color.BLACK); //retorna a cor original

        //Desenha as transições entre estados para cada estado do automato
        int flagSimbol=0;
        //flag simbol é usada para não permitir um caracter em cima de outro no desenho.
        for (Estado EstOrigem : janelaPrincipal.a.getEstados()) {

            //Dois tipos de transições possiveis: 
            //Entre dois estados diferentes : ele desenha uma reta
            //Para si proprio: Ele desenha um arco
            
            flagSimbol=0;
            for (Character c : EstOrigem.transicoes.keySet()) {
                for (Estado EstDestino : EstOrigem.transicoes.get(c)) {
                    // se estado origem EstOrigem EstDestino s_o diferentes, tra_a a reta
                    if (!EstDestino.equals(EstOrigem)) {
                        // -- desenha a linha de ligação  (xO,yO)-(xD,yD)
                        g2d.draw(new Line2D.Double(EstOrigem.getXCentral(), EstOrigem.getYCentral(), 
                                                   EstDestino.getXCentral(), EstDestino.getYCentral()));
                        // -- desenha o símbolo da ligação
                        //versão atual
                        //simbolo é posicionado de acordo com o mapa de posições - vide documentação
                        float xs = EstOrigem.getXCentral() ,  ys = EstOrigem.getYCentral();
                        double raiox = 30, raioy = 30;
                        xs = (float) ((EstOrigem.getXCentral()<EstDestino.getXCentral()) ? xs+raiox : xs-raiox);
                        ys = (float) ((EstOrigem.getYCentral()<EstDestino.getYCentral()) ? ys+raioy : ys-raioy);
                        if(EstOrigem.getYCentral()==EstDestino.getYCentral()) ys = EstOrigem.getYCentral() ;
                        if(EstOrigem.getXCentral()==EstDestino.getXCentral()) xs = EstOrigem.getXCentral() ;
                        g2d.drawString(c + "",xs+flagSimbol,ys);
                       //--Desenho das setas das retas
                        // gera a hipotenusa
                        double h = Utils.gerarHipotenusa(EstOrigem.getXCentral(), EstOrigem.getYCentral(), 
                                                         EstDestino.getXCentral(), EstDestino.getYCentral());
                        // gera o grau relativo entre os estados, para rotacionar a ponta da flecha
                        double gr = Utils.obtemGrauRelativoJava(EstOrigem.getXCentral(), EstOrigem.getYCentral(), 
                                                                EstDestino.getXCentral(), EstDestino.getYCentral());
                        // calcula o x e y do inicio da flecha
                        // sendo que h deve ser subtraido do raio do estado que no caso
                        // é 25, pois a flecha deve ser desenhada na borda do estado
                        double x = (h - 25) * Math.cos(Math.toRadians(gr));
                        double y = (h - 25) * Math.sin(Math.toRadians(gr));
                        // rotaciona a ponta da flecha
                        Graphics2D g2df = (Graphics2D) g2d.create(); // cria um novo Graphics a partir do original
                        g2df.translate(x + EstOrigem.getXCentral(), y + EstOrigem.getYCentral()); // faz a transla__o para a coordenada que deve ser a origem
                        g2df.rotate(Math.toRadians(gr)); // rotaciona usando o grau relativo
                        // desenha a flecha
                        g2df.draw(new Line2D.Double(0, 0, -5, -5));
                        g2df.draw(new Line2D.Double(0, 0, -5, 5));
                        // libera o graphics, n_o sendo necess_rio voltar a transla__o nem a rota__o
                        g2df.dispose();
                    } else {
                        // caso contr_rio, desenha arco
                        g2d.draw(new Ellipse2D.Double(EstOrigem.getXCentral(), EstOrigem.getYCentral() - 40, 30, 30));
                        // desenha a flecha
                        g2d.draw(new Line2D.Double(EstOrigem.getXCentral() + 21, EstOrigem.getYCentral() - 11, EstOrigem.getXCentral() + 30, EstOrigem.getYCentral() - 11));
                        g2d.draw(new Line2D.Double(EstOrigem.getXCentral() + 22, EstOrigem.getYCentral() - 11, EstOrigem.getXCentral() + 21, EstOrigem.getYCentral() - 20));
                        // desenha o s_mbolo da liga__o
                        g2d.drawString(c + "", EstOrigem.getXCentral() + 15 +flagSimbol, EstOrigem.getYCentral() - 45);
                    }
                    flagSimbol+=6;

                }
            }

        }

    }
}
