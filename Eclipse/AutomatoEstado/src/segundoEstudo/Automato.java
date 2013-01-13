package segundoEstudo;
import java.util.*;


public class Automato {

	StringBuilder cadeia;
	char[] alfabeto;
	Estado inicial;
	List<Estado> estados = new LinkedList<>();
	
	
	public boolean iniciar(){
		Estado corrente = inicial;
		// algoritmo válido apenas para os deterministicos
		int tam=cadeia.length();
		for(int i=0; i<tam; i++) {
			System.out.print("("+corrente+","
		                      +"["+cadeia.charAt(i)+"]"+
		                      cadeia.substring(i+1,tam)+")|-");
			char c = cadeia.charAt(i);
			corrente = corrente.next(c);
			if(corrente == null && (cadeia.indexOf(c+"") != cadeia.length()-1)) { break;}
		}
		return (corrente !=null && corrente.isFinal)? true: false;
	}
	
}
