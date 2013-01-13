package exercicio01Ate23;

import java.util.Scanner;

public class Exe22 {

	/**
	 * Escreva um programa que leia três valores diferentes de zero 
	 * inseridos pelo usuário e determine e imprima se eles poderiam 
	 * representar os lados de um triangulo.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero:");		
		int a= sc.nextInt();
		System.out.println("Insira um numero:");		
		int b= sc.nextInt();
		System.out.println("Insira um numero:");		
		int c= sc.nextInt();
		
		if(a+b>c & a+c>b & b+c>a){
			System.out.println("Formam um triângulo");			
		}else{
			System.out.println("Não formam um triângulo");		
		}
	}

}
