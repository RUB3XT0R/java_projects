

package controle.daoArq;

import controle.Ferramentas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class DaoArq {

   private Formatter output;
   private Scanner input;

   public void openFile(String url){
      try{
         output = new Formatter(url);
      }catch ( SecurityException securityException ){
         Ferramentas.showErro("Você não tem permissão de escrita em "+url,"Erro Interno nº01.");
         System.exit( 1 );
      }catch ( FileNotFoundException filesNotFoundException ){
         Ferramentas.showErro( "Arquivo não encontrado.","Erro Interno nº02.");
         System.exit( 1 );
      }
   }
   public Scanner readFile(String url){
      try{
         return input = new Scanner( new File(url) );
      }catch ( SecurityException securityException ){
         Ferramentas.showErro("Você não tem permissão de leitura em "+url,"Erro Interno nº03.");
         System.exit( 1 );
      }catch ( FileNotFoundException filesNotFoundException ){
         Ferramentas.showErro( "Arquivo não encontrado.","Erro Interno nº04.");
         System.exit( 1 );
      }
      return null;
   }

    public void closeFile() {
        if (input != null) {
            input.close();
        }
        if (output != null) {
            output.close();
        }
    }

    public Formatter getOutput() {
        return output;
    }

    public void setOutput(Formatter output) {
        this.output = output;
    }



}
