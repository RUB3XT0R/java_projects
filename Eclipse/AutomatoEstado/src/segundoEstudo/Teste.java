package segundoEstudo;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Automato a = new  Automato();
		
		a.cadeia = new StringBuilder("aabbaabb");
		a.alfabeto = new char[]{'a','b'};
		
		Estado q0 = new Estado(true,"q0");
		Estado q1 = new Estado(false,"q1");
		Estado q2 = new Estado(false,"q2");
		
		q0.newTransaction('a',q1);
		q0.newTransaction('b',q2);
		q1.newTransaction('a',q0);
		q2.newTransaction('b',q0);
		
		a.inicial = q0;

        
        if(a.iniciar()) System.out.println("Cadeia Aceita");
		else System.out.println("cadeia não aceita");
	    
			
	}

}
