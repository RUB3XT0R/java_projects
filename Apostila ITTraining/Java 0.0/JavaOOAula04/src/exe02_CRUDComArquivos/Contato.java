package exe02_CRUDComArquivos;

public class Contato {

	private Integer codigo;
	private String nome;
	private String telefone;
		
	public Contato() {
		super();
	}

	public Contato(Integer codigo,String nome, String telefone) {
		super(); 
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return nome + " Tel.:=" + telefone;
	}
	
	
	
	
}
