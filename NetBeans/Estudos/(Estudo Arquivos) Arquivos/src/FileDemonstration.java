/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



// Fig. 14.4: FileDemonstration.java
// Demonstrando a classe File.
import java.io.File;

public class FileDemonstration
{
   // exibe informações sobre o arquivo que o usuário especifica
   public void analyzePath( String path )
   {
      // cria o objeto File com base na entrada de usuário
      File name = new File( path );

      if (name.exists()) // se o nome existir, gera saída das informações sobre ele
      {
         // exibe informações sobre o arquivo (ou diretório)
         System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            name.getName(), " exists",
            ( name.isFile() ? "is a file" : "is not a file" ),
            ( name.isDirectory() ? "is a directory" :
               "is not a directory" ),
            ( name.isAbsolute() ? "is absolute path" :
               "is not absolute path" ), "Last modified: ",
            name.lastModified(), "Length: ", name.length(),
            "Path: ", name.getPath(), "Absolute path: ",
            name.getAbsolutePath(), "Parent: ", name.getParent());

         if (name.isDirectory()) // listagem de diretório de saída
         {
            String directory[] = name.list();
            System.out.println( "\n\nDirectory contents:\n" );

            for ( String directoryName : directory )
               System.out.printf( "%s\n", directoryName );
         } // fim do else
      } // fim do if externo
      else // não for arquivo ou diretório, gera saída da mensagem de erro
      {
         System.out.printf( "%s %s", path, "does not exist." );
      } // fim do else
   } // fim do método analyzePath
} // fim da classe FileDemonstration
