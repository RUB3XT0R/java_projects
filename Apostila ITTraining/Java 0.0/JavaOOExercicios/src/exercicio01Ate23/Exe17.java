package exercicio01Ate23;

import java.util.Scanner;

public class Exe17 {

	/**		Uma grande empresa paga seu pessoal de vendas com base em comissões. 
	 * O pessoal recebe $200 por semana mais 9% de suas vendas brutas durante 
	 * essa semana. Por exemplo, um vendedor que realiza um total de vendas 
	 * de mercadorias de R$ 5.000 em uma semana recebe $200 mais 9% de R$5.000 
	 * ou um total de $650. Foi-lhe fornecida uma lista dos itens vendidos por 
	 * cada vendedor. Os valores desses itens são como segue:
	 *  Item 	value
	 *  	1 	239.99
	 *  	2	129.75
	 *  	3	99,95
	 *  	4	350,89
	 *		Desenvolva um aplicativo Java que receba a entrada do itens por um 
	 * vendedor durante a ultima semana e calcule e exibe os rendimentos do vendedor. 
	 * Não há limites quanto ao numero de itens que podem ser vendido por um mesmo vendedor.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int item;
		float total=0.0f;
		
		do{
			System.out.print("Entre com o código do item ou -1 para sair:");
			item = sc.nextInt();
			if(item==-1)break;
			switch(item){
				case 1: total += 239.99; break;
				case 2: total += 129.75; break;
				case 3: total += 99.95; break;
				case 4: total += 350.89; break;
				default: System.out.print("Código inválido!"); 
			}
		}while(true);

		System.out.printf("Rendimento: R$ %5.2f",(200+total*0.09));
	}

}
