package exe08_enumeracoes;

public enum AnimalType {

	caninos("Cães"),
	felinos("Gatos"),
	repteis("Répteis"),
	aves("Aves"),
	peixes("Peixes"),
	ornitorinco("Ornitorinco");
	
	
	private final String nome;
	
	private AnimalType(String nome){
		this.nome = nome;		
	}
	
	public String getNome(){
		return nome;
	}
	
	public static AnimalType getValueOf(String value){
		for(AnimalType at : AnimalType.values()){
			if(at.getNome().equals(value)) return at;
		}
		return AnimalType.aves;
	}
	
	
}
