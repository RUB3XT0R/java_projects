package exercicio01Ate23;

public class Exe13 {

	/**
	 * Imprima os primeiros n�meros da s�rie de Fibonacci at� passar de 100. 
	 * A s�rie de Fibonacci � a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
	 * Para calcul�-la, o primeiro e segundo elementos valem 1, da� por diante, 
	 * o n-�simo elemento vale o (n-1)-�simo elemento somado ao (n-2)-�simo elemento (ex: 8 = 5 + 3).
	 */
	public static void main(String[] args) {
		

		System.out.print("S�rie de Fibonacci at� 100 usando while:\n 1 - 1");
		int atual=2, a=1, b=1;
		while(atual<100){
			atual=a+b;
			a=b;
			b=atual;
			System.out.print(" - "+b);
		}
		
		System.out.println();
		
		System.out.print("S�rie de Fibonacci at� 100 usando do...while:\n 1 - 1");
		a=1; b=1;
		do{
			atual=a+b;
			a=b;
			b=atual;
			System.out.print(" - "+b);
		}while(atual<100);

		
	}

}
