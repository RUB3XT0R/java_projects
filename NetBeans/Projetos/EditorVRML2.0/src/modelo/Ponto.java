package modelo;

import java.io.Serializable;

public class Ponto implements Transformavel, Serializable {

    private int x;
    private int y;

    public Ponto() {
        super();
    }

    public Ponto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void escala(float ex, float ey, Ponto p) {
        if (p == null) {
            p = new Ponto(0, 0);
        }
        x = (int) (ex * x + (-p.getX() * ex) + p.getX());
        y = (int) (ey * y + (-p.getY() * ey) + p.getY());
    }

    @Override
    public void translacao(float tx, float ty) {
        x += tx;
        y += ty;
    }

    @Override
    public void rotacao(double angulo, Ponto po) {
        if (po == null) {
            return;
        }
        if (po.equals(this)) {
            return;
        }
        x -= po.getX();
        y -= po.getY();
        int x1 = (int) (x * Math.cos(angulo) - y * Math.sin(angulo));
        int y1 = (int) (x * Math.sin(angulo) + y * Math.cos(angulo));
        x = x1 + po.getX();
        y = y1 + po.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
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
        Ponto other = (Ponto) obj;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "["+getX()+";"+getY()+"]";
    }
}
