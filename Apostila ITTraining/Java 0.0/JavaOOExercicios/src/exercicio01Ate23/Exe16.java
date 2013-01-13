package exercicio01Ate23;

import java.util.Scanner;

public class Exe16 {

	/**
	 * 		Desenvolva um aplicativo Java que determinará se um cliente de uma 
	 * loja de departamentos excedeu o limite de crédito em uma conta corrente.
	 * Para cada cliente, os seguintes fatos estão disponíveis:
	 * 		Numero da conta
	 * 		Saldo no inicio do mês
	 * 		Total de todos os itens cobrados desse cliente no mês
	 * 		Total de créditos aplicados ao cliente no mês
	 * 		Limite de credito autorizado
	 * 		O programa deve inserir todos esses fatos como inteiros,
	 *  calcular o novo saldo (= saldoinicial + despesas – créditos), 
	 *  exibir o novo saldo e determinar se o novo saldo excede o limite 
	 *  de crédito do cliente. 
	 *      Para clientes cujo limite de credito for excedido, o programa 
	 *  devera exibir a mensagem “limite de credito excedido”.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		
		//entrada de dados
		System.out.println("- Entre com o número da conta:");
		int numero_conta = sc.nextInt();
		System.out.println("- Saldo no inicio do mês:");
		float saldo_inicial = sc.nextFloat();
		System.out.println("- Total de todos os itens cobrados desse cliente no mês:");
		float despesas = sc.nextFloat();
		System.out.println("- Total de créditos aplicados ao cliente no mês:");
		float creditos = sc.nextFloat();
		System.out.println("- Limite de credito autorizado:");
		float limite_credito = sc.nextFloat();
		
		System.out.println("...");

		//calculo do novo saldo
		float novo_saldo= saldo_inicial + despesas - creditos;
		System.out.println("- Seu novo saldo é : R$"+novo_saldo);
		
		if(novo_saldo>limite_credito){
			System.out.println("- Limite de Crédito excedido");
		}
		
		
		
	}
	
}
