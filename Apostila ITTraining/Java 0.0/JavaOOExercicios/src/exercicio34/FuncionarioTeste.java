package exercicio34;

public class FuncionarioTeste {

/*
 * Construa dois funcionários com o new e compare-os com o ==. 
 * E se eles tiverem os mesmos atributos? Para isso você vai precisar criar outra referência.
 * 
 * */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Fiodor");
		f1.setSalario(100);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Fiodor");
		f2.setSalario(100);

		System.out.println( f1 == f2 ? "iguais" : "diferentes");
		
	}

}
