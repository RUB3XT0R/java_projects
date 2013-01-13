package exercicio01Ate23;

public class Exe10 {

	/**
	 *Imprima os fatoriais de 1 a 10.
	 */
	public static void main(String[] args) {
		
		//antes de responder, vamos estudar como se faz um fatorial
		int fat=1, i=1;
		while(i<=5){
			fat*=i;
			i++; 
		}
		System.out.println("Fatorial de 5 usando while:"+fat);
		
		fat=1; 
		i=1;
		do{
			fat*=i;
			i++; 
		}while(i<=5);
		System.out.println("Fatorial de 5 usando do...while:"+fat);
		
		fat=1;
		for(i=1;i<=5;i++) 
			fat*=i;
		System.out.println("Fatorial de 5 usando for:"+fat);

		
		//usaremos o for no exercicio por ser mais simples.
		//esse exercicio consta de um laço de reptição indo de 1 até 10 
		//e outro interno realizando o fatorial.
		for(i=1;i<=10;i++){
			fat=1;
			for(int y=1;y<=i;y++) fat*=y;
			System.out.println("Fatorial de "+i+":"+fat);
		}
		//repare que é possivel várias combinações de laços de repetição nesse exercicio.
				
		
		
	}

}
