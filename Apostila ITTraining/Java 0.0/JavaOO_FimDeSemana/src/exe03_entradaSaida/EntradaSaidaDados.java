package exe03_entradaSaida;

import java.util.Scanner;

public class EntradaSaidaDados {


	public static void main(String[] args) {
		
		//declaração objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solitando e recebendo dados
		System.out.println("Entre com seu nome ......:");
		String nome = sc.nextLine();
		System.out.println("Entre com sua idade .....:");
		int idade = sc.nextInt();
		System.out.println("Entre com sua altura ....:");
		float altura = sc.nextFloat();
		
		//Exibindo dados
		System.out.println("Nome ....:"+nome);
		System.out.println("Idade ...:"+idade);
		System.out.println("Altura ..:"+altura);

	}

}
