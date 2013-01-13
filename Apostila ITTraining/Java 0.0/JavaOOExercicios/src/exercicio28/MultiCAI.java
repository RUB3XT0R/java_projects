package exercicio28;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Sistemas mais sofisticados de  instruções auxiliadas por computador monitoram o 
 * desempenho do estudante durante um  período de  tempo.  A decisão  sobre  um  
 * novo  tópico frequentemente é baseada no sucesso  do estudante com  tópicos prévios.  
 * Modifique o programa dos  Exercícios  26 e 27  para contar o número  de  respostas corretas 
 * e incorretas digitadas  pelo  estudante.  Depois  que  o aluno  digitar  10  respostas,  
 * seu programa deve  calcular a porcentagem de respostas corretas. Se a porcentagem for  
 * inferior a 75%, exiba  “Peça  ajuda  ao  seu instrutor”  e reinicialize o programa para 
 * que outro estudante possa experimentá-lo.
 * */

public class MultiCAI {

	private Random r = new Random();
	private String[] comentsGood={"Muito  bom!","Excelente!","Bom  trabalho!","Continue  o  bom  trabalho!" };
	private String[] comentsBad={"Não.  Tente  de  novo.","Errado.  Tente  mais  uma  vez.",
			"Não  desista!","Não.  Continue  tentando." };
	
	public int makeQuestion(){
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
	    int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto é "+num1+" vezes "+num2+" ?"));
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
	        numero--; //acerto, uma vez q numero sai do laço com um a mais
	        
	        float porc = 100*acertos/numero;
			JOptionPane.showMessageDialog(null,"Sua porcentagem de acerto foi: "+porc+"%."+
	                                      ( porc<75? "\nPeça ajuda ao seu instrutor." : ""));
			
			String op = JOptionPane.showInputDialog(null,"Pronto para a próxima rodada? s/n");
			if (!op.equals("s")) break;
		}while(true);
	}
}
