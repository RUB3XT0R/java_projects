import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Automato a = new  Automato();
		String automato="M1=({q0,q1,q2,q3,q4}," +
				           "{a,b,}," +
				           "{(q0,a)=q1 ; (q0,b)=q2 ; (q0,E)={q2,q3} ; (q2,c)=q2;}," +
				           "{q0}," +
				           "{q2,q3})";
		String iscompleta = "[m|M][1-9]=\\(\\{(q[0-9]|,)*\\}," +
				            "\\{([a-z]|,)*\\}," + 
				            "\\{(\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?|\\s;\\s|;)*\\}," + //{(q0,a) = q1 ; (q0,b) = q2 ; (q0,E) = {q2,q3} },
				            "\\{(q[0-9])*\\}," + //{q0},
				            "\\{(q[0-9]|,)*\\}\\)"; //{q2,q3})

        if(automato.matches(iscompleta)); 
		else{ 
			System.out.println("Automato de entrada não confere com o padrão:\n "+automato+" \nDeve seguir o modelo:\n " +
					"M1=(Estados,Alfabeto,Transições,Estado Inicial,Estados Finais)\n " +
					"M1=({q0,q1,q2,q3,...}," +
					"{a,b,...}," +
					"{(q0,a)=q1 ; (q0,E)={q2,q3,...} ...}," +
					"{q0}," +
					"{q2,...})");
			return;
		}		
		System.out.println("Automato: "+automato); 
		Matcher m;
		
		 //** estudo dos estados em modo texto **//
		m = Pattern.compile("[m|M][1-9]=\\(\\{(q[0-9]|,)*\\}").matcher(automato);          //captura M1={q0,q1,q2,q3,...}
		m = Pattern.compile("q[0-9]").matcher( m.find() ? m.group() : "");   //captura os estados
        while(m.find()) a.estados.add(new Estado(m.group()));  
		
		System.out.print("Estados: ");
		for(Estado e : a.estados)System.out.print(" - "+e);
		
		System.out.println("");
		
		
		//** estudo do alfabeto em modo texto **//
		m = Pattern.compile("\\{([a-z]|,)*\\}").matcher(automato);  //captura {a,b,c...}
		String simbolos = m.find() ? m.group().replaceAll("\\{|\\}|,", "") : "E";
		a.alfabeto = simbolos.toCharArray();
		
		System.out.print("Alfabeto de Entrada: ");
		for(char c : a.alfabeto)System.out.print(" - "+c);
		
		System.out.println("");
				
		//** estudo das transições em modo texto **//
		String patt = "\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?"; //captura: (q0,b) = q2 ou (q0,E) = {q2,q3}
		m =  Pattern.compile(patt).matcher(automato);
		ArrayList<String> gama = new ArrayList<>();
		while (m.find())  gama.add(m.group());  
		

		System.out.println("Transições: ");
		for(String s : gama){ System.out.println("- "+s);}
        

		//** estudo dos estados finais em modo texto **//
		m = Pattern.compile("\\{(q[0-9]|,)*\\}\\)").matcher(automato);          //captura {q2,q3})
		m = Pattern.compile("q[0-9]").matcher( m.find() ? m.group() : "");   //captura os estados finais
		Estado e;
		while(m.find()) {
			e= new Estado(m.group());
			a.estados.get(a.estados.indexOf(e)).isFinal=true;
		}
		
		System.out.print("Estados Finais: ");
		for(Estado ee : a.estados) if(ee.isFinal)System.out.print("- "+ee);
         
				
		System.out.println("");
		
		//** estudo do estado inicial em modo texto **//
		m = Pattern.compile(",\\{q[0-9]\\},").matcher(automato);          //captura {q0})
		while(m.find()) 
			a.inicial =  a.estados.get(  a.estados.indexOf( new Estado( m.group().replaceAll("\\{|\\}|,", "") ) ) );

       System.out.println("Estado inicial: "+a.inicial);
	   System.out.println("");
				
	}

}
