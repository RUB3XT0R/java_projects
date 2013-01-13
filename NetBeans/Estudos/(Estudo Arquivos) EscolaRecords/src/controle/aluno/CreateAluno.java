

package controle.aluno;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Aluno;


public class CreateAluno {

   private Formatter output;

   public void openFile(){
      try{
         output = new Formatter( "alunos.txt" );
      }catch ( SecurityException securityException ){
         System.err.println("Você não tem permissão de escrita nessa arquivo." );
         System.exit( 1 );
      }catch ( FileNotFoundException filesNotFoundException ){
         System.err.println( "Arquivo não encontrado." );
         System.exit( 1 );
      }
   }

   public void addAlunos() {

      Aluno aluno = new Aluno();

      Scanner input = new Scanner( System.in );
      System.out.printf( "Entre com o numero de alunos: " );

      int numAluno = input.nextInt() ;
      int i=0;
      while (i<numAluno){
          i++;
          System.out.printf( "%s\n%s",
         "Entre com o ra do aluno (deve ser > 0),nome,data,turma,curso,periodo,ano.",
         "? " );

          try {

              aluno.setRa(input.nextInt());
              aluno.setNome(input.next());
              aluno.setDatanasc(input.next());
              aluno.setTurma(input.next());
              aluno.setCurso(input.next());
              aluno.setPeriodo(input.next());
              aluno.setAno(input.nextInt());

              if (aluno.getRa() > 0) {
                  output.format(
                          "%d %s %s %s %s %s %d\n",
                          aluno.getRa(),
                          aluno.getNome(),
                          aluno.getDatanasc(),
                          aluno.getTurma(),
                          aluno.getCurso(),
                          aluno.getPeriodo(),
                          aluno.getAno());
              } else {
                  System.out.println("Ra do aluno deve ser maior que zero.");
              }
          } catch (FormatterClosedException formatterClosedException) {
              System.err.println("Erro ao gravar arquivo.");
              return;
          } catch (NoSuchElementException elementException) {
              System.err.println("Entrada inválida. Tente novamente.");
              input.nextLine();
          }

         System.out.printf( "%s\n%s",
         "Entre com o ra do aluno (deve ser > 0),primeiro nome,ultimo nome,idade,curso,periodo.",
         "? " );
       }
   }


   public void closeFile()
   {
      if ( output != null ) output.close();
   }
}
