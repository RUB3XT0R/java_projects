package exercicio01Ate23;

import java.util.Scanner;

public class Exe07 {

	/**
	 * 	Os motoristas se preocupam com a quilometragem dos seus automóveis. 
	 * Um motorista monitorou vários tanques cheios de gasolina registrando 
	 * a quilometragem dirigida e a quantidade de combustível em litros utilizados 
	 * para cada tanque cheio. 
	 * 	Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos 
	 * e os litros de gasolina consumidos para cada tanque cheio. 
	 * O programa deve calcular e exibir o consumo em quilometragem/litro para cada 
	 * tanque cheio. Todos os cálculos de media devem ser produzir 
	 * resultados de ponto flutuante. Utilize a classe Scanner e repetição controlada por 
	 * sentinela para obter os dados do usuário.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do{
						
			System.out.println("Entre com o total de quilômetros dirigidos ou -1 para sair:");
			float kmDirigidos = sc.nextFloat();
			if(kmDirigidos == -1) break;
			
			System.out.println("Entre com os litros de gasolina consumidos:");
			float litrosConsumidos = sc.nextFloat();
		
			System.out.println("Consumo: "+kmDirigidos/litrosConsumidos);
			
		}while(true);
		
	}

}
