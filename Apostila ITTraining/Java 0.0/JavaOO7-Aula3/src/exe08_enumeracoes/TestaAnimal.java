package exe08_enumeracoes;

public class TestaAnimal {


	public static void main(String[] args) {
		
		//mostra todas as opções
		for(AnimalType animal : AnimalType.values()){
			System.out.println(animal.getNome());
		}
		
		//criando um enum - dferente de um objeto.
		AnimalType a = AnimalType.repteis;
		System.out.println(a.getNome());
		
		//mostrar que não dá certo, depois trocar valueOf por getValueOf()
		AnimalType b = AnimalType.getValueOf("Peixes");
		System.out.println(b.getNome());
	}

}
