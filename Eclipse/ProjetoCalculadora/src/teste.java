
package classe;

public class Calculadora {

    private float valor1;
    private float valor2;
    private String operador;

   public Calculadora(float valor1, float valor2, String operador) {
      this.valor1 = valor1;
      this.valor2 = valor2;
      this.operador = operador;
   }
   
    public float getResultado() {
        if (operador.equals("Soma")) {
            return valor1 + valor2;
        } else if (operador.equals("Subtracao")) {
            return valor1 - valor2;
        } else if (operador.equals("Multiplicacao")) {
            return valor1 * valor2;
        } else if (operador.equals("Divisao")) {
            return valor1 / valor2;
        }
        return 0;
    }
}