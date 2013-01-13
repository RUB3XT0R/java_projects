package exe11_exercicioFigura;

import java.util.Scanner;

public class Triangulo implements FiguraGeometrica {

	public double base,altura;
	
	@Override
	public double calcularArea() {
		return (base * altura)/2;
	}

	@Override
	public String getInformacao() {
		return "Triangulo";
	}

	@Override
	public void pegaDados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a altura do Triangulo: ");
		altura = sc.nextDouble();
		System.out.println("Entre com a base do Triangulo: ");
		base = sc.nextDouble();
	}

}

