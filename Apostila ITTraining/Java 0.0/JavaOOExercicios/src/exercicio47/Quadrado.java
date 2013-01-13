package exercicio47;

public class Quadrado implements AreaCalculavel {

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public float calculaArea() {
		return this.lado * this.lado;
	}

}

