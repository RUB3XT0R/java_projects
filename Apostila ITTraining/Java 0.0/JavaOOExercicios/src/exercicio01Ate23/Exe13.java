package exercicio01Ate23;

public class Exe13 {

	/**
	 * Imprima os primeiros números da série de Fibonacci até passar de 100. 
	 * A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
	 * Para calculá-la, o primeiro e segundo elementos valem 1, daí por diante, 
	 * o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
	 */
	public static void main(String[] args) {
		

		System.out.print("Série de Fibonacci até 100 usando while:\n 1 - 1");
		int atual=2, a=1, b=1;
		while(atual<100){
			atual=a+b;
			a=b;
			b=atual;
			System.out.print(" - "+b);
		}
		
		System.out.println();
		
		System.out.print("Série de Fibonacci até 100 usando do...while:\n 1 - 1");
		a=1; b=1;
		do{
			atual=a+b;
			a=b;
			b=atual;
			System.out.print(" - "+b);
		}while(atual<100);

		
	}

}
