package exercicio31;

public class RetanguloTeste {

	/**
	 * Escreva  um  programa para testar a classe Rectangle.
	 */
	
	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		r.setLength(0); //não vai colocar o valor
		System.out.println("Length :"+r.getLength());
		
		r.setLength(5); //vai colocar o valor
		System.out.println("Length :"+r.getLength());
		
		r.setWidth(0); //não vai colocar o valor
		System.out.println("Width :"+r.getWidth());
		
		r.setWidth(5); //vai colocar o valor
		System.out.println("Width :"+r.getWidth());
		
		
		System.out.println("Perimetro :"+r.getPerimetro()+", Área: "+r.getArea());
		
	}

}
