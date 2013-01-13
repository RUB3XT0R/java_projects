package exe02_CRUDComArquivos;

public class TesteContato {

	public static void main(String[] args) {
		
		ContatosControle c = new ContatosControle();
		c.add(new Contato(1,"Lucas","67534321"));
		c.add(new Contato(2,"Ana","87254367"));
		
		System.out.println(c.getLista());
		
		c.del(c.getContato(2));

		System.out.println(c.getLista());
		

		c.add(new Contato(2,"Ana","87254367"));
	}

}
