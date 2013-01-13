package exercicio01Ate23;

import java.util.Scanner;

public class Exe20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer number,digito1,digito2,digito4,digito5;
		
		do{
			System.out.println("Insira um numero palíndromo:");
			number=sc.nextInt();
		    if(number<100000){
				digito1= number%10; //deve ser igual a digito5
				digito2= (number/10)%10; //deve ser igual a digito4
				//digito3= (number/100)%10; //desprezível
				digito4= (number/1000)%10; //deve ser igaula a digito 2
				digito5= (number/10000)%10;  //deve ser igual a digito 1
				System.out.println(
						number+""+
				       ( (digito1==digito5 && digito2==digito4) ? ", é um palíndromo" : ", não é um palíndromo" ));
				break;
		    }
		}while(true);
		
	}

}
