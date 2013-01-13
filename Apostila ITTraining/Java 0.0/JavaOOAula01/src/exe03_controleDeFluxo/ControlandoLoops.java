package exe03_controleDeFluxo;

import java.util.Scanner;

public class ControlandoLoops {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n;
		do{
			System.out.println("Entre com um n�mero positivo ou -1 para sair:");
			n = input.nextInt();
			
			if( n == -1) break; //caso seja -1 ele para o loop
			
			if( n<=0 ) continue; //caso seja negativo ele ignora as proximas instru��es e continua o loop
			
			System.out.println("A raiz do numero que voc� digitou �: "+Math.sqrt(n));
			
		}while(true);
		
		
	}

}
