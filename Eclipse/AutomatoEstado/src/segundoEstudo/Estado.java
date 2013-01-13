package segundoEstudo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Estado {
	
	boolean isFinal;
	String nome;
	//ex.: (q0,a)=q1 AFD  | (q0,a)={q0,q1,q2} AFN
	HashMap<Character,ArrayList<Estado>> transicoes = new HashMap<>();
	
	public Estado next(char simbolo){
		ArrayList<Estado> e = transicoes.get(simbolo);
		if(e==null)return null;
		return e.get(0);
	}
	
	void newTransaction(char simbolo,Estado...estados){
		ArrayList<Estado> ests = new ArrayList<>();
		for(Estado e : estados) ests.add(e);
		transicoes.put(simbolo,ests);
	}
	
	void delEstadoTransicao(char simbolo,Estado estado){
		 transicoes.get(simbolo).remove(estado);
	}
	
	void delTransicao(char simbolo){
		transicoes.remove(simbolo);
	}
	
	
	public Estado(String nome) {
		super();
		this.nome = nome;
	}

	public Estado(boolean isFinal, String nome) {
		super();
		this.isFinal = isFinal;
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
