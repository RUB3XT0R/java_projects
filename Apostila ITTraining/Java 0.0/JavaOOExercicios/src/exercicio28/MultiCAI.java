package exercicio28;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Sistemas mais sofisticados de  instru��es auxiliadas por computador monitoram o 
 * desempenho do estudante durante um  per�odo de  tempo.  A decis�o  sobre  um  
 * novo  t�pico frequentemente � baseada no sucesso  do estudante com  t�picos pr�vios.  
 * Modifique o programa dos  Exerc�cios  26 e 27  para contar o n�mero  de  respostas corretas 
 * e incorretas digitadas  pelo  estudante.  Depois  que  o aluno  digitar  10  respostas,  
 * seu programa deve  calcular a porcentagem de respostas corretas. Se a porcentagem for  
 * inferior a 75%, exiba  �Pe�a  ajuda  ao  seu instrutor�  e reinicialize o programa para 
 * que outro estudante possa experiment�-lo.
 * */

public class MultiCAI {

	private Random r = new Random();
	private String[] comentsGood={"Muito  bom!","Excelente!","Bom  trabalho!","Continue  o  bom  trabalho!" };
	private String[] comentsBad={"N�o.  Tente  de  novo.","Errado.  Tente  mais  uma  vez.",
			"N�o  desista!","N�o.  Continue  tentando." };
	
	public int makeQuestion(){
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
	    int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto � "+num1+" vezes "+num2+" ?"));
		if(resp==(num1*num2)) {
				JOptionPane.showMessageDialog(null,getRespGood());
				return 1;
		}
	    JOptionPane.showMessageDialog(null,getRespBad());
		return 0;
	}
	
	public String getRespGood(){ return comentsGood[r.nextInt(4)]; }
	public String getRespBad(){ return comentsBad[r.nextInt(4)]; }
	
	public static void main(String args[]){
		MultiCAI m = new MultiCAI();
		do{
			int numero=0; //numero de questoes
			int acertos=0; //numero de acertos
			
			do{
				acertos += m.makeQuestion();
				numero++;
				if (numero>10) break;
			}while(true);
	        numero--; //acerto, uma vez q numero sai do la�o com um a mais
	        
	        float porc = 100*acertos/numero;
			JOptionPane.showMessageDialog(null,"Sua porcentagem de acerto foi: "+porc+"%."+
	                                      ( porc<75? "\nPe�a ajuda ao seu instrutor." : ""));
			
			String op = JOptionPane.showInputDialog(null,"Pronto para a pr�xima rodada? s/n");
			if (!op.equals("s")) break;
		}while(true);
	}
}
