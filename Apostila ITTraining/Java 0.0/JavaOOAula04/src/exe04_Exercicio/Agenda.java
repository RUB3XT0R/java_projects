package exe04_Exercicio;

import java.io.Serializable;
import java.util.HashMap;

public class Agenda implements Serializable {

	private static final long serialVersionUID = 1L;

	private HashMap<Integer, Contato> contatos;

	public Agenda() {
		contatos = new HashMap<Integer, Contato>();
	}

	public HashMap<Integer, Contato> getContatos() {
		return contatos;
	}

	public Contato getContato(Integer codigo) {
		return contatos.get(codigo);
	}

	public boolean add(Contato c) {
		if (c == null) {
			System.out.println("Contato esta vazio.");
			return false;
		}
		contatos.put(c.getCodigo(), c);
		return true;
	}

	public boolean del(Contato c) {
		if (c == null) {
			System.out.println("Contato esta vazio.");
			return false;
		}
		contatos.remove(c.getCodigo());
		return true;
	}

}
