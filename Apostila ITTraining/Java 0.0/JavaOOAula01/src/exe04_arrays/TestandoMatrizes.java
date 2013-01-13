package exe04_arrays;

import java.util.Scanner;

public class TestandoMatrizes {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//arrays do tipo vetor
		//declaração
		String[] nomes = new String[4];
		//leitura usando for
		for(int i=0; i<nomes.length; i++){
			nomes[i] = input.nextLine();
		}
		//escrita usando forEach
		for(String atual : nomes){
			System.out.println("- "+atual);
		}
		
		//arrays do tipo matriz
		//declaração
		String[][] nomesCompletos = new String[2][2];
		//leitura usando for
		for(int linha=0; linha< nomesCompletos.length; linha++){
			for(int coluna=0; coluna< nomesCompletos[linha].length; coluna++ ){
				nomesCompletos[linha][coluna] = input.nextLine();
			}
		}
		//escrita usando foreach
		for(String[] atual : nomesCompletos){
			for(String s : atual)
				System.out.print(s+"\t");
			System.out.println();
		}
		//leitura usando forEach
		for(String[] atual : nomesCompletos){
			for(String s : atual)
				s = input.nextLine();
			System.out.println();
		}
		
	}
	

}
