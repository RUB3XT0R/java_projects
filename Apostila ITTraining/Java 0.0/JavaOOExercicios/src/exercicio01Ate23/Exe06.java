package exercicio01Ate23;

import java.util.Scanner;

public class Exe06 {

	/**
	 * Escreva um aplicativo que l� dois inteiros, 
	 * determina se o primeiro � m�ltiplo do segundo e imprime o resultado.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro n�mero inteiro");
		int n2 = sc.nextInt();

		//(n1 % n2 ==0 ? "" : "n�o ") -- se ele for multiplo n�o interfere na frase, sen�coloca um 'n�o' na frase.
		System.out.println( n1+ (n1 % n2 ==0 ? "" : " n�o") +" � multiplo de "+n2 );
		
		//outro modo menos complexo
		if(n1 % n2 ==0 )
			System.out.println( n1+"  � multiplo de "+n2 );
		else
			System.out.println( n1+" n�o � multiplo de "+n2 );
		
	}

}
