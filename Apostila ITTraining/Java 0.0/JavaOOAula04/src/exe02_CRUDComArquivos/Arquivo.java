package exe02_CRUDComArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Arquivo {


	   private Formatter output;
	   private Scanner input;

	   public void openFile(String url){
	      try{
	         output = new Formatter(url);
	      }catch ( SecurityException securityException ){
	         System.out.println("Você não tem permissão de escrita em "+url);
	         System.exit( 1 );
	      }catch ( FileNotFoundException filesNotFoundException ){
	    	 System.out.println( "Arquivo não encontrado.");
	         System.exit( 1 );
	      }
	   }
	   public Scanner readFile(String url){
	      try{
	         return input = new Scanner( new File(url) );
	      }catch ( SecurityException securityException ){
	    	 System.out.println("Você não tem permissão de leitura em "+url);
	         System.exit( 1 );
	      }catch ( FileNotFoundException filesNotFoundException ){
	    	 System.out.println( "Arquivo não encontrado.");
	         System.exit( 1 );
	      }
	      return null;
	   }

	    public void closeFile() {
	        if (input != null) input.close();
	        if (output != null) output.close();
	    }

	    public Formatter getOutput() {
	        return output;
	    }

	    public void setOutput(Formatter output) {
	        this.output = output;
	    }


	
}
