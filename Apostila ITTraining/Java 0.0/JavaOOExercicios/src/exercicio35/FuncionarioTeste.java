package exercicio35;

public class FuncionarioTeste {

/*
 * Crie duas referências para o mesmo funcionário, compare-os com o ==. Tire suas conclusões. 
 * O que acontece com o condicional do exercício anterior?
 * */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Fiodor");
		f1.setSalario(100);

		Funcionario f2 = f1;

		System.out.println( f1 == f2 ? "iguais" : "diferentes");
		
		/**Resp.: ==, quando usado para ponteiros, verifica se a instancia 
		 * do objeto que eles aponta é a mesma, se for, eles são iguais, 
		 * se for outra instancia, eles são diferentes.
		 * Mas e no exercicio Anterior? se eu precisar detectar funcionarios
		 * com os mesmos valores de atributo?
		 * Utilizamos um método chamado equals, sobreescrevemos ele na classe
		 * Funcionario para 'ensinar' como um funcionário é comparado com outro.
		*/
	}

}
