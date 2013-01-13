package exercicio01Ate23;

import java.util.Scanner;

public class Exe16 {

	/**
	 * 		Desenvolva um aplicativo Java que determinar� se um cliente de uma 
	 * loja de departamentos excedeu o limite de cr�dito em uma conta corrente.
	 * Para cada cliente, os seguintes fatos est�o dispon�veis:
	 * 		Numero da conta
	 * 		Saldo no inicio do m�s
	 * 		Total de todos os itens cobrados desse cliente no m�s
	 * 		Total de cr�ditos aplicados ao cliente no m�s
	 * 		Limite de credito autorizado
	 * 		O programa deve inserir todos esses fatos como inteiros,
	 *  calcular o novo saldo (= saldoinicial + despesas � cr�ditos), 
	 *  exibir o novo saldo e determinar se o novo saldo excede o limite 
	 *  de cr�dito do cliente. 
	 *      Para clientes cujo limite de credito for excedido, o programa 
	 *  devera exibir a mensagem �limite de credito excedido�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		
		//entrada de dados
		System.out.println("- Entre com o n�mero da conta:");
		int numero_conta = sc.nextInt();
		System.out.println("- Saldo no inicio do m�s:");
		float saldo_inicial = sc.nextFloat();
		System.out.println("- Total de todos os itens cobrados desse cliente no m�s:");
		float despesas = sc.nextFloat();
		System.out.println("- Total de cr�ditos aplicados ao cliente no m�s:");
		float creditos = sc.nextFloat();
		System.out.println("- Limite de credito autorizado:");
		float limite_credito = sc.nextFloat();
		
		System.out.println("...");

		//calculo do novo saldo
		float novo_saldo= saldo_inicial + despesas - creditos;
		System.out.println("- Seu novo saldo � : R$"+novo_saldo);
		
		if(novo_saldo>limite_credito){
			System.out.println("- Limite de Cr�dito excedido");
		}
		
		
		
	}
	
}
