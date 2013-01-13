package modelo.primitivos;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JOptionPane;
import modelo.FiguraGeometrica;
import modelo.Ponto;

public class Quadrilatero extends FiguraGeometrica implements Serializable{

    protected float largura, altura;

    @Override
    public final void calculaPontos() {
        setPontos(new Ponto[4]);
        //ponto p1
        int x1 = (int) (getPontoCentral().getX() - (largura / 2));
        int y1 = (int) (getPontoCentral().getY() - (altura / 2));
        getPontos()[0] = new Ponto(x1, y1);
        //ponto p2
        int x2 = x1;
        int y2 = (int) (getPontoCentral().getY() + (altura / 2));
        getPontos()[1] = new Ponto(x2, y2);
        //ponto p3
        int x3 = (int) (getPontoCentral().getX() + (largura / 2));
        int y3 = y1;
        getPontos()[3] = new Ponto(x3, y3);
        //ponto p4
        int x4 = x3;
        int y4 = y2;
        getPontos()[2] = new Ponto(x4, y4);
    }

    @Override
    public final void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillPolygon(getXs(), getYs(), getPontos().length);
    }

    @Override
    public void solicitarDados() {
        setNome(JOptionPane.showInputDialog(null, "Entre com o nome do Retângulo:", "Criando o Retângulo", JOptionPane.QUESTION_MESSAGE));
        String val = JOptionPane.showInputDialog(null, "Entre com a altura do retângulo:", "Criando o Retângulo", JOptionPane.QUESTION_MESSAGE);
        altura = Float.parseFloat(val);
        val = JOptionPane.showInputDialog(null, "Entre com a largura do retângulo:", "Criando o Retângulo", JOptionPane.QUESTION_MESSAGE);
        largura = Float.parseFloat(val);
    }

    @Override
    public String MakeVRML() {
        return "Shape { "+
        		"geometry Box { "+
          			"size "+ (largura/10)+ " "+ (altura/10) + " 0.1 "+
      			"} "+
                        "appearance Appearance { "+
            			"material Material { "+
					"diffuseColor "+ getColor().getRed() + " " + getColor().getGreen() + " " + getColor().getBlue() + " "+
            			"} "+
			"} "+
 		      "}, ";
    }
}
