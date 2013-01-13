package exercicio41;


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
