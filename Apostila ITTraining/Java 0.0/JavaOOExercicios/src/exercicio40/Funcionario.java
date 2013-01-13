package exercicio40;

/*
 * Faça com que sua classe funcionário possa receber, opcionalmente, 
 * o nome do funcionário durante a criação do objeto. Utilize construtores 
 * para obter esse resultado. Dica: utilize um construtor sem argumentos também.
 * */

public class Funcionario {
	
	private String nome;
	private String depto;
	private double salario;
	private Date dataEntrada; 
	private String rg;
	private boolean ativo;
	
	public Funcionario(){} //construtor padrão
	
	//construtor com nome
	public Funcionario(String string) {
		this.nome=nome;
	}
	
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
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
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
				+ salario + ", dataEntrada=" + dataEntrada.displayDate() + ", rg=" + rg
				+ ", ativo=" + ativo + "]";
	}
	
	
}
