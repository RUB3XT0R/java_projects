package exe02_Exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Dados do Aluno ----");
		System.out.println("Entre com o Nome ...:");
		a1.setNome(sc.next());
		System.out.println("Entre com o Curso ..:");
		a1.setCurso(sc.next());
		System.out.println("---- Notas do Aluno ----");
		for(int i=0; i< a1.getNotas().length; i++){
			System.out.println("Entre com a nota "+(i+1)+" ...:");
			a1.getNotas()[i] = sc.nextFloat();			
		}
		System.out.println("------------------------");
		System.out.println("Média do Aluno é: "+ a1.calculaMedia());
		System.out.println("------------------------");
	}

}
