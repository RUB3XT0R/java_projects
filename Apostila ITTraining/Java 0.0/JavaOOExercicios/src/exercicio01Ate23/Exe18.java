package exercicio01Ate23;

import java.util.Scanner;

public class Exe18 {

	/**
	 * Desenvolva um aplicativo Java que determine o salario bruto de cada um dos três empregados. 
	 * A empresa paga “hora normal” pelas primeiras 40 horas trabalhadas por cada funcionário e 50% 
	 * a mais para todas as horas trabalhadas além de 40 horas. 
	 * Você recebe uma lista dos empregados  da empresa, o numero de horas trabalhadas por empregado 
	 * na ultima semana e o salário hora de cada empregado. S
	 * eu programa deve aceitar a entrada dessas informações para cada empregado e 
	 * então determinar e exibir o salario bruto do empregado. Utilize a classes Scanner para inserir 
	 * os dados.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float salarioBruto;
		float salarioHora;
		int horasTrabalhadas;
		
		do {
			System.out.println("Entre com as horas trabalhadas do trabalhador ou -1 para sair.");
			horasTrabalhadas = sc.nextInt();
			if (horasTrabalhadas == -1)
				break; // ativa sentinela , sai do laço

			System.out.println("Entre com o salário Horas do trabalhador ou -1 para sair.");
			salarioHora = sc.nextFloat();

			if (horasTrabalhadas <= 40) {
				// se as horas trabalhadas forem até 40, calculo normal.
				salarioBruto = salarioHora * horasTrabalhadas;
			} else {
				// senão, efetua-se o calculo das horas extras ( depois das 40horas)
				int horasExtras = horasTrabalhadas - 40;
				// o salario bruto será o salarioHora * 40 , que são as horas normais
				// mais as horas extras calculadas vezes 1.5 o salrio, ou seja, 50% a mais o salario
				salarioBruto = salarioHora * 40 + horasExtras * salarioHora* 1.5f;
			}
			
			System.out.println("O salário bruto do trabalhador é: R$"+salarioBruto);
		} while (true);

	}

}
