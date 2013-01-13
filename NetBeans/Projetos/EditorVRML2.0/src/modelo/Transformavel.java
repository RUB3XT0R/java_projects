package modelo;

import modelo.Ponto;


public interface Transformavel {
   public void escala(float ex, float ey, Ponto p);
   public void translacao(float tx, float ty);
   public void rotacao(double angulo, Ponto p);
}
