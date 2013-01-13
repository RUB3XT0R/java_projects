import java.util.*;


public class Automato {

	StringBuilder cadeiaEntrada;
	char[] alfabeto;
	Estado inicial;
	//ex.: (q0,a)={q1} AFD  | (q0,a)={q0,q1,q2} AFN
	List<Estado> estados = new LinkedList<>();
	
	public static void main(String [] args){
		Automato a = new Automato();
		a.cadeiaEntrada = new StringBuilder("abab");
		a.alfabeto = new char[]{'a','b'};
		
		Estado q0 = new Estado();
		q0.nome ="q0";
		q0.isFinal = true;
		
		Estado q1 = new Estado();
		q1.nome ="q1";
		q1.isFinal = false;
		
		q0.transicoes.put('a',q1);
		q1.transicoes.put('b',q0);
		
		a.inicial = q0;
		
		Estado corrente = a.inicial;
		
		StringBuilder cadeia = a.cadeiaEntrada;
		
		for(int i=0; i<cadeia.length(); i++) {
			System.out.print("("+corrente.nome+","+cadeia.substring(i, cadeia.length())+")|-");
			char c = cadeia.charAt(i);
			corrente = corrente.transicoes.get(c);
			if(corrente == null && (cadeia.indexOf(c+"") != cadeia.length()-1)) { break;}
			System.out.print("("+corrente.nome+","+cadeia.substring(i, cadeia.length())+")|-");
		}
		System.out.println("");
		if(corrente !=null && corrente.isFinal) System.out.println("Cadeia Aceita");
		else System.out.println("cadeia não aceita");
		
	}
	
	
}
