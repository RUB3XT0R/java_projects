package exe03_Colecoes;

import java.util.*;

public class Listas {


	public static void main(String[] args) {

		//declara��o sem generics
		List listaQualquer = new LinkedList();
		
		//declara��o com generics
		List<String> nomes = new LinkedList<String>();
		
		//adicionando dois nomes
		nomes.add("Ana");
		nomes.add("F�bio");
		//mostrando o nome 0
		System.out.println(nomes.get(0));
		//mostrando toda a lista
		System.out.println(nomes.toString());
		//removendo e mostrando o noem na posi��o 0
		System.out.println(nomes.remove(0));
		//mostrando toda a lista depois da remo��o
		System.out.println(nomes.toString());
		
		//adicionando mais dois nomes
		nomes.add("Carlos");
		nomes.add("Alfredo");
		System.out.println(nomes.toString());
		
		//ordenando a lista
		Collections.sort(nomes);
		System.out.println(nomes.toString());
		
		//misturando a lista
		Collections.shuffle(nomes);
		System.out.println(nomes.toString());
		
		
		Map<Integer,String> mapa = new HashMap<Integer,String>();
		mapa.put(1,"objeto e sua chave"); //insere um objeto com sua chave no mapa
		mapa.entrySet(); //retorna um conjunto (Set) com todos os elementos (chave-valor)
		mapa.keySet(); //retorna uma cole��o (collection) com todos as chaves
		mapa.values(); //retorna uma cole��o (collection) com todos os valores
		mapa.containsKey(1); //verifica se a chave est� no mapa
		
		
		
		
	}
	

}
