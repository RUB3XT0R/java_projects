package exe04_Polimorfismo;

public class Cachorro extends Animal {

	@Override
	public void gritar(){
		System.out.println("AuAuAu!!");
	}

	@Override
	public void andar() {
		System.out.println("cachorro andando...");
		
	}
	
	@Override
	public final void respirar(){
		System.out.println(" cachorro respirando...");
	}
}
