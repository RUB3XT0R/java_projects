package exercicio01Ate23;

import java.util.Scanner;

public class Exe11 {

	/**
	 *Escreva um programa que localiza o menor de v�rios inteiros.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int menor = sc.nextInt();
		
		int n;
		do{
			System.out.println("Entre com um n�mero ou 0 para sair:");
			n = sc.nextInt();
			if(n == 0) break; //sentinela (quebra o loop quando n for zero)
			menor = n<menor ? n :menor; //se n for menor que menor, menor rewcebe o valor de n, sen�o continua com seu valor
		}while(true);

		System.out.println("O menor dos n�meros �:"+menor);
	}

}
