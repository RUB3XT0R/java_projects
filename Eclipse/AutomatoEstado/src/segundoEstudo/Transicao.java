package segundoEstudo;

import java.util.ArrayList;

public class Transicao {

	char simbolo;
	ArrayList<Estado> estados = new ArrayList<>();
	
	public Estado next(){
		return estados.get(0);
	}
	
	public void add(Estado...estados){
		if(estados!=null || estados.length>=1){
			for(Estado e : estados) {
				if(this.estados.contains(e)) continue;
				this.estados.add(e);
			}
		}
	}
	
	public void del(Estado estado){
		if(estados.contains(estado)){
			estados.remove(estado);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + simbolo;
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
		Transicao other = (Transicao) obj;
		if (simbolo != other.simbolo)
			return false;
		return true;
	}
	
	
	
}
