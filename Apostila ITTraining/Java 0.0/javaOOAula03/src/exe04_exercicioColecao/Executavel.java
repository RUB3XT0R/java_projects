package exe04_exercicioColecao;

import java.util.HashMap;
import java.util.Map;

public class Executavel {
	public static void main(String[] args){
	     Map mapaDePessoas = new HashMap();
	     mapaDePessoas.put("PF", new PessoaFisica());
	     mapaDePessoas.put("PJ", new PessoaJuridica());
	     Pessoa pessoa = (Pessoa) mapaDePessoas.get("PF");
	     pessoa.imprime();
	  }
}
