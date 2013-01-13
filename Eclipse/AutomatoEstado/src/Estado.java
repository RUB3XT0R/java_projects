import java.util.HashMap;
import java.util.List;


public class Estado {
	boolean isFinal;
	String nome;
	//boolean isConsiderado, isAcessivel, isUtil
	//HashMap<Character,List<AutomatoAFD>> transicoes;
	HashMap<Character,Estado> transicoes = new HashMap<>();
	
	public Estado() {
		super();
	}
	
	
	public Estado(String nome) {
		super();
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return nome;
	}
	
	
	
	
}
