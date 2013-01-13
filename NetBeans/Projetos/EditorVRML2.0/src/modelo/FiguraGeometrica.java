package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelo.Ponto;

public abstract class FiguraGeometrica implements Transformavel, Serializable {

    private String nome;
    private Ponto[] pontos;
    private Ponto pontoCentral;
    private Color color;
    private String escala=" ",rotacao=" ",translacao=" ";
    //auxiliares
    private float ex=0,ey=0,tx=0,ty=0,angle=0;
    
    public FiguraGeometrica() {
        pontoCentral = new Ponto();
        solicitarDados();
        
        String val = JOptionPane.showInputDialog(null, "Entre com a coordenada X central:", "Posicionando o objeto", JOptionPane.QUESTION_MESSAGE);
        this.getPontoCentral().setX(Integer.parseInt(val));
        val = JOptionPane.showInputDialog(null, "Entre com a coordenada Y central:", "Posicionando o objeto", JOptionPane.QUESTION_MESSAGE);
        this.getPontoCentral().setY(Integer.parseInt(val));

        calculaPontos();
    }

    public abstract void draw(Graphics g);

    public abstract String MakeVRML();

    public abstract void calculaPontos();

    public abstract void solicitarDados();
    
  

    public final int[] getXs() {
        int length = pontos.length;
        int[] vetX = new int[length];
        for (int i = 0; i < length; i++) {
            vetX[i] = pontos[i].getX();
        }
        return vetX;
    }

    public final int[] getYs() {
        int length = pontos.length;
        int[] vetY = new int[length];
        for (int i = 0; i < length; i++) {
            vetY[i] = pontos[i].getY();
        }
        return vetY;
    }

    @Override
    public void escala(float ex, float ey, Ponto pRef) {
        this.ex*=ex; this.ey*=ey;
        for (Ponto p : pontos) {
            p.escala(ex, ey, pRef);
        }
        escala=" scale "+this.ex+" "+this.ey+" 1 ";
    }

    @Override
    public void translacao(float tx, float ty) {
        this.tx=+tx; this.ty+=ty;
        for (Ponto p : pontos) {
            p.translacao(tx, ty);
        }
        pontoCentral.translacao(tx, ty);
        translacao=" translation "+this.tx+" "+this.ty+" 0 ";
    }

    @Override
    public void rotacao(double angulo, Ponto pRef) {
        this.angle+=Math.toRadians(angulo);
        for (Ponto p : pontos) {
            p.rotacao(Math.toRadians(angulo), pRef);
        }
        pontoCentral.rotacao(angulo, pRef);
        rotacao=" rotation 0 0 1 "+this.angle+" ";
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ponto getPontoCentral() {
        return pontoCentral;
    }

    public void setPontoCentral(Ponto pontoCentral) {
        this.pontoCentral = pontoCentral;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + Arrays.hashCode(pontos);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FiguraGeometrica other = (FiguraGeometrica) obj;
        if (color == null) {
            if (other.color != null) {
                return false;
            }
        } else if (!color.equals(other.color)) {
            return false;
        }
        if (!Arrays.equals(pontos, other.pontos)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getRotacao() {
        return rotacao;
    }

    public void setRotacao(String rotacao) {
        this.rotacao = rotacao;
    }

    public String getTranslacao() {
        return translacao;
    }

    public void setTranslacao(String translacao) {
        this.translacao = translacao;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getEx() {
        return ex;
    }

    public void setEx(float ex) {
        this.ex = ex;
    }

    public float getEy() {
        return ey;
    }

    public void setEy(float ey) {
        this.ey = ey;
    }

    public float getTx() {
        return tx;
    }

    public void setTx(float tx) {
        this.tx = tx;
    }

    public float getTy() {
        return ty;
    }

    public void setTy(float ty) {
        this.ty = ty;
    }
    
    

    @Override
    public final String toString() {
        return getNome();
    }
}
