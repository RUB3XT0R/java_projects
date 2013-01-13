/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matrizserializada;
import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class ClasseSerializada implements Serializable {

    String nome = "Nome da matriz";
    int[][] matriz = new int[10][10];

    public ClasseSerializada(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matriz[i][j]=i+j;
            }
        }
    }

     public void monstraClasse(){
            System.out.println(nome);
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[0].length;j++){
                    System.out.print(matriz[i][j]+",");
                }
                System.out.println();
            }
      }

}
