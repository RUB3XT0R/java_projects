package exercicio27;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * O uso de computadores na educa��o � referido como instru��o auxiliada por 
 * computador (CAI  computer-assisted instruction).  Um problema que  se  
 * desenvolve em ambientes CAI  � a fadiga  do  estudante. Esse problema pode 
 * ser eliminado  variando as  respostas do  computador para prender a aten��o do  
 * estudante.  Modifique o programa do  Exerc�cio 26 de  modo que os v�rios comentarios 
 * sejam exibidos para cada resposta correta e cada resposta incorreta, como segue: 
		Respostas para uma resposta correta: 
			Very  good!  [Muito  bom!] 
			Excellent!  [Excelente!] 
			Nice  work!  [Bom  trabalho!] 
			Keep  up  the  good  work!  [Continue  o  bom  trabalho!] 
		Respostas para  uma  resposta incorreta: 
			No.  Please  try  again.  [N�o.  Tente  de  novo.] 
			Wrong.  Try  once  more.  [Errado.  Tente  mais  uma  vez.]
			Don't  give  up!  [N�o  desista!] 
			No.  Keep  trying.  [N�o.  Continue  tentando.] 
	Utilize gera��o de n�meros aleat�rios para escolher um  n�mero entre 1 e 4 que 
	ser� utilizado para selecionar  uma resposta apropriada para cada resposta.  
	Utilize uma instru��o switch para emitir as  respostas.
 
 * */

public class MultiCAI {

	private Random r = new Random();
	
	private String[] comentsGood={"Muito  bom!","Excelente!","Bom  trabalho!","Continue  o  bom  trabalho!" };
	private String[] comentsBad={"N�o.  Tente  de  novo.","Errado.  Tente  mais  uma  vez.",
			"N�o  desista!","N�o.  Continue  tentando." };
	
	public void makeQuestion(){
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
		do{
			
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto � "+num1+" vezes "+num2+" ?"));
			if(resp==(num1*num2)) {
				JOptionPane.showMessageDialog(null,getRespGood());
				break;
			}else JOptionPane.showMessageDialog(null,getRespBad());
						
		}while(true);
	}
	
	public String getRespGood(){ return comentsGood[r.nextInt(4)]; }
	public String getRespBad(){ return comentsBad[r.nextInt(4)]; }
	
	public static void main(String args[]){
		MultiCAI m = new MultiCAI();
		
		do{
			m.makeQuestion();
			String op = JOptionPane.showInputDialog(null,"Pronto para a pr�xima? s/n");
			if (!op.equals("s")) break;
		}while(true);

		JOptionPane.showMessageDialog(null,"Obrigado por usar nosso Sistema!");
	}
	
}
