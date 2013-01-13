package exercicio01Ate23;

public class Exe12 {

	/**
	 *Escreva um aplicativo que calcule o produto dos inteiros impares de 1 a 15.
	 */
	public static void main(String[] args) {
		
		int i=1,prod=1;
		while(i<15){
			prod*=i;
			i+=2;
		}
		System.out.println("Produto dos inteiros impares de 1 a 15 usando while: "+prod);

		prod=1;
		i=1;
		do{
			prod*=i;
			i+=2;
		}while(i<15);
		System.out.println("Produto dos inteiros impares de 1 a 15 usando do...while: "+prod);

		prod=1;
		for(i=1;i<15;i+=2) 
			prod*=i;
		System.out.println("Produto dos inteiros impares de 1 a 15 usando for: "+prod);

	}

}
