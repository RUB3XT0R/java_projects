package exe10_Interfaces;

public class Cachorro implements Animal {

	@Override
	public void gritar(){
		System.out.println("AuAuAu!!");
	}

	@Override
	public void andar() {
		System.out.println("cão andando!!");	
	}

	@Override
	public void respirar() {
		System.out.println("cão respirando!!");
	}
}
