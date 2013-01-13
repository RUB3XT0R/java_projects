package exe04_Polimorfismo;

public class Gato extends Animal {

	@Override
	public void gritar(){
		System.out.println("Miau!");
	}

	@Override
	public void andar() {
		System.out.println("gato andando...");
		
	}
}
