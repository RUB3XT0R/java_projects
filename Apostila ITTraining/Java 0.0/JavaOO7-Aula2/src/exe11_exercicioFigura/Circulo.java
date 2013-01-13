package exe11_exercicioFigura;

import java.util.Scanner;

public class Circulo implements FiguraGeometrica {

	public double raio;
	
	@Override
	public double calcularArea() {
		return Math.PI*raio*raio;
	}

	@Override
	public String getInformacao() {
		return "Circulo";
	}

	@Override
	public void pegaDados() {
		System.out.println("Entre com o raio do Circulo: ");
		raio = (new Scanner(System.in)).nextDouble();
	}

}

