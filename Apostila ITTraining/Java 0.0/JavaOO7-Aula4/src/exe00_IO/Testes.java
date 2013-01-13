package exe00_IO;

import java.io.*;

import exe03_Stream.Contato;

public class Testes {

	public static void main(String[] args) {
		
		//escrevendo
		try (
				FileWriter writer = new FileWriter("saida.txt",true);
				PrintWriter saida = new PrintWriter(writer);
				//PrintWriter saida = new PrintWriter(new BufferedWriter(new FileWriter("saida.txt")));  

		){
			saida.println("Camera's ready,");  
			saida.println("Prepare to flash....");  
			saida.println("Green Velvet");
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		//lendo
		try (
			    FileReader reader = new FileReader("saida.txt");
				BufferedReader leitor = new BufferedReader(reader);
		){
						
			String linha = null;  
			do {
				linha = leitor.readLine();
				if(linha == null)break;
			    System.out.println("Linha: " + linha);  
			} while(linha != null); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}  

	}
	
	
	

}
