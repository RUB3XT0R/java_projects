package exe11_exercicioFigura;

import java.util.Scanner;

public class Quadrado implements FiguraGeometrica {

	public double lado;
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public String getInformacao() {
		return "Quadrado";
	}

	@Override
	public void pegaDados() {
		System.out.println("Entre com o lado do Quadrado: ");
		lado = (new Scanner(System.in)).nextDouble();
	}
	
}

