package exe05_condicionais;

import java.util.Scanner;

public class OperadoresLogicos {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor ..:");
		int numero = sc.nextInt();
		
		System.out.println(
				(numero >= 20 && numero <= 90) ? 
			    "O Valor est� entre 20 e 90." :
			    "O Valor n�o est� entre 20 e 90.");
		
		System.out.println("Entre com o c�digo de acesso..:");
		int codigo = sc.nextInt();
		
		if( codigo==1 || codigo==2 || codigo==3){
			switch(codigo){
			  case 1: System.out.println("C�digo um!"); break;
			  case 2: System.out.println("C�digo dois!"); break;
			  case 3: System.out.println("C�digo tr�s!"); 
			}
		}else{
		    System.out.println("C�digo invalido!");
		}
		
	}

}
