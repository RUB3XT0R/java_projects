package exe04_operadores;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		int numero1 = input.nextInt();
		System.out.println("Entre com o primeiro n�mero:");
		int numero2 = input.nextInt();

		int soma = numero1 + numero2;
		System.out.println("A soma dos dois � ..........: "+ soma);
		
		int sub = numero1 - numero2;
		System.out.println("A diferen�a dos dois �......: "+ sub);
		
		int mult = numero1 * numero2;
		System.out.println("O produto dos dois �........: "+ mult);

		float div = (float) numero1 / numero2;
		System.out.println("A divis�o dos dois �........: "+ div);
		
		int resto = numero1 % numero2;
		System.out.println("O resto de n�1 por n�2 �....: "+ resto);
	}

}
