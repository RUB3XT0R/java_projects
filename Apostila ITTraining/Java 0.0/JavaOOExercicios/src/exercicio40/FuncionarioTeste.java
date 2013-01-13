package exercicio40;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		

		Funcionario f = new Funcionario("Alberto");
		f.setDepto("Vendas");
		f.setRg("34567876");
		f.setSalario(3000);
		f.setAtivo(true);
		f.setDataEntrada(new Date());
		  f.getDataEntrada().setDia(30);
		  f.getDataEntrada().setMes(3);
		  f.getDataEntrada().setAno(2003);
		System.out.println(f.toString());
		
		// Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
		Funcionario f1 = new Funcionario();
		
		/**
		 * Resp.: Você não precisa especificar um construtor, por padrão
		 * As classes Java já vem com um construtor sem argumentos.
		 * POrem, uma vez que você especifica um construtor com argumentos
		 * o construtor padrão é removido. Desse modo, caso você queira o 
		 * construtor padrao, terá de cria-lo.
		 * 
		 * Construtores padrões são muito usados em Enterprise Java beans do JEE (São obrigatorios)
		 * 
		 * E também muitas vezes você não vai ter naquele momento os dados para serem passados,
		 * mas vai precisar criar o objeto, então, o contrutor padrão servirá a sua causa.
		 * */
	}

}
