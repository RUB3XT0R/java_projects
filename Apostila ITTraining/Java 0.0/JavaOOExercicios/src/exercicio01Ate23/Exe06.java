package exercicio01Ate23;

import java.util.Scanner;

public class Exe06 {

	/**
	 * Escreva um aplicativo que lê dois inteiros, 
	 * determina se o primeiro é múltiplo do segundo e imprime o resultado.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro número inteiro");
		int n2 = sc.nextInt();

		//(n1 % n2 ==0 ? "" : "não ") -- se ele for multiplo não interfere na frase, senãcoloca um 'não' na frase.
		System.out.println( n1+ (n1 % n2 ==0 ? "" : " não") +" é multiplo de "+n2 );
		
		//outro modo menos complexo
		if(n1 % n2 ==0 )
			System.out.println( n1+"  é multiplo de "+n2 );
		else
			System.out.println( n1+" não é multiplo de "+n2 );
		
	}

}
