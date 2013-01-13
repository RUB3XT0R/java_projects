package exe05_Interfaces;

public class Gato implements Animal {

	@Override
	public void gritar(){
		System.out.println("Miau!");
	}

	@Override
	public void andar() {
		System.out.println("gato andando!!");
	}

	@Override
	public void respirar() {
		System.out.println("gato respirando!!");
	}
}
