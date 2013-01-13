package exe05_Interfaces;

public class TestaAnimal {

	public static void main(String[] args) {

		Animal b = new Cachorro();
		
		//instance of? o que é?
		if(b instanceof Animal ) b.gritar();
		
		//downcasting
		Cachorro c;
		if(b instanceof Cachorro ) 
			c = (Cachorro) b;
		
		//sendo animal um gato
		b = new Gato();
		b.gritar();
				
		//sendo animal um cavalo
		b = new Cavalo();
		b.gritar();
				
	}

}
