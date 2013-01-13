package exe02_CRUDComArquivos;

import java.util.*;

public class ContatosControle extends Arquivo{

	//criando a lista de contatos (Simula o Banco de dados)
	private HashMap<Integer,Contato> contatos;
	
	public ContatosControle(){
		contatos = new HashMap<Integer,Contato>();
	}
	
	private HashMap<Integer,Contato> getContatos(){
		Scanner input = readFile("contatos.txt");
		Contato contato;
		while(input.hasNext()){
			contato = new Contato();
			contato.setCodigo(input.nextInt());
			contato.setNome(input.next());
			contato.setTelefone(input.next());
			contatos.put(contato.getCodigo(),contato);
		}
		input.close();
		return contatos;
	}
	
	public HashMap<Integer,Contato> getLista(){
        return contatos;
    }
	
	public void salvarAlteracoes() {
        openFile("contatos.txt");
        Set<Integer> chaves = contatos.keySet();
        Contato c;
        for (Integer i : chaves) {
        	c = contatos.get(i);
            getOutput().format("%d %s %s\n",
                    c.getCodigo(),
                    c.getNome(),
                    c.getTelefone());
        }
        closeFile();
    }
	
	public Contato getContato(int codigo) {
		return contatos.get(codigo) ;
    }
	
	public boolean add(Contato c) {
        if (c == null) {
            System.out.println("Contato esta vazio.");
            return false;
        }
        if (contatos.containsValue(c)) {
        	System.out.println("Contato já existe.");
            return false;
        }
        contatos.put(c.getCodigo(),c);
        return true;
    }

	public boolean del(Contato c) {
        if (c == null) {
            System.out.println("Contato esta vazio.");
            return false;
        }
        if (contatos.containsValue(c)) {
        	contatos.remove(c.getCodigo());
            return true;
        } else {
        	System.out.println("Não foi possível deletar o contato, o mesmo não existe.");
            return false;
        }
    }
	
}
