package exercicio35;

public class FuncionarioTeste {

/*
 * Crie duas refer�ncias para o mesmo funcion�rio, compare-os com o ==. Tire suas conclus�es. 
 * O que acontece com o condicional do exerc�cio anterior?
 * */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Fiodor");
		f1.setSalario(100);

		Funcionario f2 = f1;

		System.out.println( f1 == f2 ? "iguais" : "diferentes");
		
		/**Resp.: ==, quando usado para ponteiros, verifica se a instancia 
		 * do objeto que eles aponta � a mesma, se for, eles s�o iguais, 
		 * se for outra instancia, eles s�o diferentes.
		 * Mas e no exercicio Anterior? se eu precisar detectar funcionarios
		 * com os mesmos valores de atributo?
		 * Utilizamos um m�todo chamado equals, sobreescrevemos ele na classe
		 * Funcionario para 'ensinar' como um funcion�rio � comparado com outro.
		*/
	}

}
