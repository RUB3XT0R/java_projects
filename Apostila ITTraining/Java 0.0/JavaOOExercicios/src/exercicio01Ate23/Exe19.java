package exercicio01Ate23;

import java.util.Scanner;

public class Exe19 {

	/**
	 * 19)	O processo de localizar o maior valor (isto é, o valor máximo de um grupo de valores) 
	 * é frequentemente utilizado em aplicativos de computador. Por exemplo, um programa de determina 
	 * o vencedor de uma competição de vendas inseriria o numero de unidades vendidas por cada vendedor. 
	 * O vendedor que vende mais unidades ganha a competição. Escreva um programa  em Java que aceite 
	 * como entrada uma serie de 10 inteiros e determine e imprima o maior valor dos inteiros. 
	 * Seu programa devera utilizar pelo menos três variáveis descritas a seguir:
			a.	Conter: um contador para contar até 10 (isto é, monitorar quantos números foram 
			inseridos e determinar quando todos os 10 números foram processados).
			b.	Number: o inteiro mais recente inserido pelo usuário.
			c.	Largest: o maior numero encontrado até agora.

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de unidades vendidas do vendedor:");
		int largest=sc.nextInt();
		int Number;
		int conter=0;
		do{
			System.out.println("Entre com o número de unidades vendidas proximo vendedor:");
			Number=sc.nextInt();	
			largest = Number>largest ? Number : largest;
			conter++;
		}while(conter<=10);

		System.out.println("O maior número de vendas foi:"+largest);
	}
}
