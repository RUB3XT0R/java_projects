// Fig. 14.11: ReadTextFile.java
// Esse programa l� um arquivo de texto e exibe cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadTextFile
{
   private Scanner input;

   // permite ao usu�rio abrir o arquivo
   public void openFile()
   {
      try
      {
         input = new Scanner( new File( "clients.txt" ) );
      } // fim do try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error opening file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do m�todo openFile

   // l� o registro no arquivo
   public void readRecords()
   {
      // objeto a ser gravado na tela
      AccountRecord record = new AccountRecord();

      System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );

      try // l� os registros no arquivo utilizando o objeto Scanner
      {
         while (input.hasNext())
         {
            record.setAccount( input.nextInt() ); // l� o n�mero de conta
            record.setFirstName( input.next() ); // l� o primeiro nome
            record.setLastName( input.next() ); // l� o sobrenome
            record.setBalance( input.nextDouble() ); // l� o saldo

            // exibe o conte�do de registro
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",  
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // fim do while
      } // fim do try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // fim do catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error reading from file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do m�todo readRecords

   // fecha o arquivo e termina o aplicativo
   public void closeFile()
   {
      if ( input != null )
         input.close(); // fecha o arquivo
   } // fim do m�todo closeFile
} // fim da classe ReadTextFile


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/