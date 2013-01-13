package exe08_enumeracoes;

public enum AnimalType {

	caninos("C�es"),
	felinos("Gatos"),
	repteis("R�pteis"),
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
