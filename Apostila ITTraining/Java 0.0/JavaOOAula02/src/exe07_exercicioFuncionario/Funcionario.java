package exe07_exercicioFuncionario;

import java.util.Scanner;

public abstract class Funcionario {

	//para captura dos dados
	protected Scanner sc = new Scanner(System.in);
	public abstract String getProfissao();
	public abstract Double calcularSalario(); 
	public abstract void preencher();
	
}







