package exe11_exercicioFigura;

import java.util.Scanner;

public class UsaFiguraGeometrica {

	public static void main(String[] args) {
		
		FiguraGeometrica fig[] ={ new Circulo(), new Quadrado(), new Triangulo()};
		
		for(FiguraGeometrica fg : fig) fg.pegaDados();
		
		for(FiguraGeometrica fg : fig)
			System.out.println("Área do "+fg.getInformacao()+": "+fg.calcularArea());
		
		
	}
}
