package exercicio01Ate23;

import java.util.Scanner;

public class Exe21 {

	/**
	 * Escreva um aplicativo que aceita como entrada um inteiro contendo 
	 * somente 0s e 1s(isto �, um numero bin�rio) e imprime seu equivalente decimal.
	 * [dica: utilize os operadores de resto e divis�o para pegar os d�gitos do 
	 * n�mero bin�rio um de cada vez, da direita para esquerda. No sistema de 
	 * n�meros decimais, o digito mais a direita tem o valor posicional de 1 e o 
	 * pr�ximo digito a esquerda tem um valor posicional de 10, depois 100, depois 
	 * 1000 e assim por diante. O numero decimal 234 pode ser interpretado como 
	 * 4*1 + 3* 10 + 2* 200. No sistema de n�meros bin�rios, o digito mais a direita 
	 * tem o valor posicional de 1, o pr�ximo digito a esquerda tem um valor posicional 
	 * de 2, depois 4, depois 8 e assim por diante. O equivalente decimal do bin�rio 
	 * 1101 � 1*1 + 0*2 + 1*4 + 1*8, ou 1+0+4+8 ou 13.]
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero bin�rio:");		
		int parcela=sc.nextInt();
		int digito;
		int decimal=0;
		int expo=0;
		do{
			digito = parcela%10;
			//System.out.println("digito..."+digito);
			parcela = parcela/10;
			//System.out.println("Parcela/10..."+parcela);
			decimal+=digito*Math.pow(2,expo++);
			//System.out.println("Decimal..."+decimal);
		}while(parcela>0);

		System.out.println("Decimal:"+decimal);
	}

}
