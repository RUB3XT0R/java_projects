package exercicio41;

/*
 * Adicione um atributo na classe funcionário de tipo int que se chama identificador. 
 * Esse identificador deve ter um valor único para cada instância do tipo funcionário. 
 * O primeiro funcionário instanciado tem identificador 1, o segundo 2, e assim por diante. 
 * */

public class Funcionario {
	
	private int id;
	private String nome;
	private String depto;
	private double salario;
	private Date dataEntrada; 
	private String rg;
	private boolean ativo;
	
	public Funcionario(){
		id = this.hashCode();
	} 
	
	public Funcionario(String string) {
		this.nome=nome;
		id = this.hashCode();
	}
	
	public int getId() {
		return id;
	}
	
	void bonifica(double aumento) {
	     salario += aumento;
	}
	
	void demite() {
	     ativo=false;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Funcionario [id=" + id + ", nome=" + nome + ", depto=" + depto
				+ ", salario=" + salario + ", dataEntrada=" + dataEntrada.displayDate()
				+ ", rg=" + rg + ", ativo=" + ativo + "]";
	}
	
	
	
	
}
