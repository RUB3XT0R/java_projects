package exercicio01Ate23;

import java.util.Scanner;

public class Exe19 {

	/**
	 * 19)	O processo de localizar o maior valor (isto �, o valor m�ximo de um grupo de valores) 
	 * � frequentemente utilizado em aplicativos de computador. Por exemplo, um programa de determina 
	 * o vencedor de uma competi��o de vendas inseriria o numero de unidades vendidas por cada vendedor. 
	 * O vendedor que vende mais unidades ganha a competi��o. Escreva um programa  em Java que aceite 
	 * como entrada uma serie de 10 inteiros e determine e imprima o maior valor dos inteiros. 
	 * Seu programa devera utilizar pelo menos tr�s vari�veis descritas a seguir:
			a.	Conter: um contador para contar at� 10 (isto �, monitorar quantos n�meros foram 
			inseridos e determinar quando todos os 10 n�meros foram processados).
			b.	Number: o inteiro mais recente inserido pelo usu�rio.
			c.	Largest: o maior numero encontrado at� agora.

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de unidades vendidas do vendedor:");
		int largest=sc.nextInt();
		int Number;
		int conter=0;
		do{
			System.out.println("Entre com o n�mero de unidades vendidas proximo vendedor:");
			Number=sc.nextInt();	
			largest = Number>largest ? Number : largest;
			conter++;
		}while(conter<=10);

		System.out.println("O maior n�mero de vendas foi:"+largest);
	}
}
