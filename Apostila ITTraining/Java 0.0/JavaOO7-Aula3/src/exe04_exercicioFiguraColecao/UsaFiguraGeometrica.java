package exe04_exercicioFiguraColecao;

import java.util.*;

public class UsaFiguraGeometrica {

	public static void main(String[] args) {
	
		int i;
		Scanner sc = new Scanner(System.in);
		List<FiguraGeometrica> figuras = new ArrayList<>();
		do{
			
			System.out.println("---Menu:---");
			System.out.println("---0) Circulo");
			System.out.println("---1) Quadrado");
			System.out.println("---2) Triangulo");
			System.out.println("Escolha uma figura para adicionar " +
					"ou -1 para sair");
			i = sc.nextInt();
			if(i==-1)break;
			switch (i){
				case 0: //figuras.add(new Circulo()); 
					    Circulo c = new Circulo();
					    c.pegaDados();
					    figuras.add(c);
					    break;
				case 1: //figuras.add(new Quadrado());
				        Quadrado q = new Quadrado();
			            q.pegaDados();
			            figuras.add(q);
			            break;
				case 2: // figuras.add(new Triangulo());
					    Triangulo t = new Triangulo();
		                t.pegaDados();
		                figuras.add(t);
		                break;
				default : System.out.println("---Código inválido!");
			}		
			
		}while(true);
		
		//for(FiguraGeometrica fg : figuras) fg.pegaDados();
		for(FiguraGeometrica fg : figuras)
			System.out.println("Área do "+fg.getInformacao()+": "+
		fg.calcularArea());
		
	}
}
