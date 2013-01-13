
package controle;

import java.util.*;

public class Executavel {
    public static void main(String[] args){
    	
     Map mapaDePessoas = new HashMap();
     mapaDePessoas.put("PF", new PessoaFisica());
     mapaDePessoas.put("PJ", new PessoaJuridica());

     Pessoa pessoa = (Pessoa) mapaDePessoas.get("PF");
     Pessoa pessoa2 = (Pessoa) mapaDePessoas.get("PJ");

     pessoa2.imprime();
     pessoa.imprime();
  }
}
