package exe04_Exercicio;

import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		ArquivoReader controle = new ArquivoReader();
		
		Contato c = new Contato();
		c.setCodigo(1);
		c.setNome("Lucas");
		c.setTelefone("(11) 76542344");
		
		Contato c2 = new Contato();
		c2.setCodigo(2);
		c2.setNome("Ana");
		c2.setTelefone("(11) 87654958");
		
		Contato c3 = new Contato();
		c3.setCodigo(3);
		c3.setNome("João");
		c3.setTelefone("(11) 0981625");
		
		Agenda a = new Agenda();
		a.add(c);
		a.add(c2);
		a.add(c3);
			
		controle.gravarSer(a,"AgendaLucas");
		
		Agenda ag = controle.obterSer("AgendaLucas");
	
		Set<Integer> chaves = ag.getContatos().keySet();
		
		Contato cc;
        for (Integer i : chaves) {
        	cc = ag.getContatos().get(i);
        	System.out.println("Código: "+cc.getCodigo()+" Nome: "+cc.getNome()+" Telefone: "+cc.getTelefone());
        }
		
	}

}
