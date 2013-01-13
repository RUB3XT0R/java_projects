package exercicio01Ate23;

import java.util.Scanner;

public class Exe07 {

	/**
	 * 	Os motoristas se preocupam com a quilometragem dos seus autom�veis. 
	 * Um motorista monitorou v�rios tanques cheios de gasolina registrando 
	 * a quilometragem dirigida e a quantidade de combust�vel em litros utilizados 
	 * para cada tanque cheio. 
	 * 	Desenvolva um aplicativo Java que receba como entrada os quil�metros dirigidos 
	 * e os litros de gasolina consumidos para cada tanque cheio. 
	 * O programa deve calcular e exibir o consumo em quilometragem/litro para cada 
	 * tanque cheio. Todos os c�lculos de media devem ser produzir 
	 * resultados de ponto flutuante. Utilize a classe Scanner e repeti��o controlada por 
	 * sentinela para obter os dados do usu�rio.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do{
						
			System.out.println("Entre com o total de quil�metros dirigidos ou -1 para sair:");
			float kmDirigidos = sc.nextFloat();
			if(kmDirigidos == -1) break;
			
			System.out.println("Entre com os litros de gasolina consumidos:");
			float litrosConsumidos = sc.nextFloat();
		
			System.out.println("Consumo: "+kmDirigidos/litrosConsumidos);
			
		}while(true);
		
	}

}
