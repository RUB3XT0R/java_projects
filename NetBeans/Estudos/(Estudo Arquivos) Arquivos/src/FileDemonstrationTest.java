/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 * 
 */




// Fig. 14.5: FileDemonstrationTest.java
// Testando a classe FileDemonstration.
import java.util.Scanner;

public class FileDemonstrationTest
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );
      FileDemonstration application = new FileDemonstration();

      System.out.print( "Enter file or directory name here: " );
      application.analyzePath( input.nextLine() );
   } // fim de main
} // fim da classe FileDemonstrationTest

