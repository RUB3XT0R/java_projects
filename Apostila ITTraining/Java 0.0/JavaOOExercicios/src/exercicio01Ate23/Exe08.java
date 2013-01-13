package exercicio01Ate23;

public class Exe08 {

	/**
	 * Imprima a soma de 1 até 1000.
	 */
	public static void main(String[] args) {

		int soma=0, i=0;
		while(i<=1000){
			soma += i;
			i++;
		}
		System.out.println("Soma de 0 a 1000 feita por um while :"+soma);
			
		soma=0; 
		i=0;
		do{
			soma += i;
			i++;
		}while(i<=1000);
		System.out.println("Soma de 0 a 1000 feita por um do...while :"+soma);
		
		soma=0;
		for(i=0;i<=1000;i++) 
			soma += i;
		System.out.println("Soma de 0 a 1000 feita por um for :"+soma);
	
		
		//forma muito mais inteligente sem o uso de reptição (não é o objetivo desse exercicio)
		soma = (1000*1001)/2;
		System.out.println("Soma de 0 a 1000 feita sem repetição :"+soma);

	}
}
