package exercicio39;

public class TestaEmpresa {

	/**
	 *  Testando contain
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
		empresa.addFuncionario(f); //colocando f na empresa

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

		System.out.println(empresa.contain(f)); //irá pertencer
		System.out.println(empresa.contain(f2)); //não irá
	}

}
