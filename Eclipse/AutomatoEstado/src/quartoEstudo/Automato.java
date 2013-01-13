package quartoEstudo;


	import java.lang.reflect.Array;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Set;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	import segundoEstudo.Estado;


	public class Automato {

		Estado inicial;
		char[] alfabeto;
		ArrayList<Estado> estados = new ArrayList<>();
		
		public void addEstado(String nome){
			estados.add(new Estado(nome)); //adiciona novo estado
		}
		
		public void turnFinal(String nome) {
			estados.get(estados.indexOf( new Estado(nome) )).isFinal=true;
		}
		
		public void setInicial(String nome) {
			inicial =  estados.get(  estados.indexOf( new Estado(nome) ) );	
		}
		
		public void newTransicao(String estadoOrigem, String simbolo, String... estadosDestinos) {
			//verifica se o simbolo � vazio(E) ou perten�e ao alfabeto, caso contrario n�o adiciona a transi��o
			boolean pertence=true;
			for(char a : alfabeto ) if(simbolo.charAt(0)==a) pertence=true;
			if(!pertence)return;
			
			//captura do estado de origem
			Estado e = estados.get(estados.indexOf(new Estado(estadoOrigem)));
			
			//Caso j� exista a transi��o com o simbolo,
			//o(s) estado(s) e(s�o) adicionado(s) a lista
			if (e.transicoes.containsKey(simbolo.charAt(0))){
				for(String est : estadosDestinos) 
					e.transicoes.get(simbolo.charAt(0)).add( estados.get(estados.indexOf(new Estado(est)))   );
			}else{
				//caso n�o exista, uma lista de estados � criada e inserida a nova transi��o
			    ArrayList<Estado> listadestinos = new ArrayList<>();
			    for(String est : estadosDestinos) 
			    	listadestinos.add(  estados.get(estados.indexOf(new Estado(est)))  );
			    e.transicoes.put(simbolo.charAt(0),listadestinos);
			}
		}

		public void eliminarTransicoesEmVazio(){
			//percorre cada estado do automato
			for(Estado q : estados){
				//se contem uma trasi��o em vazio (caracter 'E')
				if(q.transicoes.containsKey('E')){
					//capturo a lista de estados destinos dessa transi��o
					ArrayList<Estado> listadestinos = q.transicoes.get('E');
					//para cada estado destino dessa transi��o, eu vou copiar as transi��es
					for(Estado destino : listadestinos)
						for(char c : destino.transicoes.keySet()) 
							//para cada estado da transi��o em quest�o, 
							//crio uma transi��o nova para o estado q , mantenho o simbolo c, com o novo estado
							for(Estado est : destino.transicoes.get(c)) 
								newTransicao(q.nome,c+"",est.nome);
				    q.transicoes.remove('E'); //ao final removo a transi��o em vazio
				}
			}
		}
		
		private void eliminarNaoDeterminismo(){
			ArrayList<Estado> transNovo = new ArrayList<>();
			Estado Qnovo = new Estado(""),q;
			
			//percorre cada estado do automato
			//OBS.: N�o foi utilizado a itera��o foreach devido a altera��o da cole��o
			//que cria outro estado e gere um erro de concorrencia
			for(int i = 0; i< estados.size() ; i++){ 
			   q = estados.get(i); 
			   //para todas as transi��es, capturo a lista de estados
			   for(char chave : q.transicoes.keySet()){  
				 transNovo = q.transicoes.get(chave);
				 //se o tamanho da lista de transi��es for maior que 1 existe n�o-determinismo
				 if(transNovo.size()>1){                      
				   Qnovo = new Estado("q"+estados.size()); //� criado um novo estado
				   estados.add(Qnovo); //esse estado pe adicionado a lista
				   //para cada estado da transi��o em quest�o, 
				   //para cada estado destino, copiam-se suas transi��es para o novo estado.
				   for(Estado destino : transNovo){
					 if (destino.isFinal) Qnovo.isFinal=true; //basta um dos estados serem finais para o novo estado tambem ser.
					 for(char c : destino.transicoes.keySet()) 
					   for(Estado est : destino.transicoes.get(c)) 
						  newTransicao(Qnovo.nome, c+"" ,est.nome); 
				   }
				   //ao final troco a referencia a todos os estados da lista para o novo estado.
			       transNovo.clear(); 
			       transNovo.add(Qnovo); 
			     }
			   }
			}                  				
		}
		
		private void eliminarEstadosInacessiveis(){
			elEInac(inicial); //fun��o que percorre recursivamente o 'grafo' inciando pelo estad inicial
			deletarEstadosInvalidos(); //ap�s a identifica��o dos estados inacessiveis: considerado=false
		}
		private void elEInac(Estado atual){
			atual.consideracao = true; //todo estado a ser analizado � acessivel, pois teve referencia de outro que chamou a fun��o
			ArrayList<Estado> lista = new ArrayList<>();
			//para cada transi��o, captura a lista de estados "que na teoria e pr�tica ter� apenas um estado" (AFD)
			for(char c : atual.transicoes.keySet()){
				lista = atual.transicoes.get(c);
				for(Estado e : lista) elEInac(e); //cada estado dessa transi��o (um apenas, devido ao algoritmo anterior) ser� marcado e analizado
			}
		}
		private void eliminarEstadosInuteis(){
			for(Estado e : estados) //com quase o mesmo principio do anterior, a itera��o varre e procura apenas os estados finais
				if(e.isFinal) elEInut(e); //esses n�o considerados uteis, e um itera��o � feita para se decobrir os estados que levam a eles
			deletarEstadosInvalidos(); //ap�s a identifica��o dos estados inuteis, eles s�o deletados
		}
		private void elEInut(Estado atual){
			for(Estado e : estados){ //percorre os estados em busca de refrencias ao estado atual.
			 if(e.equals(atual) || e.consideracao) continue; //despreza se for o atual ou j� considerado
			 for(char c : e.transicoes.keySet()){ //para cada transi��o
				// verifica se a lista de cada transi��o contem o estado, sen�o tiver, passa para a proxima
				if (e.transicoes.get(c).contains(atual)){
					//senao for inicial..continua a procura recursivamente, at� chegar no estado inicial.
					//demonstrando que n�o somente � util, como acessivel.
					if(!inicial.equals(e)) elEInut(e);
					e.consideracao = true; //uma vez que se mostrou util, � marcado.
					break; //a itera��o  para, posi n�o h� mais necessidade de percorrer as transi��es, uma vez que o estado j� � util.
				}
			 }
			}
			atual.consideracao = true; //por ultimo, o estado atual � marcado como util.
		}
		
		private void deletarEstadosInvalidos(){
			//percorre os estado, o uso de um contador ao inves da itera��o for each, se baseia na mesma razao do algotitmo de elimina��o
			//de n�o determinismo
			for(int i=0; i<estados.size(); i++){
				Estado e = estados.get(i); //captura o estado atual
				if(e.consideracao) continue; //se for considerado util ou acessivel, ignora as instrutl�es e vai ao proximo;
				for(Estado ee : estados) //inicia-se a busca, em cada estado por referencias/transsi��es que o contenha
					for (char c : ee.transicoes.keySet())
						//cas encontre alguma transi��o a esse estado a ser deletado, ela � removida
						if (ee.transicoes.get(c).contains(e)) ee.transicoes.get(c).remove(e); 
				estados.remove(i); //somente apos remover as referencias do estado, � possivel removelo com seguran�a.
			}
			//apos as remo��es, uma nova itera��o � feita ara remover transi��es vazias (que ficaram se referencia a nenhum estado)
			for(Estado e : estados){ 
				e.consideracao=false;	//os estados n�o desmarcados para execu��o de um proximo algoritmo.
				//como n�o ser� acrescentado nenhuma tarsni��o,o estado dessa pode ser guardado 
				//para controlar a itera��o
				Set<Character> cs = e.transicoes.keySet();
				for (char c : cs) //para cada transi��o, se esta estiver vazia, � removida.
					if (e.transicoes.get(c).isEmpty()) e.transicoes.remove(c);
			}
		}
		
		private void minimizando(){}
		
		public void minimizar(){
			gerarRelatorio("----Automato original----");
			eliminarTransicoesEmVazio();
			gerarRelatorio("----Eliminada as transi��es em vazio----");
			eliminarNaoDeterminismo();
			gerarRelatorio("----Eliminados os N�o determinismos----");
			eliminarEstadosInacessiveis();
			gerarRelatorio("----Eliminados estados inacessiveis----");
			eliminarEstadosInuteis();
			gerarRelatorio("----Eliminados estados inuteis----");
			minimizando();
			gerarRelatorio("----Minimizando ----");
			eliminarEstadosInacessiveis();
			gerarRelatorio("----Eliminados estados inacessiveis----");
			eliminarEstadosInuteis();
			gerarRelatorio("----Automato Minimizado:----");
		}
		
	    public String toString(){
			String toReturn="Alfabeto de Entrada: ";
			for(char c : alfabeto) toReturn+=" - "+c;
			toReturn+="\nEstados: ";
			for(Estado e : estados)toReturn+=" - "+e;
			toReturn+="\nTransi��es: ";
			for(Estado e : estados){
				for(char c : e.transicoes.keySet()){
					toReturn+="("+e+","+c+") = {";
					for(Estado ee : e.transicoes.get(c)){ toReturn+=ee+",";}
					toReturn = toReturn.substring(0,toReturn.length()-1) + "} ; ";
					
				}
			}
			toReturn+="\nEstados Finais: ";
			for(Estado ee : estados) if(ee.isFinal)toReturn+="- "+ee;
			toReturn+="\nEstado inicial: "+inicial;
			return toReturn;
		}
		
	    public void gerarRelatorio(String oper){
	    	System.out.println(oper);
	    	System.out.println(toString());
	    }
	    
	    public static void main(String[] args){
			
			Automato a = new  Automato();
			String automato="M1=({q0,q1,q2,q3,q4}," +
					           "{a,b,c}," +
					           "{(q0,a)=q1 ; (q0,b)=q2 ; (q0,E)={q2,q3} ; (q2,c)={q3,q1} ; (q3,a)=q4;}," +
					           "{q0}," +
					           "{q2,q3})";
			String iscompleta = "[m|M][1-9]=\\(\\{(q[0-9]|,)*\\}," +
					            "\\{([a-z]|,)*\\}," + 
					            "\\{(\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?|\\s;\\s|;)*\\}," + //{(q0,a) = q1 ; (q0,b) = q2 ; (q0,E) = {q2,q3} },
					            "\\{(q[0-9])*\\}," + //{q0},
					            "\\{(q[0-9]|,)*\\}\\)"; //{q2,q3})

	        if(automato.matches(iscompleta)); 
			else{ 
				System.out.println("Automato de entrada n�o confere com o padr�o:\n "+automato+" \nDeve seguir o modelo:\n " +
						"M1=(Estados,Alfabeto,Transi��es,Estado Inicial,Estados Finais)\n " +
						"M1=({q0,q1,q2,q3,...}," +
						"{a,b,...}," +
						"{(q0,a)=q1 ; (q0,E)={q2,q3,...} ...}," +
						"{q0}," +
						"{q2,...})");
				return;
			}		
			System.out.println("Automato: "+automato); 
			Matcher m;
			
			//** estudo do alfabeto em modo texto **//
			m = Pattern.compile("\\{([a-z]|,)*\\}").matcher(automato);  //captura {a,b,c...}
			String simbolos = m.find() ? m.group().replaceAll("\\{|\\}|,", "") : "E";
			a.alfabeto = simbolos.toCharArray();
			
			 //** estudo dos estados em modo texto **//
			m = Pattern.compile("[m|M][1-9]=\\(\\{(q[0-9]|,)*\\}").matcher(automato);          //captura M1={q0,q1,q2,q3,...}
			m = Pattern.compile("q[0-9]").matcher( m.find() ? m.group() : "");   //captura os estados
	        while(m.find()) a.addEstado(m.group());
					
			//** estudo das transi��es em modo texto **//
			String patt = "\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?"; //captura: (q0,b) = q2 ou (q0,E) = {q2,q3}
			m =  Pattern.compile(patt).matcher(automato);
			String estadoOrigem="",simbolo="",transicao="";
	        String[] estadosDestinos = args;
	        Matcher subm;
			while (m.find()){
				transicao = m.group(); //(qu,a)={qv,qn,qm,...}
				subm =  Pattern.compile("\\(q[0-9],").matcher(transicao); //captura o estado origem
				while(subm.find()) estadoOrigem = subm.group().replaceAll("\\(|,", "");
				subm =  Pattern.compile("([a-z]|E)\\)").matcher(transicao); //captura o estado origem
				while(subm.find()) simbolo = subm.group().replaceAll("\\)", "");
				subm =  Pattern.compile("=\\{?(q[0-9]|,){1,}\\}?").matcher(transicao); //captura o estado origem
				while(subm.find()) estadosDestinos = subm.group().replaceAll("\\)|=|\\{|\\}", "").split(",");
	            a.newTransicao(estadoOrigem,simbolo,estadosDestinos);
			}

			//** estudo dos estados finais em modo texto **//
			m = Pattern.compile("\\{(q[0-9]|,)*\\}\\)").matcher(automato);          //captura {q2,q3})
			m = Pattern.compile("q[0-9]").matcher( m.find() ? m.group() : "");   //captura os estados finais
			while(m.find()) a.turnFinal(m.group());
			
			
			//** estudo do estado inicial em modo texto **//
			m = Pattern.compile(",\\{q[0-9]\\},").matcher(automato);          //captura {q0})
			while(m.find()) a.setInicial( m.group().replaceAll("\\{|\\}|,", "") );
				

		   a.minimizar();
		}

		
		

		
	
}
