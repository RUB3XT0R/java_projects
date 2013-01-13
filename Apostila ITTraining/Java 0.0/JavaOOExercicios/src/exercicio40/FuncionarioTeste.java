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
		
		// Por que voc� precisa do construtor sem argumentos para que a passagem do nome seja opcional?
		Funcionario f1 = new Funcionario();
		
		/**
		 * Resp.: Voc� n�o precisa especificar um construtor, por padr�o
		 * As classes Java j� vem com um construtor sem argumentos.
		 * POrem, uma vez que voc� especifica um construtor com argumentos
		 * o construtor padr�o � removido. Desse modo, caso voc� queira o 
		 * construtor padrao, ter� de cria-lo.
		 * 
		 * Construtores padr�es s�o muito usados em Enterprise Java beans do JEE (S�o obrigatorios)
		 * 
		 * E tamb�m muitas vezes voc� n�o vai ter naquele momento os dados para serem passados,
		 * mas vai precisar criar o objeto, ent�o, o contrutor padr�o servir� a sua causa.
		 * */
	}

}
