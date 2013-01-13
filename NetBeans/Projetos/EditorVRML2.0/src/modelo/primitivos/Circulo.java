package modelo.primitivos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import javax.swing.JOptionPane;
import modelo.FiguraGeometrica;
import modelo.Ponto;

public class Circulo extends FiguraGeometrica implements Serializable {

    float raio, altura, largura;

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        Ellipse2D e = new Ellipse2D.Double(getPontoCentral().getX(), getPontoCentral().getY(), altura, largura);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(e);
        g2.draw(e);
    }

    @Override
    public void calculaPontos() {
        setPontos(new Ponto[1]);
        getPontos()[0] = getPontoCentral();
    }

    @Override
    public void escala(float ex, float ey, Ponto pRef) {
        setEx(getEx()*ex); setEy(getEy()*ey);
        altura *= ex;
        largura *= ey;
        if (pRef != null) {
            getPontoCentral().escala(ex, ey, pRef);
        }
        raio =( (altura+largura)/2 );
        setEscala(" scale "+getEx()+" "+getEy()+" 1 ");
    }

    @Override
    public void translacao(float tx, float ty) {
        getPontoCentral().translacao(tx, ty);
        setTx(getTx()*tx); setTy(getTy()*ty);
        setTranslacao(" translation "+getTx()+" "+getTy()+" 0 ");
    }

    @Override
    public void rotacao(double angulo, Ponto pRef) {
        if (pRef != null) {
            getPontoCentral().rotacao(angulo, pRef);
        }
    }

    @Override
    public void solicitarDados() {
        setNome(JOptionPane.showInputDialog(null, "Entre com o nome do Circulo:", "Criando o Círculo", JOptionPane.QUESTION_MESSAGE));
        String val = JOptionPane.showInputDialog(null, "Entre com o raio do circulo:", "Criando o Círculo", JOptionPane.QUESTION_MESSAGE);
        raio = Float.parseFloat(val);
        this.altura = raio;
        this.largura = raio;
    }

    @Override
    public String MakeVRML() {
        String str = "Transform {"+getEscala()+" "+getTranslacao()+
			" children [Shape { geometry Sphere { radius "+ (raio/20)+ " } "+
                        " appearance Appearance { "+
            			"material Material { "+
					"diffuseColor "+ (getColor().getRed()) + " " + (getColor().getGreen()) + " "+ (getColor().getBlue()) + " } "+
			"} "+
 		      "}]}, ";
        return str;
    }
}
