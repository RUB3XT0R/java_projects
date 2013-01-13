

import java.util.ArrayList;
import java.util.HashMap;

public class Estado {
	
	private boolean isFinal;
	private String nome;
	private boolean consideracao; //usado para os algoritmos de elimina__o de estados inuteis e inacessiveis
	// q: (a => qo,q1,...),(b => qo,q1,...),(c => qo,q1,...)...
	HashMap<Character,ArrayList<Estado>> transicoes = new HashMap<>();
	
	private int xCentral,yCentral;
	
	public Estado(String nome) {
		super();
		this.nome = nome;
		isFinal = false;
		consideracao = false;
	}
	
	public Estado(boolean isFinal, String nome) {
		super();
		this.nome = nome;
		this.isFinal = isFinal;
		consideracao = false;
	}

    @Override
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

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isConsideracao() {
		return consideracao;
	}

	public void setConsideracao(boolean consideracao) {
		this.consideracao = consideracao;
	}

	public HashMap<Character, ArrayList<Estado>> getTransicoes() {
		return transicoes;
	}

	public void setTransicoes(HashMap<Character, ArrayList<Estado>> transicoes) {
		this.transicoes = transicoes;
	}

	public int getXCentral() {
		return xCentral;
	}

	public void setXCentral(int xCentral) {
		this.xCentral = xCentral;
	}

	public int getYCentral() {
		return yCentral;
	}

	public void setYCentral(int yCentral) {
		this.yCentral = yCentral;
	}

	
	
}
