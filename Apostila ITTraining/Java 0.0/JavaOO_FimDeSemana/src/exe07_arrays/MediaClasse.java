package exe07_arrays;

import java.util.Scanner;

public class MediaClasse {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 *  Utilizando vetores:
		 */
			
		float soma=0, media;
		//criação do vetor
		float[] notas = new float[8];
		//percorrendo o vetor para preenchê-lo
		for(int i=0; i<notas.length; i++){
			System.out.println("Entre com a média do "+(i+1)+"º aluno..:");
			notas[i] = sc.nextFloat(); //coleta a nota e coloca na posição i do vetor
			soma += notas[i];
		}
		media = soma/notas.length;
		System.out.println("A média geral da sala foi..:"+media);
		/*
		 *  Utilizando matrizes:
		 */
		//criação do vetor
		float[][] notasAlunos = new float[8][3];	
		//percorrendo a matriz para preenchê-lo
		//primeiro for, percorre as linhas/alunos
		for(int i=0; i<notasAlunos.length; i++){
            System.out.println(" -->  Aluno nº..:" + (i+1) );
          //segundo for, percorre as colunas/notas
		  for(int y=0; y<notasAlunos[i].length; y++){
			System.out.println("Entre com a " + (i+1) + "ª nota..:");
			notasAlunos[i][y]= sc.nextFloat(); //coleta a nota e coloca na posição i do vetor
		  }
		}
		
	    System.out.println("Aluno\tNota1\tNota2\tNota3");
	    System.out.println("------------------------------------");
	    for(int i=0; i<notasAlunos.length; i++){
		    System.out.print( (i+1) +"\t");
		    for(int y=0; y<notasAlunos[i].length; y++){
				System.out.print(notasAlunos[i][y]+"\t");
			}
		    System.out.println("");
		}

	}

}
