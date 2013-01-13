package exe04_Polimorfismo;

public abstract class Animal {

	protected String nome;
	protected int idade;
	protected String cor;
	
	public abstract void gritar();
	
	public abstract void andar();
	
	public void respirar(){
		System.out.println("Respirando...");
	} 
}


