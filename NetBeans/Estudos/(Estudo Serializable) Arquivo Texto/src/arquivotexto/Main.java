

package arquivotexto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

    
    public static void main(String[] args) {
        Main aq = new Main();
        String temp=aq.lerArquivo("dados.txt");
        System.out.println(temp);
        int[][] m = aq.montaMatriz(temp);
        aq.mostraMatriz(m);

        Matriz calDet = new Matriz();
        System.out.println("Determinante: "+calDet.determinante(m));
        //entender o calculo do determinante e gravação.
    }

    public void escrever(String dado){
        try{
        FileWriter escreve = new FileWriter("dados.text");
        }catch(IOException e){e.printStackTrace();}
    }

    public void mostraMatriz(int[][] mt){
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                System.out.printf(" "+mt[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] montaMatriz(String texto){
        StringTokenizer st = new StringTokenizer(texto);

        int tam=Integer.parseInt(st.nextToken());
        int[][] tt = new int[tam][tam];

        String linha;
        int lin=0,col=0;
        while(st.hasMoreTokens()){
            //pega a linha dos numeros e separa eles, separação eh definida pelo virgula
            StringTokenizer subst = new StringTokenizer(st.nextToken(),",");
            //pega os numeros separados e coloca na matriz.
            while(subst.hasMoreTokens()){
                tt[lin][col]=Integer.parseInt(subst.nextToken());
                col++;
            }
            col=0;
            lin++;
        }

        return tt;
    }

    public String lerArquivo(String arquivo){
        StringBuilder sb = new StringBuilder();

        try{

            FileReader leitura = new FileReader(arquivo);
            int c;
            do{
                c=leitura.read();
                if(c!=-1)
                    sb.append((char)c);
            }while(c!=-1);//termino do arquivo = -1
            leitura.close();

        }catch(IOException e){e.printStackTrace();}

        return sb.toString();
    }
}
