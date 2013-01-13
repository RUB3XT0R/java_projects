package exercicio01Ate23;

import java.util.Scanner;

public class Exe05 {

	/**
	 * Escreva um aplicativo que le um inteiro e determina e 
	 * imprime se ele é impar ou par.[dica: utilize o operador de modulo. 
	 * Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2]
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n1 = sc.nextInt();
		System.out.println( n1 % 2 ==0 ? "é par" : "é impar");
		
	}

}
