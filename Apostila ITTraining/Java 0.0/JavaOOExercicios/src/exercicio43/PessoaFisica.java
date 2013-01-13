package exercicio43;

/*
 * Crie a classe PessoaFisica. Queremos ter a garantia de que pessoa f�sica alguma 
 * tenha CPF invalido, nem seja criada PessoaFisica sem cpf inicial. (voc� n�o precisa 
 * escrever o algoritmo de valida��o de cpf, basta passar o cpf por um m�todo valida(String x)....)	
 * */

public class PessoaFisica {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(valCPF(cpf))	this.cpf = cpf;
		else this.cpf= "0";
	}
	
	private boolean valCPF(String cpf){
		if(cpf==null) return false;
		if(cpf.equals("")) return false;
		return true;
	}
	
}
