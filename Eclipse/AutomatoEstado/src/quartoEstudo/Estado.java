package quartoEstudo;

import java.util.ArrayList;
import java.util.HashMap;

public class Estado {
	
	protected boolean isFinal;
	protected String nome;
	protected boolean consideracao; //usado para os algoritmos de eliminação de estados inuteis e inacessiveis
	// q: (a => qo,q1,...),(b => qo,q1,...),(c => qo,q1,...)...
	HashMap<Character,ArrayList<Estado>> transicoes = new HashMap<Character,ArrayList<Estado>>();
	
	public Estado(String nome) {
		super();
		this.nome = nome;
		isFinal = false;
		consideracao = false;
	}
	
	public String toString(){
		return nome;
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
	
	
}
