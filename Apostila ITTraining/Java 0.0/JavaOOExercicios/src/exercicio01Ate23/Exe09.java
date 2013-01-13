package exercicio01Ate23;

public class Exe09 {

	/**
	 *Imprima todos os múltiplos de 3, entre 1 e 100
	 */
	public static void main(String[] args) {

		System.out.println("Multiplos de 3 usando while:");
		int i=1;
		while(i<100){
			System.out.println("- "+i);
			i*=3; //i=i*3
		}
		
		System.out.println("Multiplos de 3 usando do...while:");
		i=1;
		do{
			System.out.println("- "+i);
			i*=3;
		}while(i<100);
		
		System.out.println("Multiplos de 3 usando for:");
		for(i=1;i<100;i*=3) 
			System.out.println("- "+i);

	}

}
