package exercicio01Ate23;

import java.util.Scanner;

public class Exe02 {

	/**
	 * Escreva um aplicativo que solicita ao usu�rio inserir dois inteiros, 
	 * obt�m do usu�rio esses n�meros e imprime sua soma, produto, diferen�a e quociente (divis�o). 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro n�mero inteiro");
		int n2 = sc.nextInt();
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
		
	}

}
