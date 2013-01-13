package exercicio01Ate23;

import java.util.Scanner;

public class Exe03 {

	/**
	 * Escreva um aplicativo que insere três inteiros digitados pelo usuário e 
	 * exibe a soma, a media, o produto e os números menores e maiores
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n1 = sc.nextInt();
		System.out.println("Entre com outro número inteiro");
		int n2 = sc.nextInt();
		System.out.println("Entre com um terceiro número inteiro");
		int n3 = sc.nextInt();
		
		System.out.println(n1+"+"+n2+"+"+n3+" = "+(n1+n2+n3));
		System.out.println("Média: "+(n1+n2+n3)/3);
		System.out.println(n1+"x"+n2+"x"+n3+" = "+(n1*n2*n3));
		
		if(n1>n2 & n1>n3){
			System.out.println("Maior: "+n1);
			System.out.println("Menor: "+( (n2<n3) ? n2 : n3 ) );
		}else{
			if(n2>n3){
				System.out.println("Maior: "+n2);
				System.out.println("Menor: "+( (n1<n3) ? n1 : n3 ) );
			}else{
				System.out.println("Maior: "+n3);
				System.out.println("Menor: "+( (n2<n1) ? n2 : n1 ) );
			}
		}
		
		
		
		
	}

}
