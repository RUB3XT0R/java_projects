package exercicio37;

/*
 *Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. 
 *Faça com que seu funcionário passe a usá-la. 
 * Modifique seu método toString() para que ele imprima o valor da dataDeEntrada daquele Funcionario. 
 * */

public class Funcionario {
	
	private String nome;
	private String depto;
	private double salario;
	private Date dataEntrada; //alteramos aqui
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
	
	//alteramos aqui
	public Date getDataEntrada() {
		return dataEntrada;
	}
	//alteramos aqui
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
	
	//alteramos aqui
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", depto=" + depto + ", salario="
				+ salario + ", dataEntrada=" + dataEntrada.displayDate() + ", rg=" + rg
				+ ", ativo=" + ativo + "]";
	}
	
	
}
