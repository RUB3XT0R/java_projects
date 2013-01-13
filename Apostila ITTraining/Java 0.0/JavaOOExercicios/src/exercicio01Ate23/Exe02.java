package exercicio01Ate23;

import java.util.Scanner;

public class Exe02 {

	/**
	 * Escreva um aplicativo que solicita ao usuário inserir dois inteiros, 
	 * obtém do usuário esses números e imprime sua soma, produto, diferença e quociente (divisão). 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro número inteiro");
		int n2 = sc.nextInt();
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
		
	}

}
