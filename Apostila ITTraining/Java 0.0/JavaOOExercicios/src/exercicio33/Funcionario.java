package exercicio33;

/*
 * Modele um funcionario. 
 * Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário (double), 
 * a data de entrada no banco (String), seu RG (String) 
 * e um valor booleano que indique se o funcionário ainda está ativa na empresa no momento 
 * ou se já foi mandado embora. 
 * 
 * Você deve criar alguns métodos de acordo com sua necessidade. 
 * Além deles, crie um método bonifica que aumenta o salario do funcionário de acordo com o parâmetro passado 
 * como argumento. 
 * Crie, também, um método demite, que não recebe parâmetro algum, só modifica o valor booleano indicando 
 * que o funcionário não trabalha mais aqui.
 * 
 * Crie um método toString(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos os atributos 
 * do nosso funcionário.
 * */

public class Funcionario {
	
	private String nome;
	private String depto;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean ativo;
	
	void bonifica(double aumento) {
	     salario += aumento;
	}
	void demite() {
	     ativo=false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", depto=" + depto + ", salario="
				+ salario + ", dataEntrada=" + dataEntrada + ", rg=" + rg
				+ ", ativo=" + ativo + "]";
	}
	
	
}
