package exercicio37;

import java.util.LinkedList;
import java.util.List;

/*
 * Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma referência a uma lista de Funcionario, 
 * além de outros atributos que você julgar necessário. 
 * A Empresa deve ter um método adiciona, que recebe uma referência a Funcionario como argumento, 
 * e guarda esse funcionário.
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
