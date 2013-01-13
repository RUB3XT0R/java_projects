package exercicio38;

import java.util.LinkedList;
import java.util.List;

/*
 * Percorra o atributo funcionarios da sua inst�ncia da Empresa e imprima o 
 * sal�rios de todos seus funcion�rios. Para fazer isso, voc� pode criar um m�todo chamado 
 * mostraEmpregados dentro da classe Empresa.
 * Em vez de mostrar apenas o sal�rio de cada funcion�rio, voc� pode chamar o m�todo toString() 
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
