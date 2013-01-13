package exe02_variaveis;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		//classe para leitura de dados
		Scanner input = new Scanner(System.in);
		
		String texto="um texto qualquer";
		int i = 23;
		float moeda= 23.4f;
		double moedaDupla = 23.53445345645654;
		boolean isOk = true; // ou false
		
		System.out.println("Entre com o primeiro número.");
		int numero1 = input.nextInt();
		
		System.out.println("Entre com o primeiro número.");
		int numero2 = input.nextInt();
		
		int soma = numero1 / numero2;
				
		System.out.println("A soma dos dois é: "+ soma);

	}

}
