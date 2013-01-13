package exe04_operadores;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int numero1 = input.nextInt();
		System.out.println("Entre com o primeiro número:");
		int numero2 = input.nextInt();

		int soma = numero1 + numero2;
		System.out.println("A soma dos dois é ..........: "+ soma);
		
		int sub = numero1 - numero2;
		System.out.println("A diferença dos dois é......: "+ sub);
		
		int mult = numero1 * numero2;
		System.out.println("O produto dos dois é........: "+ mult);

		float div = (float) numero1 / numero2;
		System.out.println("A divisão dos dois é........: "+ div);
		
		int resto = numero1 % numero2;
		System.out.println("O resto de nº1 por nº2 é....: "+ resto);
	}

}
