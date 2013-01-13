package exercicio33;

/*
 * Modele um funcionario. 
 * Ele deve ter o nome do funcion�rio, o departamento onde trabalha, seu sal�rio (double), 
 * a data de entrada no banco (String), seu RG (String) 
 * e um valor booleano que indique se o funcion�rio ainda est� ativa na empresa no momento 
 * ou se j� foi mandado embora. 
 * 
 * Voc� deve criar alguns m�todos de acordo com sua necessidade. 
 * Al�m deles, crie um m�todo bonifica que aumenta o salario do funcion�rio de acordo com o par�metro passado 
 * como argumento. 
 * Crie, tamb�m, um m�todo demite, que n�o recebe par�metro algum, s� modifica o valor booleano indicando 
 * que o funcion�rio n�o trabalha mais aqui.
 * 
 * Crie um m�todo toString(), que n�o recebe nem devolve par�metro algum e simplesmente imprime todos os atributos 
 * do nosso funcion�rio.
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
