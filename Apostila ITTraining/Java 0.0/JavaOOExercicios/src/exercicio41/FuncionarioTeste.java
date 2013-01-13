package exercicio41;

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
		
	}

}
