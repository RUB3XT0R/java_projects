package exe09_Polimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		Animal b;
		//sendo animal um cachorro
		b = new Cachorro();
		b.gritar();
		//sendo animal um gato
		b = new Gato();
		b.gritar();
		//sendo animal um cavalo
		b = new Cavalo();
		b.gritar();
				
	}

}
