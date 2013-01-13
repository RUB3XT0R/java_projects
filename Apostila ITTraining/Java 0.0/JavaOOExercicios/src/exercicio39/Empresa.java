package exercicio39;

import java.util.LinkedList;
import java.util.List;

/*
 * Crie um método para verificar se um determinado Funcionario 
 * se encontra ou não como funcionário desta empresa.
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
	
	public boolean contain(Funcionario f){
		for(Funcionario atual : funcionarios){
			if(atual.getNome().equals(f.getNome())) return true;
		}
		return false;
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
