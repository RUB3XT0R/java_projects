package exercicio01Ate23;

public class Exe14 {

	/**
	 * Escreva um programa que, dada uma vari�vel x (com valor 180, por exemplo), 
	 * temos y de acordo com a seguinte regra:se x � par, y = x / 2; se x � impar, y = 3 * x + 1;
 	 * O programa deve ent�o jogar o valor de y em x e continuar at� que y tenha o valor final de 1. 
 	 * Por exemplo, para x = 13, a sa�da ser�:	40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.
	 */
	public static void main(String[] args) {
		
		int x=13,y;
		do{
			y =( x%2 == 0 ) ? x/2 : 3*x+1;
			System.out.print(" - "+y);
			if(y==1)break;
			x =y;
		}while(true);
		
	}

}
