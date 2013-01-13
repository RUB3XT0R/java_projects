package exe03_Stream;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		Contato other = (Contato) obj;
		if (codigo == null) {
			if (other.codigo != null) return false;
		} else if (!codigo.equals(other.codigo)) return false;
		if (nome == null) {
			if (other.nome != null) return false;
		} else if (!nome.equals(other.nome)) return false;
		if (telefone == null) {
			if (other.telefone != null) return false;
		} else if (!telefone.equals(other.telefone))return false;
		return true;
	}
	
	
	
	
}
