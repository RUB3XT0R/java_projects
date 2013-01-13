package exe09_Polimorfismo;

public class Cavalo extends Animal {

	@Override
	public void gritar(){
		System.out.println("Iririii!!");
	}

	@Override
	public void andar() {
		System.out.println("cavalo andando...");
		
	}
	
}
