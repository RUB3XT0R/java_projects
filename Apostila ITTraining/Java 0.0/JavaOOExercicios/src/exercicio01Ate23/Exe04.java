package exercicio01Ate23;

import java.util.Scanner;

public class Exe04 {

	/**
	 * Escreva um aplicativo que solicita ao usuário inserir dois inteiros, 
	 * obtem do usuário esses números e exibe o numero maior seguido pelas palavras “é maior”. 
	 * Se os números forem iguais, imprima “esses números são iguais”.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro número inteiro");
		int n2 = sc.nextInt();
		
		if( n1 == n2 )
			System.out.println("Esses números são iguais");
		else
			System.out.println( ( (n1>n2) ? n1 : n2 ) + " é maior");
		
	}

}
