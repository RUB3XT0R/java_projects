package exercicio01Ate23;

import java.util.Scanner;

public class Exe04 {

	/**
	 * Escreva um aplicativo que solicita ao usu�rio inserir dois inteiros, 
	 * obtem do usu�rio esses n�meros e exibe o numero maior seguido pelas palavras �� maior�. 
	 * Se os n�meros forem iguais, imprima �esses n�meros s�o iguais�.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro n�mero inteiro");
		int n2 = sc.nextInt();
		
		if( n1 == n2 )
			System.out.println("Esses n�meros s�o iguais");
		else
			System.out.println( ( (n1>n2) ? n1 : n2 ) + " � maior");
		
	}

}
