package exercicio47;

public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel r = new Retangulo(3,2);
		System.out.println(r.calculaArea());

		AreaCalculavel q = new Quadrado(2);
		System.out.println(q.calculaArea());


	}

}
