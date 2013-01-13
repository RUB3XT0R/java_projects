package exercicio47;

public class Retangulo implements AreaCalculavel {

	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public float calculaArea() {
		return this.largura * this.altura;
	}

}
