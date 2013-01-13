package modelo.primitivos;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JOptionPane;
import modelo.FiguraGeometrica;
import modelo.Ponto;

public class Triangulo extends FiguraGeometrica  implements Serializable {

    private float raio, altura;

    @Override
    public void calculaPontos() {
        setPontos(new Ponto[3]);
        //ponto p1
        int x1 = (int) (getPontoCentral().getX() - raio);
        int y1 = (int) (getPontoCentral().getY() + (altura / 2));
        getPontos()[0] = new Ponto(x1, y1);
        //ponto p2
        int x2 = (int) (getPontoCentral().getX() + raio);
        int y2 = y1;//(int) (getPontoCentral().getY() + (altura/2));
        getPontos()[1] = new Ponto(x2, y2);
        //ponto p3
        int x3 = getPontoCentral().getX();
        int y3 = (int) (getPontoCentral().getY() - (altura / 2));
        getPontos()[2] = new Ponto(x3, y3);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillPolygon(getXs(), getYs(), getPontos().length);
    }

    @Override
    public void solicitarDados() {
        setNome(JOptionPane.showInputDialog(null, "Entre com o nome do triângulo:", "Criando o Triângulo", JOptionPane.QUESTION_MESSAGE));
        String val = JOptionPane.showInputDialog(null, "Entre com a altura do triângulo:", "Criando o Triângulo", JOptionPane.QUESTION_MESSAGE);
        altura = Float.parseFloat(val);
        val = JOptionPane.showInputDialog(null, "Entre com o raio do triângulo:", "Criando o triângulo", JOptionPane.QUESTION_MESSAGE);
        raio = Float.parseFloat(val);
    }

    @Override
    public String MakeVRML() {
         return "Shape { "+
        		"geometry Cone { "+
          			" height " + (altura/20)+
				" bottomRadius "+ (raio/20)+
      	  		"}"+
                        "appearance Appearance { "+
            			"material Material { "+
					"diffuseColor "+ ((float)(getColor().getRed())) + " " + ((float)(getColor().getGreen())) + " " + ((float)(getColor().getBlue())) + " "+
            			"} "+
			"} "+
 		      "}, ";
    }
}
