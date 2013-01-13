/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



// Fig. 14.9: CreateTextFileTest.java
// Testando a classe CreateTextFile.

public class CreateTextFileTest
{
   public static void main( String args[] )
   {
      CreateTextFile application = new CreateTextFile();

      application.openFile();
      application.addRecords();
      application.closeFile();
   } // fim de main
} // fim da classe CreateTextFileTest