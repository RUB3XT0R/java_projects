package exercicio01Ate23;

import java.util.Scanner;

public class Exe23 {

	/**
	 *O fatorial de um inteiro n�o negativo n � escrito como n!
	 * (pronuncia-se n fatorial) e � definido como segue:
			N! � n (n-1) (n-2)...1 (para valores de n maiores ou igual a 1)
			E n!=1 (para n=0)
		Por exemplo: 5!-5.4.3.2.1, o que d� 120.
			a.	Escreva um aplicativo que leia inteiro n�o negativo, calcule e imprima seu fatorial.
			b.	Escreva um aplicativo que estime o valor da constante matem�tica e utilizando a formula: 
				E= 1+ 1/1! + 1/2! + 1/3! +...
			c.	Escreva um aplicativo que computa o valor de ex utilizando a formula: 
			ex =1+ x/1! + x�/2! + x�/3! +...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//a.
		System.out.println("Entre com um n�mero que deseja calcular a fatorial: ");
		int num = sc.nextInt();
		
		int fat = 1;
		for(int i = num; i>1; i--)
			fat *= i;
		
		System.out.println("O fatorial de "+num+" � :"+fat);
		
		//b.
		System.out.println("Entre com um n�mero: ");
		num = sc.nextInt();
		double e=1;
		double fats;
		for(int i=1; i<=num; i++){
			fats = 1;
			for(int y=2; y<=i; y++) {fats *= y;}
			e += 1/fats;
		}
		System.out.println("O E de "+num+" � :"+e);
		
		//c.
		System.out.println("Entre com um n�mero: ");
		num = sc.nextInt();
		e=1;
		for(int i=1; i<=num; i++){
			fats = 1;
			for(int y=2; y<=i; y++) {fats *= y;}
			e += Math.pow(num,2)/fats;
		}
		System.out.println("O Ex de "+num+" � :"+e);
	}

}
