package exercicio37;

public class TestaEmpresa {

	/**
	 *  Crie uma classe TestaEmpresa que possuirá um método main. 
	 *  Dentro dele crie algumas instâncias de Funcionario e 
	 *  passe para a empresa pelo método addFuncionario. 
	 */
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
        empresa.setCnpj("123456");
        empresa.setNome("RipJobs");
        
		Funcionario f = new Funcionario();
		f.setNome("Alberto");
		f.setDepto("Vendas");
		f.setRg("34567876");
		f.setSalario(3000);
		f.setAtivo(true);
		f.setDataEntrada(new Date());
		  f.getDataEntrada().setDia(30);
		  f.getDataEntrada().setMes(3);
		  f.getDataEntrada().setAno(2003);
		empresa.addFuncionario(f);

		Funcionario f2 = new Funcionario();
		f2.setNome("Anabella");
		f2.setDepto("Marketing");
		f2.setRg("84562346");
		f2.setSalario(4100);
		f2.setAtivo(true);
		f2.setDataEntrada(new Date());
		  f2.getDataEntrada().setDia(15);
		  f2.getDataEntrada().setMes(8);
		  f2.getDataEntrada().setAno(2002);
		empresa.addFuncionario(f2);

		
	}

}
