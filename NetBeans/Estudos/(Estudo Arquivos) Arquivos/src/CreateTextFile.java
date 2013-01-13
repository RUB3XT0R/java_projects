/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



// Fig. 14.7: CreateTextFile.java
// Gravando dados em um arquivo de texto com a classe Formatter.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile
{
   private Formatter output; // objeto utilizado para gerar saída de texto no arquivo

   // permite ao usuário abrir o arquivo
   public void openFile()
   {
      try
      {
         output = new Formatter( "clients.txt" );
      } // fim do try
      catch ( SecurityException securityException )
      {
         System.err.println(
            "You do not have write access to this file." );
         System.exit( 1 );
      } // fim do catch
      catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error creating file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método openFile

   // adiciona registros ao arquivo
   public void addRecords()
   {
      // objeto a ser gravado no arquivo
      AccountRecord record = new AccountRecord();

      Scanner input = new Scanner( System.in );

      System.out.printf( "Entre com o numero de contas a gravar" );

      int numContas = input.nextInt() ;
      int i=0;
      while (i<numContas) // faz um loop até o indicador de fim de arquivo
      {
          i++;
          System.out.printf( "%s\n%s",
         "Enter account number (> 0), first name, last name and balance.",
         "? " );

          try // gera saída dos valores para o arquivo
         {
            // recupera os dados para saída
            record.setAccount( input.nextInt() ); // lê o número de conta
            record.setFirstName( input.next() ); // lê o primeiro nome
            record.setLastName( input.next() ); // lê o sobrenome
            record.setBalance( input.nextDouble() ); // lê o saldo

            if ( record.getAccount() > 0 )
            {
               // grava um novo registro
               output.format( "%d %s %s %.2f\n", record.getAccount(),
                  record.getFirstName(), record.getLastName(),
                  record.getBalance() );
            } // fim do if
            else
            {
               System.out.println(
                  "Account number must be greater than 0." );
            } // fim do else
         } // fim do try
         catch ( FormatterClosedException formatterClosedException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // descarta entrada para o usuário tentar de novo
         } // fim do catch

         System.out.printf( "%s %s\n%s", "Enter account number (>0),",
            "first name, last name and balance.", "? " );
      } // fim do while
   } // fim do método addRecords

   // fecha o arquivo
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // fim do método closeFile
} // fim da classe CreateTextFile
