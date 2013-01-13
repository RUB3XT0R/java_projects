package exe06_repeticoes;

import java.util.Scanner;

public class Tabuada {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número o qual deseja calcular a tabuada:");
		int n = input.nextInt();
		
		System.out.println("Tabuada de "+n+" utilizando 'While':");
		int contador = 0;
		while(contador <= 10){
			System.out.println("- " + n + "x" + contador + "= " + contador*n);
			contador = contador + 1; //contador++;
		}
		
		System.out.println("Tabuada de "+n+" utilizando 'Do...while':");
		contador = 0;
		do{
			System.out.println("- " + n + "x" + contador + "= " + contador*n);
			contador = contador + 1; //contador++;
		}while(contador <= 10);
		
		System.out.println("Tabuada de "+n+" utilizando 'For':");
		for( contador =0; contador <= 10; contador++){
			System.out.println("- " + n + "x" + contador + "= " + contador*n);
		}
		
		
		
	}

}
