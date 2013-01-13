package exe10_Interfaces;

public class Cavalo implements Animal {

	@Override
	public void gritar(){
		System.out.println("Iririii!!");
	}

	@Override
	public void andar() {
		System.out.println("cavalo andando!!");
	}

	@Override
	public void respirar() {
		System.out.println("cavalo respirando!!");
	}
	
}
