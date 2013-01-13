package exercicio38;

import java.util.LinkedList;
import java.util.List;

/*
 * Percorra o atributo funcionarios da sua instância da Empresa e imprima o 
 * salários de todos seus funcionários. Para fazer isso, você pode criar um método chamado 
 * mostraEmpregados dentro da classe Empresa.
 * Em vez de mostrar apenas o salário de cada funcionário, você pode chamar o método toString() 
 * de cada Funcionario da sua lista.
 * */

public class Empresa {

	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;
	
	public Empresa(){
		funcionarios = new LinkedList<Funcionario>(); 
	}
	
	public void addFuncionario(Funcionario f){
		if(f!=null) funcionarios.add(f);
	}
	
	public void mostraEmpregados(){
		for(Funcionario atual : funcionarios){
			if(atual.isAtivo()) System.out.println(atual.toString());
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}	
	
}
