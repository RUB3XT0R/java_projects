package exercicio37;

import java.util.LinkedList;
import java.util.List;

/*
 * Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma refer�ncia a uma lista de Funcionario, 
 * al�m de outros atributos que voc� julgar necess�rio. 
 * A Empresa deve ter um m�todo adiciona, que recebe uma refer�ncia a Funcionario como argumento, 
 * e guarda esse funcion�rio.
 * */

public class Empresa {

	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios; //criamos uma lista (collections do java)
	
	public Empresa(){ //o construtor inicia uma nova lista
		funcionarios = new LinkedList<Funcionario>(); 
	}
	
	public void addFuncionario(Funcionario f){
		if(f!=null) funcionarios.add(f);
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
