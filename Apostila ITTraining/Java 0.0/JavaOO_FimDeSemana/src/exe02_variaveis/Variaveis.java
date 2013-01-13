package exe02_variaveis;

public class Variaveis {

	public static void main(String[] args) {
		
		// [final] <tipo> NOME [= <valor>];
		String texto="um texto qualquer";
		int i = 23;
		float moeda= 23.4f;
		double moedaDupla = 23.53445345645654;
		boolean isOk = true; // ou false
		
		//uso de operações
		int x= 12, y=23;
		System.out.println("Some de x e y ="+ (12+23) );
		
		//uso caracter underline
		float dinheiro = 1_234.50f;
		System.out.println("Dinheiro ="+ dinheiro );
		
	}

}
