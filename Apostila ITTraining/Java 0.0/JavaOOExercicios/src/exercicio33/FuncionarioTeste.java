package exercicio33;

public class FuncionarioTeste {


	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		f.setNome("Alberto");
		f.setDepto("Vendas");
		f.setRg("34567876");
		f.setSalario(3000);
		f.setAtivo(true);
		f.setDataEntrada("20/03/2003");
		System.out.println(f.toString());
		
		f.bonifica(200); //passará a ter 3200 reais com salario
		System.out.println(f.toString());
		
		f.demite(); //demitimos ele
		System.out.println(f.toString());
		

		
	}

}
