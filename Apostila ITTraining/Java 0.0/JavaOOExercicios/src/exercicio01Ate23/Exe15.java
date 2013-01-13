package exercicio01Ate23;

public class Exe15 {

	/**
	 *  Imprima a seguinte tabela, usando fors encadeados:
		1
		4
		6 9
		8 12 16
		n n*2 n*3 .... n*n
	 */
	public static void main(String[] args) {
		
		
		int linha=1, coluna=1;
		int n=10;

		System.out.println(" 1");
		for(linha=2;linha<=10;linha+=1){
			for(coluna=2;coluna<=linha;coluna+=1){
				System.out.print(" "+linha*coluna);
			}
			System.out.println();			
		}
	}

}
