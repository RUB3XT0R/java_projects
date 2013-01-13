package exe01_LerArquivo;

import java.util.Scanner;

public class Leitura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arquivo arq = new Arquivo();
		
		//abrindo o arquivo
		arq.openFile("contato.txt");
		//colocando dados
		arq.getOutput().format("%s %d\n","Lucas",473625141);
		arq.getOutput().format("%s %d\n","Ana",49734512);
		//fechando o arquivo
        arq.closeFile();
        
        //abrindo e lendo o arquivo
        Scanner input = arq.readFile("contato.txt");
		//mostrando os dados.
        while(input.hasNext()){
        	System.out.println("Nome: "+input.next()+", Tel.: "+input.nextInt());        	
        }
        
	}

}
