package exercicio24;

/*
 * Crie uma  classe chamada Date que inclui  três  informações com variáveis de instancia - 
 * um  mês (tipo int), um  dia (tipo  int) e um  ano (tipo  int ). Sua classe deve  ter um  
 * construtor que inicializa as  três variáveis de  instância e assumir que os valores fornecidos 
 * são corretos.  Forneça um método  set  e um get para cada variável  de  instância.  Forneça um  
 * método displayDate que  exibe o mês, o dia e o ano separados por barras normais.
 * Escreva um  aplicativo  de  teste chamado DateTest que  demonstre  as  capacidades da  classe  Date.
 */

public class Date {

	private int mes;
	private int dia;
	private int ano;
	
	public String displayDate(){
		return mes+"/"+	dia+"/"+ano;	
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
